package com.tourism.sales.dto.agency.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.dto.node.response.NodeResponseDTO;

public class BranchOfficeResponseDTO extends NodeResponseDTO{

  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  private String phone;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  private String email;

  public BranchOfficeResponseDTO() {
    super();
  }

  public BranchOfficeResponseDTO(int errorCode, String errorDescription, String id, String name,
      NodeType type, String parentId, LocationResponseDTO location,@NotEmpty @NotBlank String phone,
      @NotEmpty @NotBlank String email) {
    super(errorCode, errorDescription, id, name, type, parentId, location);
    this.email = email;
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "BranchOfficeResponseDTO [phone=" + phone + ", email=" + email + ", id=" + id + ", name="
        + name + ", type=" + type + ", parentId=" + parentId + ", location=" + location
        + ", errorCode=" + errorCode + ", errorDescription=" + errorDescription + "]";
  }  
}
