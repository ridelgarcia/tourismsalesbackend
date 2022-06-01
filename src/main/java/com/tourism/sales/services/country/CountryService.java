package com.tourism.sales.services.country;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.country.request.CreateCountryRequestDTO;
import com.tourism.sales.dto.country.response.CountryResponseDTO;
import com.tourism.sales.dto.location.request.CreateLocationRequestDTO;
import com.tourism.sales.dto.location.response.LocationResponseDTO;
import com.tourism.sales.model.country.Country;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.repositories.country.CountryRepository;
import com.tourism.sales.services.location.LocationService;

@Service
public class CountryService {
  
  private static final ModelMapper modelMapper = new ModelMapper();

  @Autowired
  private CountryRepository countryRep;
  
  @Autowired
  private LocationService locationSrv;
  
  public APIResponseDTO createCountry(CreateCountryRequestDTO createDto) {
    APIResponseDTO response = null;
    try {
      if(countryRep.findByName(createDto.getName()).isEmpty()) {
        CreateLocationRequestDTO createLoc = new CreateLocationRequestDTO(createDto.getLocation());
        APIResponseDTO res = locationSrv.createLocation(createLoc);
        if(res.getErrorCode() == 0) {
          Location location = modelMapper.map((LocationResponseDTO)res, Location.class);
          Country country = new Country();
          country.setName(createDto.getName());
          country.setParentId(createDto.getParentId());
          country.setLocation(location);
          countryRep.save(country);
          response = modelMapper.map(country, CountryResponseDTO.class);        
        }
        else
          throw new Exception(res.getErrorDescription());
      }
      else {
        throw new Exception("The specified country already exist");
      }
        
        
    }catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode, e.getMessage());
    }
    
    return response;
  }
}
