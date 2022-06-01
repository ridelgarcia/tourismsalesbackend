package com.tourism.sales.model.hotel;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.model.place.Node;

@Entity
@Table(name = "[hotel]")
public class Hotel extends Node{

  @NotNull
  @Column(name = "stars")
  private int stars;
  
  @Null
  @Column(name = "description")
  private String description;
  
  @Null
  @Column(name = "phone")
  private String phone;
  
  @Null
  @Column(name = "email")
  private String email;
  
  @Null
  @Column(name = "photopath")
  private String photoPath;

  public Hotel() {
    super();
    this.type = NodeType.HOTEL;    
  }

  public Hotel(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      NodeType type, String parentId, Location location,int stars, String description,
      String phone, String email, String photoPath) {
    super(id, createdAt, modifiedAt, version, name, type, parentId, location);
    this.stars = stars;
    this.description = description;
    this.phone = phone;
    this.email = email;
    this.photoPath = photoPath;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhotoPath() {
    return photoPath;
  }

  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }

  @Override
  public String toString() {
    return "Hotel [stars=" + stars + ", description=" + description + ", phone=" + phone
        + ", email=" + email + ", photoPath=" + photoPath + ", name=" + name + ", type=" + type
        + ", parentId=" + parentId + ", location=" + location + ", id=" + id + ", createdAt="
        + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }  
  
}
