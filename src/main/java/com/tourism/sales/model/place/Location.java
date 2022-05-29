package com.tourism.sales.model.place;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;


@Entity
@Table(name = "[location]")
public class Location extends BaseEntity {

  @NotNull
  @Column(name = "location")
  private String location;

  public Location() {
    super();
  }

  public Location(@NotNull String location) {
    super();
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Location [location=" + location + "]";
  }  
}
