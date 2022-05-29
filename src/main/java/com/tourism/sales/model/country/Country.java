package com.tourism.sales.model.country;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.model.place.Node;

@Entity
@Table(name = "[country]")
public class Country extends Node{

  public Country() {
    super();
    this.type = Node.NodeType.COUNTRY;
  }

  public Country(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      String parentId, Location location) {
    super(id, createdAt, modifiedAt, version, name, Node.NodeType.COUNTRY, parentId, location);
    
  }

  @Override
  public String toString() {
    return "Country [location=" + location.toString() + ", id=" + id + ", createdAt=" + createdAt
        + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }  
}
