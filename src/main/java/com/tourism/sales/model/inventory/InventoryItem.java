package com.tourism.sales.model.inventory;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.tourism.sales.model.common.BaseEntity;
import com.tourism.sales.model.common.Date;

@Entity
@Table(name = "[inventoryitem]")
public class InventoryItem extends BaseEntity{

  @ManyToOne
  private Inventory inventory;
  
  @ManyToOne
  private Date date;
  
  @NotNull
  @Column(name = "allocatedRooms")
  private int allocatedRooms;
  
  @NotNull
  @Column(name = "blockedRooms")
  private int blockedRooms;
  
  @NotNull
  @Column(name = "freeRooms")
  private int freeRooms;
  
  @NotNull
  @Column(name = "soldRooms")
  private int soldRooms;
  
  @NotNull
  @Column(name = "allocatedPax")
  private int allocatedPax;
  
  @NotNull
  @Column(name = "blockedPax")
  private int blockedPax;
  
  @NotNull
  @Column(name = "freePax")
  private int freePax;
  
  @NotNull
  @Column(name = "soldPax")
  private int soldPax;

  public InventoryItem() {
    super();
  }

  public InventoryItem(String id, Instant createdAt, Instant modifiedAt, int version,
      Inventory inventory,Date date,int allocatedRooms,int blockedRooms,int freeRooms,int soldRooms,
      int allocatedPax,int blockedPax,int freePax,int soldPax) {
    super(id, createdAt, modifiedAt, version);
    this.inventory = inventory;
    this.date = date;
    
    this.allocatedRooms = allocatedRooms;
    this.blockedRooms = blockedRooms;
    this.freeRooms = freeRooms;
    this.soldRooms = soldRooms;
    
    this.allocatedPax = allocatedPax;
    this.blockedPax = blockedPax;
    this.freePax = freePax;
    this.soldPax = soldPax;
    
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getAllocatedRooms() {
    return allocatedRooms;
  }

  public void setAllocatedRooms(int allocatedRooms) {
    this.allocatedRooms = allocatedRooms;
  }

  public int getBlockedRooms() {
    return blockedRooms;
  }

  public void setBlockedRooms(int blockedRooms) {
    this.blockedRooms = blockedRooms;
  }

  public int getFreeRooms() {
    return freeRooms;
  }

  public void setFreeRooms(int freeRooms) {
    this.freeRooms = freeRooms;
  }

  public int getSoldRooms() {
    return soldRooms;
  }

  public void setSoldRooms(int soldRooms) {
    this.soldRooms = soldRooms;
  }

  public int getAllocatedPax() {
    return allocatedPax;
  }

  public void setAllocatedPax(int allocatedPax) {
    this.allocatedPax = allocatedPax;
  }

  public int getBlockedPax() {
    return blockedPax;
  }

  public void setBlockedPax(int blockedPax) {
    this.blockedPax = blockedPax;
  }

  public int getFreePax() {
    return freePax;
  }

  public void setFreePax(int freePax) {
    this.freePax = freePax;
  }

  public int getSoldPax() {
    return soldPax;
  }

  public void setSoldPax(int soldPax) {
    this.soldPax = soldPax;
  }

  @Override
  public String toString() {
    return "InventoryItem [inventory=" + inventory + ", date=" + date + ", allocatedRooms="
        + allocatedRooms + ", blockedRooms=" + blockedRooms + ", freeRooms=" + freeRooms
        + ", soldRooms=" + soldRooms + ", allocatedPax=" + allocatedPax + ", blockedPax="
        + blockedPax + ", freePax=" + freePax + ", soldPax=" + soldPax + ", id=" + id
        + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }  
}
