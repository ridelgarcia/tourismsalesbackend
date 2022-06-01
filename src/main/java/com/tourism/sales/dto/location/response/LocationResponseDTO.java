package com.tourism.sales.dto.location.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.dto.common.response.APIResponseDTO;

public class LocationResponseDTO extends APIResponseDTO{
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  private String id;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  private String location;

  public LocationResponseDTO() {
    super();
  }

  public LocationResponseDTO(int errorCode, String errorDescription,String id,String location) {
    super(errorCode, errorDescription);
    this.id = id;
    this.location = location;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "CreateLocationResponseDTO [id=" + id + ", location=" + location + "]";
  }
}
