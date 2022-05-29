package com.tourism.sales.model.common;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "[person]")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person extends BaseEntity{
  
  @Column(name = "name")
  protected String name;
  
  @Column(name = "lastname")
  protected String lastname;
  
  @Column(name = "passport")
  protected String passport;
  
  @Column(name = "phone")
  protected String phone;

  public Person() {
    super();
  }

  public Person(String id, Instant createdAt, Instant modifiedAt, int version,
      String name,String lastName,String passport,String phone) {
    super(id, createdAt, modifiedAt, version);
    this.name = name;
    this.lastname = lastName;
    this.passport = passport;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", lastname=" + lastname + ", passport=" + passport + ", phone="
        + phone + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
        + ", version=" + version + "]";
  }  

}
