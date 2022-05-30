package com.tourism.sales.repositories.hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.hotel.RoomType;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, String>{

}
