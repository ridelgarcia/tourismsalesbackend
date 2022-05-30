package com.tourism.sales.repositories.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.security.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
