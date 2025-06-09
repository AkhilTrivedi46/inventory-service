package com.valeo.benn10.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class InventoryRequestDto {
	
	private int sku_id;
	private String cloth_type;
	private int available_qty;
	public int getSku_id() {
		return sku_id;
	}
	public void setSku_id(int sku_id) {
		this.sku_id = sku_id;
	}
	public String getCloth_type() {
		return cloth_type;
	}
	public void setCloth_type(String cloth_type) {
		this.cloth_type = cloth_type;
	}
	public int getAvailable_qty() {
		return available_qty;
	}
	public void setAvailable_qty(int available_qty) {
		this.available_qty = available_qty;
	}
	@Override
	public String toString() {
		return "InventoryRequestDto [sku_id=" + sku_id + ", cloth_type=" + cloth_type + ", available_qty="
				+ available_qty + "]";
	}
	
	

}
