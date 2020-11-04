package com.js;

public class Franc extends Money {

  Franc(int amount) {
    this.amount = amount;
    currency = "CHF";
  }

  @Override
  Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
