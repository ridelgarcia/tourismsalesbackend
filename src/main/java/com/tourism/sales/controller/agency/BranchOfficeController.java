package com.tourism.sales.controller.agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tourism.sales.dto.agency.request.CreateBranchOfficeRequestDTO;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.services.agency.BranchOfficeService;


@CrossOrigin
@RestController
@RequestMapping("/branchoffice")
public class BranchOfficeController {

  @Autowired
  private BranchOfficeService branchOfficeSrv;

  @RequestMapping(value = "/create",method = RequestMethod.POST)
  public ResponseEntity<?> create(@RequestBody  CreateBranchOfficeRequestDTO request) {     
      try {
          APIResponseDTO response = branchOfficeSrv.createBranchOffice(request);
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.OK);
      }
      catch (Exception e) {
          APIResponseDTO response = new APIResponseDTO(APIResponseDTO.exceptionCode,e.getMessage());
          return new ResponseEntity<APIResponseDTO>(response,HttpStatus.BAD_REQUEST);
      }        
  }
}
