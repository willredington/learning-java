package com.willredington.learning.classes;

import java.util.Arrays;
import java.util.List;

public class Main {

  /*
  * Scenario 1: create a program that processes incoming requests
  *
  *
  * There are currently three request types: JSON, Plain text, and base64
  *
  * There should be handlers that can only process a specific request type (JSON, Plain text.etc)
  *
  * Each handle should check to see if it can process the request, and then log the payload in readable text
  *
  */
  public static void main(String[] args) {

    Request jsonRequest = new Request(RequestType.JSON, "{\"name\":\"john\",\"age\":22,\"class\":\"mca\"}");
    Request plainRequest = new Request(RequestType.PLAIN_TEXT, "hello world");
    Request base64Request = new Request(RequestType.BASE_64, "aGVsbG8gd29ybGQ=");

    List<Request> requests = Arrays.asList(jsonRequest, plainRequest, base64Request);

    // TODO: process requests
  }
}
