/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.service;

import com.atomicspaj.model.User;

/** The interface User service. */
public interface UserService {

  /**
   * Add user user.
   *
   * @param user the user
   * @return the user
   */
  User addUser(User user);

  /**
   * Add user via message.
   *
   * @param user the user
   */
  void addUserViaMessage(User user);
}
