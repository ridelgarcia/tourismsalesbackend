package com.tourism.sales.dto.location.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateLocationRequestDTO {

  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  private String location;

  public CreateLocationRequestDTO() {
    
  }

  public CreateLocationRequestDTO(@NotEmpty @NotBlank String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "CreateLocationRequestDTO [location=" + location + "]";
  }
  
  
  
  
}
