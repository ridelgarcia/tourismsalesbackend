package com.tourism.sales.services.agency;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.agency.request.CreateBranchOfficeRequestDTO;
import com.tourism.sales.dto.agency.response.BranchOfficeResponseDTO;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.location.request.CreateLocationRequestDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.model.agency.BranchOffice;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.repositories.agency.BranchOfficeRepository;
import com.tourism.sales.services.location.LocationService;

@Service
public class BranchOfficeService {

  private static final ModelMapper modelMapper = new ModelMapper();
  
  @Autowired
  private BranchOfficeRepository branchOfficeRep;
  
  @Autowired
  private LocationService locationSrv;
  
  public APIResponseDTO createBranchOffice(CreateBranchOfficeRequestDTO createDto) {
    APIResponseDTO response = null;
    try {      
      CreateLocationRequestDTO createLoc = new CreateLocationRequestDTO(createDto.getLocation());
      APIResponseDTO res = locationSrv.createLocation(createLoc);
      if(res.getErrorCode() == 0) {
        Location location = modelMapper.map((LocationResponseDTO)res, Location.class);
        BranchOffice office = modelMapper.map(createDto, BranchOffice.class);
        office.setLocation(location);
        branchOfficeRep.save(office);
        response = modelMapper.map(office, BranchOfficeResponseDTO.class);
      }
    }
    catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode, e.getMessage());
    }
    return response;
  }
}
