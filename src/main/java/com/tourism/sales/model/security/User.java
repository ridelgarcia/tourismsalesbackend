package com.tourism.sales.model.security;

import java.time.Instant;

import javax.persistence.*;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[user]")
public class User extends BaseEntity {	

    @Column(name = "externalid")
    private String externalId;

	@Column(name = "email")
	private String email;

    @Column(name = "password")
	private String password;
    
    @ManyToOne
	private Role role;


	public User() {
		super();
	}

	public User(String id, Instant createdAt, Instant modifiedAt, int version,
	    String externalId,String email, String password,Role role) {
		super(id,createdAt,modifiedAt,version);
		
		this.externalId = externalId;
        this.email = email;
        this.password = password;
        this.role = role;
	}	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

    public String getExternalId() {
      return externalId;
    }
  
    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }

    @Override
    public String toString() {
      return "User [externalId=" + externalId + ", email=" + email + ", password=" + password
          + ", role=" + role + ", id=" + id + ", createdAt=" + createdAt + ", modifiedAt="
          + modifiedAt + ", version=" + version + "]";
    }	
}

