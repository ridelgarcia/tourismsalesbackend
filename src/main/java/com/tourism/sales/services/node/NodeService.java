package com.tourism.sales.services.node;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tourism.sales.dto.common.response.APIResponseDTO;
import com.tourism.sales.dto.node.request.CreateNodeRequestDTO;
import com.tourism.sales.dto.node.response.NodeResponseDTO;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.model.place.Node;
import com.tourism.sales.repositories.place.NodeRepository;

@Service
public class NodeService {

  private static final ModelMapper modelMapper = new ModelMapper();
  
  @Autowired
  private NodeRepository nodeRep;
  
  APIResponseDTO createNode(CreateNodeRequestDTO request) {
    APIResponseDTO response = null;
    try {      
      Node node = new Node();
      node.setName(request.getName());
      node.setParentId(request.getParentId());
      node.setType(request.getType());
      Location location = new Location(request.getLocation());
      node.setLocation(location);
      nodeRep.save(node);
      response = modelMapper.map(node, NodeResponseDTO.class);
      
    }
    catch (Exception e) {
      response = new APIResponseDTO(APIResponseDTO.exceptionCode,e.getMessage());      
    }
    return response;
  }
}
