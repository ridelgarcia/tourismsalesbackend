package com.tourism.sales.repositories.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tourism.sales.model.inventory.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String>{

}
