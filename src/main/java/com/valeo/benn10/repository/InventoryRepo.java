package com.valeo.benn10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valeo.benn10.model.InventoryModel;

@Repository
public interface InventoryRepo extends JpaRepository<InventoryModel,Integer>{

}
