package com.tourism.sales.repositories.hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.hotel.RoomUse;

@Repository
public interface RoomUseRepository extends JpaRepository<RoomUse, String>{

}
