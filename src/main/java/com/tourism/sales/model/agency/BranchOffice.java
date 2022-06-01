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
@Table(name = "[branchoffice]")
public class BranchOffice extends Node{

  @Null
  @Column(name = "phone")
  private String phone;
  
  @Null
  @Column(name = "email")
  private String email;

  public BranchOffice() {
    super();
    this.type = NodeType.BRANCH_OFFICE;
  }

  public BranchOffice(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      String parentId, Location location,String phone, String email) {
    super(id, createdAt, modifiedAt, version, name, NodeType.BRANCH_OFFICE, parentId, location);
    this.phone = phone;
    this.email = email;
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

  @Override
  public String toString() {
    return "BranchOffice [phone=" + phone + ", email=" + email + ", name=" + name + ", type=" + type
        + ", parentId=" + parentId + ", location=" + location + ", id=" + id + ", createdAt="
        + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }
  
}
