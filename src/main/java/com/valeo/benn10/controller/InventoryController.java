package com.valeo.benn10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valeo.benn10.dto.InventoryRequestDto;
import com.valeo.benn10.dto.InventoryResponseDto;
import com.valeo.benn10.model.InventoryEntity;
import com.valeo.benn10.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/insertData")
	public ResponseEntity<InventoryResponseDto> insertData (@RequestBody InventoryRequestDto inventoryRequestDto){
		
		boolean isSuccess = inventoryService.insertData(inventoryRequestDto);
		InventoryResponseDto inventoryResponseDto = new InventoryResponseDto();
		
		
		if(isSuccess) {
			inventoryResponseDto.setMessaage("Successfully inserted.");
			return ResponseEntity.ok(inventoryResponseDto);
		}
		else {
			inventoryResponseDto.setMessaage("Unsuccessfully, Can not insert.");
			return ResponseEntity.internalServerError().body(inventoryResponseDto);
		}
//		return ResponseEntity.ok("Successfully Inserted");
//		InventoryResponseDto inventoryResponseDto = new InventoryResponseDto();
//		return ResponseEntity.ok(inventoryResponseDto);
//		return ResponseEntity.internalServerError().body(inventoryResponseDto);
	}
	
	@GetMapping("/getById/{id}")
	public InventoryEntity getServiceById(@PathVariable int id){
		return inventoryService.getServiceById(id);
		
	}
	
	@PostMapping("checkIfIdExists")
	public ResponseEntity<InventoryResponseDto> checkIfIdExists(@RequestBody InventoryRequestDto inventoryRequestDto){
		boolean idExists = inventoryService.checkIfIdExists(inventoryRequestDto);
		InventoryResponseDto inventoryResponseDto = new InventoryResponseDto();
	
		if(!idExists) {
			inventoryResponseDto.setMessaage("Insertion Successful");
			return ResponseEntity.ok(inventoryResponseDto);
		}
		else {
			inventoryResponseDto.setMessaage("Id exist");
			return ResponseEntity.ok(inventoryResponseDto);
			
		}
	}

}
