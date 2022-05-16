/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.service;

import com.atomicspaj.exception.IdealServiceException;
import com.atomicspaj.model.Issue;
import com.atomicspaj.model.User;
import com.atomicspaj.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/** The type User service. */
@Service
public class UserServiceImpl implements UserService {

  /** The User repository. */
  @Autowired UserRepository userRepository;

  @Autowired private KafkaTemplate<String, Object> kafkaTemplate;

  @Override
  public User addUser(User user) {
    try {
      return userRepository.save(user);
    } catch (Exception exception) {
      Issue issue =
          Issue.builder()
              .errorCode("1001")
              .errorMessage("Unable to save data to DB")
              .errorReason(exception.getLocalizedMessage())
              .errorAction(
                  "Connection to service like DB could be lost, service connection to be checked")
              .build();
      throw new IdealServiceException(
          issue, HttpStatus.INTERNAL_SERVER_ERROR, "DB Error", exception);
    }
  }

  @Override
  public void addUserViaMessage(User user) {
    try {
      kafkaTemplate.send("ajtest", user);
    } catch (Exception exception) {
      // TODO catch excpetion and send the details
    }
  }
}
