package com.js;

public abstract class Money {

  protected String currency;
  protected int amount;

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  abstract Money times(int multiplier);

  String currency() {
    return currency;
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
