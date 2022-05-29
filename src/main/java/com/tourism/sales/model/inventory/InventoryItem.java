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
  @Column(name = "allocated")
  private int allocated;
  
  @NotNull
  @Column(name = "blocked")
  private int blocked;
  
  @NotNull
  @Column(name = "free")
  private int free;
  
  @NotNull
  @Column(name = "sold")
  private int sold;

  public InventoryItem() {
    super();
  }

  public InventoryItem(String id, Instant createdAt, Instant modifiedAt, int version,
      Inventory inventory,Date date,int allocated,int blocked,int free,int sold) {
    super(id, createdAt, modifiedAt, version);
    this.inventory = inventory;
    this.date = date;
    this.allocated = allocated;
    this.blocked = blocked;
    this.free = free;
    this.sold = sold;
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

  public int getAllocated() {
    return allocated;
  }

  public void setAllocated(int allocated) {
    this.allocated = allocated;
  }

  public int getBlocked() {
    return blocked;
  }

  public void setBlocked(int blocked) {
    this.blocked = blocked;
  }

  public int getFree() {
    return free;
  }

  public void setFree(int free) {
    this.free = free;
  }

  public int getSold() {
    return sold;
  }

  public void setSold(int sold) {
    this.sold = sold;
  }

  @Override
  public String toString() {
    return "InventoryItem [inventory=" + inventory.toString() + ", date=" + date.toString() + ", allocated=" + allocated
        + ", blocked=" + blocked + ", free=" + free + ", sold=" + sold + ", id=" + id
        + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }
  
  
  
  
}
