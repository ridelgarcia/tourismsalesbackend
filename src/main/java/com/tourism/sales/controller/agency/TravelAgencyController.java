package com.tourism.sales.controller.agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tourism.sales.dto.agency.request.CreateTravelAgencyRequestDTO;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.services.agency.TravelAgencyService;


@CrossOrigin
@RestController
@RequestMapping("/travelagency")
public class TravelAgencyController {

  @Autowired
  private TravelAgencyService travelAgencySrv;

  @RequestMapping(value = "/create",method = RequestMethod.POST)
  public ResponseEntity<?> create(@RequestBody  CreateTravelAgencyRequestDTO request) {     
      try {
          APIResponseDTO response = travelAgencySrv.createTravelAgency(request);
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.OK);
      }
      catch (Exception e) {
          APIResponseDTO response = new APIResponseDTO(APIResponseDTO.exceptionCode,e.getMessage());
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.BAD_REQUEST);
      }        
  }
}
