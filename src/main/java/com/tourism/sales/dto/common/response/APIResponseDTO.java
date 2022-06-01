package com.tourism.sales.dto.common.response;

public class APIResponseDTO {
  
  static public final String successText = "SUCCESS";
  
  static public final int successCode = 0;
  static public final int exceptionCode = 1;
  
  protected int errorCode;
  
  protected String errorDescription;
  
  public APIResponseDTO() {
      this.errorCode = 0;
      this.errorDescription = successText;
  }

  public APIResponseDTO(int errorCode, String errorDescription) {
      this.errorCode = errorCode;
      this.errorDescription = errorDescription;
  }

  public int getErrorCode() {
      return errorCode;
  }

  public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
  }

  public String getErrorDescription() {
      return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
      this.errorDescription = errorDescription;
  }

  @Override
  public String toString() {
      return "GenericResponseDTO [errorCode=" + errorCode + ", errorDescription=" + errorDescription + "]";
  }   
}

