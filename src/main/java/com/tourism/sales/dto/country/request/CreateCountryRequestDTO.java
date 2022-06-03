package com.tourism.sales.dto.country.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.node.request.CreateNodeRequestDTO;

public class CreateCountryRequestDTO extends CreateNodeRequestDTO{

  public CreateCountryRequestDTO() {
    super();
    setType(NodeType.COUNTRY);
  }

  public CreateCountryRequestDTO(@NotEmpty @NotBlank String name,
      @NotEmpty @NotBlank String location, @NotEmpty @NotBlank String parentId) {
    super(name, location, parentId, NodeType.COUNTRY);
    
  }

  @Override
  public String toString() {
    return "CreateCountryRequestDTO []";
  }
  
}
