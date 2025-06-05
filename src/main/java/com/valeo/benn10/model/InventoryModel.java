package com.valeo.benn10.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="invtry")
@Entity
public class InventoryModel {
	@Id
	private int sku_id;
	
	@Column(name = "cloth_type", nullable = false)
	private String cloth_type;
	
	@Column(name = "available_qty")
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
		return "InventoryModel [sku_id=" + sku_id + ", cloth_type=" + cloth_type + ", available_qty=" + available_qty
				+ "]";
	}
	
	
	

}
