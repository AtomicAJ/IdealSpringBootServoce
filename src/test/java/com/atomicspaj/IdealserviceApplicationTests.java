/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/** The type Idealservice application tests. */
@SpringBootTest
class IdealserviceApplicationTests {

  /** Context loads. */
  @Test
  void contextLoads() {
    String test = "test";
    Assertions.assertEquals("test", test);
  }
}
