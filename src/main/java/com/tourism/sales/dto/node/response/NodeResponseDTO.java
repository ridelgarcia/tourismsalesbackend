package com.tourism.sales.dto.node.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;

public class NodeResponseDTO extends APIResponseDTO{
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String id;

  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String name;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected NodeType type;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected String parentId;
  
  @JsonProperty(required = true)
  @NotEmpty
  @NotBlank
  protected LocationResponseDTO location;

  public NodeResponseDTO() {
    super();
  }

  public NodeResponseDTO(int errorCode, String errorDescription,String id,String name,
      NodeType type,String parentId,LocationResponseDTO location) {
    super(errorCode, errorDescription);
    this.id = id;
    this.name = name;
    this.type = type;
    this.parentId = parentId;
    this.location = location;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeType getType() {
    return type;
  }

  public void setType(NodeType type) {
    this.type = type;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public LocationResponseDTO getLocation() {
    return location;
  }

  public void setLocation(LocationResponseDTO location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "NodeResponseDTO [id=" + id + ", name=" + name + ", type=" + type + ", parentId="
        + parentId + ", location=" + location.toString() + ", errorCode=" + errorCode + ", errorDescription="
        + errorDescription + "]";
  }
  
  
}
