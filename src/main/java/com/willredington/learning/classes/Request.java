package com.willredington.learning.classes;

public class Request {

  private final RequestType type;

  private final String payload;


  public Request(RequestType type, String payload) {
    this.type = type;
    this.payload = payload;
  }

  public RequestType getType() {
    return type;
  }

  public String getPayload() {
    return payload;
  }
}
