package com.tourism.sales.repositories.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.country.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, String>{

}
