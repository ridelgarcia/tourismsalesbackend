package com.tourism.sales.dto.agency.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.node.request.CreateNodeRequestDTO;

public class CreateTravelAgencyRequestDTO extends CreateNodeRequestDTO{

  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String phone;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String email;

  public CreateTravelAgencyRequestDTO() {
    super();
  }

  public CreateTravelAgencyRequestDTO(@NotEmpty @NotBlank String name,
      @NotEmpty @NotBlank String location, @NotEmpty @NotBlank String parentId,
      @NotEmpty @NotBlank NodeType type,@NotEmpty @NotBlank String phone,
      @NotEmpty @NotBlank String email) {
    super(name, location, parentId, type);
    this.phone = phone;
    this.email = email;
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
    return "CreateTravelAgencyRequestDTO [phone=" + phone + ", email=" + email + ", name=" + name
        + ", location=" + location + ", parentId=" + parentId + ", type=" + type + "]";
  }  
}
