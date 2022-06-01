package com.tourism.sales.model.country;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.tourism.sales.common.NodeType;
import com.tourism.sales.model.place.Location;
import com.tourism.sales.model.place.Node;

@Entity
@Table(name = "[destination]")
public class Destination extends Node {

  public Destination() {
    super();
    this.type = NodeType.DESTINATION;
  }

  public Destination(String id, Instant createdAt, Instant modifiedAt, int version, String name,
      String parentId, Location location) {
    super(id, createdAt, modifiedAt, version, name, NodeType.DESTINATION, parentId, location);
    
  }

  @Override
  public String toString() {
    return "Destination [name=" + name + ", type=" + type + ", parentId=" + parentId + ", location="
        + location + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
        + ", version=" + version + "]";
  }  
}
