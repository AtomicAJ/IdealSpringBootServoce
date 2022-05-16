/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.service;

import com.atomicspaj.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

/** The type User listener service. */
@Slf4j
public class UserListenerService {

  /** The Object mapper. */
  @Autowired ObjectMapper objectMapper;

  /**
   * Listen group foo.
   *
   * @param data the data
   */
  @KafkaListener(topics = "ajtest", groupId = "demoGroupId")
  public void listenGroupFoo(Object data) {
    User user = (User) data;
    log.info("Received Message in group foo: " + user.toString());
  }
}
