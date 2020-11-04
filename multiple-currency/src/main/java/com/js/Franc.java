package com.js;

public class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  @Override
  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }
}
