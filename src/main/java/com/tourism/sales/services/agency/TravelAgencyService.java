package com.tourism.sales.services.agency;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.agency.request.CreateTravelAgencyRequestDTO;
import com.tourism.sales.dto.agency.response.TravelAgencyResponseDTO;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.location.request.CreateLocationRequestDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.model.agency.TravelAgency;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.repositories.agency.TravelAgencyRepository;
import com.tourism.sales.services.location.LocationService;

@Service
public class TravelAgencyService {

  private static final ModelMapper modelMapper = new ModelMapper();
  
  @Autowired
  private TravelAgencyRepository travelAgencyRep;
  
  @Autowired
  private LocationService locationSrv;
  
  public APIResponseDTO createTravelAgency(CreateTravelAgencyRequestDTO createDto) {
    APIResponseDTO response = null;
    try {
      CreateLocationRequestDTO createLoc = new CreateLocationRequestDTO(createDto.getLocation());
      APIResponseDTO res = locationSrv.createLocation(createLoc);
      if(res.getErrorCode() == 0) {
        Location location = modelMapper.map((LocationResponseDTO)res, Location.class);
        TravelAgency agency = modelMapper.map(createDto, TravelAgency.class);
        agency.setLocation(location);
        travelAgencyRep.save(agency);
        response = modelMapper.map(agency, TravelAgencyResponseDTO.class);        
      }
      else
        throw new Exception(res.getErrorDescription());
    }
    catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode,e.getMessage());
    }
    return response;
  }
}
