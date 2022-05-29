package com.tourism.sales.model.agency;


import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.tourism.sales.model.common.Person;
import com.tourism.sales.model.security.User;

@Entity
@Table(name = "[vendor]")
public class Vendor extends Person{

  @OneToOne
  private User user;
  
  @OneToOne
  private Bureau bureau;

  public Vendor() {
    super();
  }

  public Vendor(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      String lastName, String passport, String phone,User user,Bureau bureau) {
    super(id, createdAt, modifiedAt, version, name, lastName, passport, phone);
    this.user = user;
    this.bureau = bureau;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Bureau getBureau() {
    return bureau;
  }

  public void setBureau(Bureau bureau) {
    this.bureau = bureau;
  }

  @Override
  public String toString() {
    return "Vendor [user=" + user + ", bureau=" + bureau + ", name=" + name + ", lastname="
        + lastname + ", passport=" + passport + ", phone=" + phone + ", id=" + id + ", createdAt="
        + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }  
}
