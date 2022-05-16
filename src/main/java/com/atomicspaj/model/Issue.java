/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/** The type Issue. */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Issue implements Serializable {

  private static final long serialVersionUID = -3240750302024631082L;
  private String errorCode;

  private String errorMessage;

  private String errorReason;

  private String errorAction;
}
