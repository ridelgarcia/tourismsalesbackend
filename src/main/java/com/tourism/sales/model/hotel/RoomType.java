package com.tourism.sales.model.hotel;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[roomtype]")
public class RoomType extends BaseEntity{

  @NotNull
  @Column(name  = "code")
  private String code;
  
  @NotNull
  @Column(name  = "description")
  private String description;
  
  @NotNull
  @Column(name  = "photoPath")
  private String photoPath;
  
  @ManyToOne
  private Hotel hotel;

  public RoomType() {
    super();
  }

  public RoomType(String id, Instant createdAt, Instant modifiedAt, int version,
      String code,String description,String photoPath,Hotel hotel) {
    super(id, createdAt, modifiedAt, version);
    this.code = code;
    this.description = description;
    this.photoPath = photoPath;
    this.hotel = hotel;
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

  public String getPhotoPath() {
    return photoPath;
  }

  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  @Override
  public String toString() {
    return "RoomType [code=" + code + ", description=" + description + ", photoPath=" + photoPath
        + ", hotel=" + hotel.toString() + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt="
        + modifiedAt + ", version=" + version + "]";
  }
  
  
  
  
  
}
