/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.exception;

import com.atomicspaj.model.Issue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/** The type Global exception handler. */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  /**
   * Handle ideal service exception response entity.
   *
   * @param idealServiceException the ideal service exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(IdealServiceException.class)
  public final ResponseEntity<Issue> handleIdealServiceException(
      IdealServiceException idealServiceException, WebRequest request) {
    log.error(
        "Exception occurred due to {} and the details are {}",
        idealServiceException.getMessage(),
        idealServiceException);
    return new ResponseEntity<>(
        idealServiceException.getIssue(), idealServiceException.getHttpStatus());
  }

  /**
   * Handle generic exceptions response entity.≤
   *
   * @param exception the exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(Exception.class)
  public final ResponseEntity<Issue> handleGenericExceptions(Exception exception, WebRequest request) {
    log.error(
        "Generic exception has occurred {} and the details are", exception.getMessage(), exception);
    Issue issue =
        Issue.builder()
            .errorCode("1000")
            .errorMessage("Something went wrong")
            .errorReason(exception.getMessage())
            .errorAction(
                "Internal server error occurred check with ")
            .build();
    return new ResponseEntity<>(issue, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
