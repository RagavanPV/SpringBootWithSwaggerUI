package com.ragavan.controller.response;

public class ServiceResponse {
  private String statusCode;
  private String description;
  private Object data;
  public String getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  public ServiceResponse(String statusCode, String description, Object data) {
    super();
    this.statusCode = statusCode;
    this.description = description;
    this.data = data;
  }
}
