package com.tourism.sales.controller.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.country.request.CreateCountryRequestDTO;
import com.tourism.sales.services.country.CountryService;

@CrossOrigin
@RestController
@RequestMapping("/country")
public class CountryController {
  
  @Autowired
  private CountryService countrySrv;

  @RequestMapping(value = "/create",method = RequestMethod.POST)
  public ResponseEntity<?> create(@RequestBody  CreateCountryRequestDTO request) {     
      try {
          APIResponseDTO response = countrySrv.createCountry(request);
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.OK);
      }
      catch (Exception e) {
          APIResponseDTO response = new APIResponseDTO(1,e.getMessage());
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.BAD_REQUEST);
      }        
  }
}
