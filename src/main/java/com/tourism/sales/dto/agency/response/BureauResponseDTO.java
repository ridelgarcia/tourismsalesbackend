package com.tourism.sales.dto.agency.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.dto.node.response.NodeResponseDTO;

public class BureauResponseDTO extends NodeResponseDTO{

  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String phone;

  public BureauResponseDTO() {
    super();
  }

  public BureauResponseDTO(int errorCode, String errorDescription, String id, String name,
      NodeType type, String parentId, LocationResponseDTO location,@NotEmpty @NotBlank String phone) {
    super(errorCode, errorDescription, id, name, type, parentId, location);
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "BureauResponseDTO [phone=" + phone + ", id=" + id + ", name=" + name + ", type=" + type
        + ", parentId=" + parentId + ", location=" + location + ", errorCode=" + errorCode
        + ", errorDescription=" + errorDescription + "]";
  }  
}
