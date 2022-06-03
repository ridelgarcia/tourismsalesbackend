package com.tourism.sales.dto.agency.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.node.request.CreateNodeRequestDTO;

public class CreateBureauRequestDTO extends CreateNodeRequestDTO{
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String phone;

  public CreateBureauRequestDTO() {
    super();
  }

  public CreateBureauRequestDTO(@NotEmpty @NotBlank String name,
      @NotEmpty @NotBlank String location, @NotEmpty @NotBlank String parentId,
      @NotEmpty @NotBlank NodeType type,@NotEmpty @NotBlank String phone) {
    super(name, location, parentId, type);
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
    return "CreateBureauRequestDTO [phone=" + phone + ", name=" + name + ", location=" + location
        + ", parentId=" + parentId + ", type=" + type + "]";
  }
}
