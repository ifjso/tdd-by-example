package com.js;

public class Money implements Expression {

  protected String currency;
  protected int amount;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  String currency() {
    return currency;
  }

  @Override
  public Money reduce(String to) {
    return this;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
