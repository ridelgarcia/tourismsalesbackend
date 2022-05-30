package com.tourism.sales.repositories.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.country.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

}
