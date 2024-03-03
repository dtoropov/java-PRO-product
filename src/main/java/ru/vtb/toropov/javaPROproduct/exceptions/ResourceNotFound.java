package ru.vtb.toropov.javaPROproduct.exceptions;

/**
 * ResourceNotFound.
 *
 * @author DToropov
 */
public class ResourceNotFound extends RuntimeException{
  public ResourceNotFound(String message) {
    super(message);
  }
}
