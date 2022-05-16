/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.controller;

import com.atomicspaj.exception.IdealServiceException;
import com.atomicspaj.model.Issue;
import com.atomicspaj.model.User;
import com.atomicspaj.model.designrequest.ConvertRequestData;
import com.atomicspaj.model.designresponse.DesignResponseData;
import com.atomicspaj.model.mapstruct.MapperRequest;
import com.atomicspaj.model.mapstruct.MapperResponse;
import com.atomicspaj.model.mapstruct.MapperResponseReq;
import com.atomicspaj.service.DesignMapper;
import com.atomicspaj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** The type User controller. */
@Slf4j
@RestController
public class UserController {

  /** The User service. */
  @Autowired UserService userService;

  /**
   * Add user response entity.
   *
   * @param user the user
   * @return response entity
   */
  @PostMapping("/api/users")
  public ResponseEntity<Object> addUser(@RequestBody User user) {
    try {
      log.info("Adding user request received {}", user.getFirstName());
      log.debug("Add user API invoked with request: {}", user);
      userService.addUser(user);
      log.info("Added the user {} successfully", user.getFirstName());
      return new ResponseEntity<>("Created", HttpStatus.CREATED);
    } catch (Exception exception) {
      Issue issue =
          Issue.builder()
              .errorCode("1000")
              .errorMessage("Something went wrong")
              .errorReason(exception.getMessage())
              .errorAction(
                  "Connection to service like DB could be lost, service connection to be checked")
              .build();
      throw new IdealServiceException(
          issue, HttpStatus.INTERNAL_SERVER_ERROR, "InternalError", exception);
    }
  }

  /**
   * Add user via kafka response entity.
   *
   * @param user the user
   * @return the response entity
   */
  @PostMapping("/api/users/message")
  public ResponseEntity<Object> addUserViaKafka(@RequestBody User user) {
    try {
      log.info("Post user request to kafka received {}", user.getFirstName());
      log.debug("Post user request to kafka API invoked with request: {}", user);
      userService.addUserViaMessage(user);
      log.info("Posted the user message {} successfully", user.getFirstName());
      return new ResponseEntity<>("Created", HttpStatus.CREATED);
    } catch (Exception exception) {
      Issue issue =
          Issue.builder()
              .errorCode("1000")
              .errorMessage("Something went wrong")
              .errorReason(exception.getMessage())
              .errorAction(
                  "Connection to service like DB could be lost, service connection to be checked")
              .build();
      throw new IdealServiceException(
          issue, HttpStatus.INTERNAL_SERVER_ERROR, "InternalError", exception);
    }
  }

  private DesignMapper mapper
          = Mappers.getMapper(DesignMapper.class);

  @GetMapping("/testMappingDirect")
  public ResponseEntity<MapperResponseReq> testMapperSameController()
  {
      MapperResponseReq responseData = mapper.testSameMapper(new MapperRequest());
      return new ResponseEntity<MapperResponseReq>(responseData,HttpStatus.OK);

  }

  @GetMapping("/testMapping")
  public ResponseEntity<MapperResponse> testMapperController()
  {
    MapperResponse responseData = mapper.testMapper(new MapperRequest());
    return new ResponseEntity<MapperResponse>(responseData,HttpStatus.OK);

  }

  @GetMapping("/mapping")
  public ResponseEntity<DesignResponseData> testMapping()
  {
    DesignResponseData responseData = mapper.designReqToResMapper(new ConvertRequestData());
    return new ResponseEntity<DesignResponseData>(responseData,HttpStatus.OK);

  }
}
