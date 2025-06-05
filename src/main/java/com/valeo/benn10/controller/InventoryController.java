package com.valeo.benn10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valeo.benn10.model.InventoryModel;
import com.valeo.benn10.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/insertData")
	public InventoryModel insertData(@RequestBody InventoryModel inventoryModel){
		return inventoryService.insertData(inventoryModel);
	}

}
