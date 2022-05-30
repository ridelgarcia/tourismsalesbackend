package com.tourism.sales.repositories.agency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.agency.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, String>{

}
