package com.tourism.sales.repositories.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.common.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String>{

}
