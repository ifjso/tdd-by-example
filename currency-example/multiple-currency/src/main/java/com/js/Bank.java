package com.js;

import java.util.Hashtable;

public class Bank {

  private final Hashtable<Pair, Integer> rates = new Hashtable<>();

  Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  int rate(String from, String to) {
    if (from.equals(to)) {
      return 1;
    }

    return rates.get(new Pair(from, to));
  }

  void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }

  private static class Pair {
    private final String from;
    private final String to;

    Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public boolean equals(Object obj) {
      Pair pair = (Pair) obj;
      return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
      return 0;
    }
  }
}
