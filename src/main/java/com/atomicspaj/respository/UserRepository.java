/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.respository;

import com.atomicspaj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/** The interface User repository. */
public interface UserRepository extends JpaRepository<User, Long> {}
