package com.valeo.benn10.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valeo.benn10.dto.InventoryRequestDto;
import com.valeo.benn10.model.InventoryEntity;
import com.valeo.benn10.repository.InventoryRepo;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InventoryService {
	
	@Autowired
	private InventoryRepo inventoryRepo;
	Logger log = (Logger) LoggerFactory.getLogger(InventoryService.class);
	
	public boolean insertData(InventoryRequestDto inventoryRequestDto){
		//TODO -  
		InventoryEntity inventoryEntity = new InventoryEntity();
		 
//		 inventoryEntity.setSku_id(inventoryRequestDto.getSku_id());
		int skuId = inventoryRequestDto.getSku_id();
		inventoryEntity.setSku_id(skuId);
		 
		inventoryEntity.setCloth_type(inventoryRequestDto.getCloth_type());
		inventoryEntity.setAvailable_qty(inventoryRequestDto.getAvailable_qty());
		 
		 inventoryRepo.save(inventoryEntity);
		 
		 return true;
		 
		 
	}
	
	public InventoryEntity getServiceById(int id) {
		return inventoryRepo.findById(id).orElse(null);
	}
	
	public boolean checkIfIdExists(InventoryRequestDto inventoryRequestDto) {
		int sku_id = inventoryRequestDto.getSku_id();
		if(sku_id == 0) {
			log.error("Id is invalid");
		}
		
		
		if(inventoryRepo.findById(sku_id).isPresent()) {
			log.info("Yayyy !!, Id found {}" , sku_id);
			
			return true;
		}
		else {
			InventoryEntity inventoryEntity = new InventoryEntity();
			inventoryEntity.setSku_id(inventoryRequestDto.getSku_id());
			inventoryEntity.setCloth_type(inventoryRequestDto.getCloth_type());
			inventoryEntity.setAvailable_qty(inventoryRequestDto.getAvailable_qty());
			
			inventoryRepo.save(inventoryEntity);
			
			return false;
			
		}
		
	}

}
;