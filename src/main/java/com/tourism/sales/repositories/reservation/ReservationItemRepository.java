package com.tourism.sales.repositories.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.reservation.ReservationItem;

@Repository
public interface ReservationItemRepository extends JpaRepository<ReservationItem, String>{

}
