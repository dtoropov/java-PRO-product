package ru.vtb.toropov.javaPROproduct.exceptions;

/**
 * MoneyNotEnough.
 *
 * @author DToropov
 */
public class MoneyNotEnough extends RuntimeException {
  public MoneyNotEnough(String message) {
    super(message);
  }
}
