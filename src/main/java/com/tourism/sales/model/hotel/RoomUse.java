package com.tourism.sales.model.hotel;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[roomuse]")
public class RoomUse extends BaseEntity{

  @NotNull
  @Column(name  = "code")
  private String code;
  
  @NotNull
  @Column(name  = "description")
  private String description;
  
  @NotNull
  @Column(name  = "pax")
  private int pax;
  
  @ManyToOne
  private RoomType roomType;

  public RoomUse() {
    super();
  }

  public RoomUse(String id, Instant createdAt, Instant modifiedAt, int version,
      String code,String description,int pax, RoomType roomType) {
    super(id, createdAt, modifiedAt, version);
    this.code = code;
    this.description = description;
    this.pax = pax;
    this.roomType = roomType;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPax() {
    return pax;
  }

  public void setPax(int pax) {
    this.pax = pax;
  }

  public RoomType getRoomType() {
    return roomType;
  }

  public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
  }

  @Override
  public String toString() {
    return "RoomUse [code=" + code + ", description=" + description + ", pax=" + pax + ", roomType="
        + roomType.toString() + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
        + ", version=" + version + "]";
  }
  
  
  
}
