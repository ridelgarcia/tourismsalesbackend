package com.tourism.sales.model.place;



import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[node]")
@Inheritance(strategy = InheritanceType.JOINED)
public class Node extends BaseEntity {
	
	public enum NodeType{
		COUNTRY,
		TRAVEL_AGENCY,
		BRANCH_OFFICE,
		BUREAU,
		DESTINATION,
		HOTEL
		
	}
	
	@Null
	@Column(name = "name")
	protected String name;
	
	@NotNull
	@Column(name = "type")
	protected NodeType type;
	
	@Null
	@Column(name = "parentid")
	protected String parentId;
	
	@Null
	@OneToOne
	protected Location location;

	public Node() {
		super();
	}

  public Node(String id, Instant createdAt, Instant modifiedAt, int version,String name, NodeType type, String parentId, Location location) {
    super(id, createdAt, modifiedAt, version);
    this.name = name;
    this.type = type;
    this.parentId = parentId;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeType getType() {
    return type;
  }

  public void setType(NodeType type) {
    this.type = type;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Node [name=" + name + ", type=" + type + ", parentId=" + parentId + ", location="
        + location + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
        + ", version=" + version + "]";
  }	
}
