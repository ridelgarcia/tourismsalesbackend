package com.tourism.sales.model.reservation;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.agency.Vendor;
import com.tourism.sales.model.common.BaseEntity;
import com.tourism.sales.model.common.Date;
import com.tourism.sales.model.common.Person;
import com.tourism.sales.model.hotel.RoomType;

@Entity
@Table(name = "[reservation]")
public class Reservation extends BaseEntity{

  @ManyToOne
  private Date from;
  
  @ManyToOne
  private Date to;
  
  @NotNull
  @Column(name = "reference")
  private String reference;
  
  @ManyToOne
  private Vendor vendor;
  
  @ManyToOne
  private Person owner;
  
  @ManyToOne
  private ReservationState state;
  
  @ManyToOne
  private RoomType roomType;
  
  @NotNull
  @Column(name = "observations")
  private String observations;

  public Reservation() {
    super();
  }

  public Reservation(String id, Instant createdAt, Instant modifiedAt, int version,
      Date from, Date to, @NotNull String reference, Vendor vendor, Person owner,
      ReservationState state, RoomType roomType, @NotNull String observations) {
    super(id,createdAt,modifiedAt,version);
    this.from = from;
    this.to = to;
    this.reference = reference;
    this.vendor = vendor;
    this.owner = owner;
    this.state = state;
    this.roomType = roomType;
    this.observations = observations;
  }

  public Date getFrom() {
    return from;
  }

  public void setFrom(Date from) {
    this.from = from;
  }

  public Date getTo() {
    return to;
  }

  public void setTo(Date to) {
    this.to = to;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Vendor getVendor() {
    return vendor;
  }

  public void setVendor(Vendor vendor) {
    this.vendor = vendor;
  }

  public Person getOwner() {
    return owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public ReservationState getState() {
    return state;
  }

  public void setState(ReservationState state) {
    this.state = state;
  }

  public RoomType getRoomType() {
    return roomType;
  }

  public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
  }

  public String getObservations() {
    return observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  @Override
  public String toString() {
    return "Reservation [from=" + from.toString() + ", to=" + to.toString() + ", reference=" + reference + ", vendor="
        + vendor.toString() + ", owner=" + owner.toString() + ", state=" + state.toString() + ", roomType=" + roomType.toString()
        + ", observations=" + observations + ", id=" + id + ", createdAt=" + createdAt
        + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }
  
  
  
  
}
