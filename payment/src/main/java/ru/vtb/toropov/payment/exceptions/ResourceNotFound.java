package ru.vtb.toropov.payment.exceptions;

/**
 * ResourceNotFound.
 *
 * @author DToropov
 */
public class ResourceNotFound extends RuntimeException{
  private final String code;

  public String getCode() {
    return code;
  }
  public ResourceNotFound(String code, String message) {
    super(message);
    this.code = code;
  }
}
