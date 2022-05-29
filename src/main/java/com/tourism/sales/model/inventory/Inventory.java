package com.tourism.sales.model.inventory;

import java.util.Date;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;
import com.tourism.sales.model.hotel.RoomType;
import com.tourism.sales.model.place.Node;

@Entity
@Table(name = "[inventory]")
public class Inventory extends BaseEntity{

  @NotNull
  @Column(name = "name")
  private String name;
  
  @NotNull
  @Column(name = "from")
  private Date from;
  
  @NotNull
  @Column(name = "to")
  private Date to;  
  
  @ManyToOne
  private RoomType roomType;  
  
  @OneToOne
  private Node owner;

  public Inventory() {
    super();
  }

  public Inventory(String id, Instant createdAt, Instant modifiedAt, int version,
      String name, Date from, Date to, RoomType roomType, Node owner) {
    super(id, createdAt, modifiedAt, version);
    this.name = name;
    this.from = from;
    this.to = to;
    this.roomType = roomType;
    this.owner = owner;    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public RoomType getRoomType() {
    return roomType;
  }

  public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
  }

  public Node getOwner() {
    return owner;
  }

  public void setOwner(Node owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Inventory [name=" + name + ", from=" + from + ", to=" + to + ", roomType=" + roomType.toString()
        + ", owner=" + owner.toString() + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt="
        + modifiedAt + ", version=" + version + "]";
  }  
}
