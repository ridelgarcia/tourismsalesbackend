package com.tourism.sales.model.security;

import java.time.Instant;

import javax.persistence.*;
import com.tourism.sales.model.common.BaseEntity;

@Entity
@Table(name = "[user]")
public class User extends BaseEntity {	

	

	@Column(name = "email")
	private String email;

    @Column(name = "password")
	private String password;
    
    @ManyToOne
	private Role role;


	public User() {
		super();
	}

	public User(String id, Instant createdAt, Instant modifiedAt, int version, String email, String password,Role role) {
		super(id,createdAt,modifiedAt,version);
		
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

  @Override
  public String toString() {
    return "User [email=" + email + ", password=" + password + ", role=" + role + ", id=" + id
        + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", version=" + version + "]";
  }
	
}

