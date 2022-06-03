package com.tourism.sales.services.agency;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.agency.request.CreateBureauRequestDTO;
import com.tourism.sales.dto.agency.response.BureauResponseDTO;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.location.request.CreateLocationRequestDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.model.agency.Bureau;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.repositories.agency.BureauRepository;
import com.tourism.sales.services.location.LocationService;

@Service
public class BureauService {

  private static final ModelMapper modelMapper = new ModelMapper();
  
  @Autowired
  private BureauRepository bureauRep;
  
  @Autowired
  private LocationService locationSrv;
  
  public APIResponseDTO createBureau(CreateBureauRequestDTO createDto) {
    APIResponseDTO response = null;
    try {      
      CreateLocationRequestDTO createLoc = new CreateLocationRequestDTO(createDto.getLocation());
      APIResponseDTO res = locationSrv.createLocation(createLoc);
      if(res.getErrorCode() == 0) {
        Location location = modelMapper.map((LocationResponseDTO)res, Location.class);
        Bureau bureau = modelMapper.map(createDto, Bureau.class);
        bureau.setLocation(location);
        bureauRep.save(bureau);
        response = modelMapper.map(bureau, BureauResponseDTO.class);
      }
    }
    catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode, e.getMessage());
    }
    return response;
  }
}
