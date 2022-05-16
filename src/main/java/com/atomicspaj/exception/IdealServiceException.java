/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.exception;

import com.atomicspaj.model.Issue;
import lombok.*;
import org.springframework.http.HttpStatus;

/** The type Ideal service exception. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class IdealServiceException extends RuntimeException {
  private static final long serialVersionUID = 8317138060960108967L;
  private HttpStatus httpStatus;
  private Issue issue;

  /**
   * Instantiates a new Ideal service exception.
   *
   * @param issue the issue
   * @param httpStatus the http status
   * @param message the message
   * @param throwable the throwable
   */
  public IdealServiceException(
      Issue issue, HttpStatus httpStatus, String message, Throwable throwable) {
    super(message, throwable);
    this.issue = issue;
    this.httpStatus = httpStatus;
  }
}
