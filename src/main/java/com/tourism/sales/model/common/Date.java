package com.tourism.sales.model.common;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "[date]")
public class Date extends BaseEntity{
  
  @NotNull
  @Column(name = "date")
  private java.util.Date date;

  public Date() {
    super();
  }

  public Date(String id, Instant createdAt, Instant modifiedAt, int version,
      java.util.Date date) {
    super(id, createdAt, modifiedAt, version);
    this.date = date;
  }

  public java.util.Date getDate() {
    return date;
  }

  public void setDate(java.util.Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Date [date=" + date.toString() + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt="
        + modifiedAt + ", version=" + version + "]";
  } 

}
