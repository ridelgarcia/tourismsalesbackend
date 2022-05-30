package com.tourism.sales.repositories.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.security.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>{

}
