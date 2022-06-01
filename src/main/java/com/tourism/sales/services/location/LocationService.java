package com.tourism.sales.services.location;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.location.request.CreateLocationRequestDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.repositories.place.LocationRepository;

@Service
public class LocationService {

  private static final ModelMapper modelMapper = new ModelMapper();
  
  @Autowired
  private LocationRepository locationRep;
  
  public APIResponseDTO createLocation(CreateLocationRequestDTO request) {
    APIResponseDTO response = null;
    try {
      Location location = modelMapper.map(request, Location.class);
      locationRep.save(location);
      response = new LocationResponseDTO(APIResponseDTO.successCode,APIResponseDTO.successText,location.getId(),location.getLocation());
    }
    catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode,e.getMessage());
    }
    return response;
  }
}
