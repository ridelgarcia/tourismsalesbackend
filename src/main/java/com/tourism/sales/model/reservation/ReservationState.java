package com.tourism.sales.model.reservation;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[reservationstate]")
public class ReservationState extends BaseEntity{

  @NotNull
  @Column(name = "code")
  private String code;
  
  @NotNull
  @Column(name = "name")
  private String name;
  
  @NotNull
  @Column(name = "description")
  private String description;

  public ReservationState() {
    super();
  }

  public ReservationState(String id, Instant createdAt, Instant modifiedAt, int version,
      String code,String name,String description) {
    super(id, createdAt, modifiedAt, version);
    this.code = code;
    this.name = name;
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "ReservationState [code=" + code + ", name=" + name + ", description=" + description
        + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", version="
        + version + "]";
  }  
}
