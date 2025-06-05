package com.valeo.benn10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valeo.benn10.model.InventoryModel;
import com.valeo.benn10.repository.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepo inventoryRepo;
	
	public InventoryModel insertData(InventoryModel inventoryModel){
		return inventoryRepo.save(inventoryModel);
		
	}

}
