package com.tourism.sales.dto.country.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.dto.node.request.CreateNodeRequestDTO;

public class CreateCountryRequestDTO extends CreateNodeRequestDTO{

  public CreateCountryRequestDTO() {
    super();
    
  }

  public CreateCountryRequestDTO(@NotEmpty @NotBlank String name,
      @NotEmpty @NotBlank String location, @NotEmpty @NotBlank String parentId,
      @NotEmpty @NotBlank NodeType type) {
    super(name, location, parentId, type);
    
  }

  @Override
  public String toString() {
    return "CreateCountryRequestDTO []";
  }
  
}
