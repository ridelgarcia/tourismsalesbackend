package com.tourism.sales.model.agency;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.model.place.Node;

@Entity
@Table(name = "[bureau]")
public class Bureau extends Node{

  @Null
  @Column(name = "phone")
  private String phone;
  
  public Bureau() {
    super();
    this.type = NodeType.BUREAU;
  }

  public Bureau(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      String parentId, Location location,String phone) {
    super(id, createdAt, modifiedAt, version, name, NodeType.BUREAU, parentId, location);
    this.phone = phone;    
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  @Override
  public String toString() {
    return "Bureau [phone=" + phone + ", name=" + name + ", type=" + type
        + ", parentId=" + parentId + ", location=" + location + ", id=" + id + ", createdAt="
        + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }

}
