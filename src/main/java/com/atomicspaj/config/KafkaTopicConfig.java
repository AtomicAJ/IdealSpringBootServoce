/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

/** The type Kafka topic config. */
public class KafkaTopicConfig {
  @Value(value = "${kafka.bootstrapAddress}")
  private String bootstrapAddress;

  /**
   * Kafka admin kafka admin.
   *
   * @return the kafka admin
   */
  @Bean
  public KafkaAdmin kafkaAdmin() {
    Map<String, Object> configs = new HashMap<>();
    configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
    return new KafkaAdmin(configs);
  }

  /**
   * Topic 1 new topic.
   *
   * @return the new topic
   */
  @Bean
  public NewTopic topic1() {
    return new NewTopic("ajtest", 1, (short) 1);
  }
}
