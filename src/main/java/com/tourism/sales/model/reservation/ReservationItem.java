package com.tourism.sales.model.reservation;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.tourism.sales.model.common.BaseEntity;
import com.tourism.sales.model.hotel.RoomUse;

@Entity
@Table(name = "[reservationitem]")
public class ReservationItem extends BaseEntity{

  @ManyToOne
  private Reservation reservation;
  
  @ManyToOne
  private RoomUse roomUse;

  public ReservationItem() {
    super();
  }

  public ReservationItem(String id, Instant createdAt, Instant modifiedAt, int version,
      Reservation reservation,RoomUse roomUse) {
    super(id, createdAt, modifiedAt, version);
    this.reservation = reservation;
    this.roomUse = roomUse;
  }

  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  public RoomUse getRoomUse() {
    return roomUse;
  }

  public void setRoomUse(RoomUse roomUse) {
    this.roomUse = roomUse;
  }

  @Override
  public String toString() {
    return "ReservationItem [reservation=" + reservation.toString() + ", roomUse=" + roomUse.toString() + ", id=" + id
        + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }
  
  
  
}
