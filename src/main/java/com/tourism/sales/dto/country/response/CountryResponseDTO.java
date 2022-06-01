package com.tourism.sales.dto.country.response;

import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.dto.node.response.NodeResponseDTO;

public class CountryResponseDTO extends NodeResponseDTO{

  public CountryResponseDTO() {
    super();
    
  }

  public CountryResponseDTO(int errorCode, String errorDescription, String id, String name,
      NodeType type, String parentId, LocationResponseDTO location) {
    super(errorCode, errorDescription, id, name, type, parentId, location);
    
  }

  @Override
  public String toString() {
    return "CountryResponseDTO [id=" + id + ", name=" + name + ", type=" + type + ", parentId="
        + parentId + ", location=" + location + ", errorCode=" + errorCode + ", errorDescription="
        + errorDescription + "]";
  }

  
}
