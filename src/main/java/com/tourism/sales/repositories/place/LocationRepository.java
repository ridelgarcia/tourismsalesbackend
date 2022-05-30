package com.tourism.sales.repositories.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.place.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String>{

}
