package com.tourism.sales.dto.node.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;

public class CreateNodeRequestDTO {
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String name;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String location;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String parent;
  
  @JsonIgnore
  private NodeType type;

  public CreateNodeRequestDTO() {
    super();
  }

  public CreateNodeRequestDTO(@NotEmpty @NotBlank String name, @NotEmpty @NotBlank String location,
      @NotEmpty @NotBlank String parent,@NotEmpty @NotBlank NodeType type) {
    super();
    this.name = name;
    this.location = location;
    this.parent = parent;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getParent() {
    return parent;
  }

  public void setParentId(String parent) {
    this.parent = parent;
  }

  public NodeType getType() {
    return type;
  }

  public void setType(NodeType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CreateNodeRequestDTO [name=" + name + ", location=" + location + ", parentId="
        + parent + ", type=" + type + "]";
  } 

}
