package com.js;

import org.junit.jupiter.api.Test;

public class MoneyTest {

  @Test
  public void testMultiplicationn() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}
