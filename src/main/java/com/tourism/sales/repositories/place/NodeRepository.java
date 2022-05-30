package com.tourism.sales.repositories.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.place.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node, String>{

}
