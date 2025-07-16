package com.valeo.benn10.dto;

public class InventoryResponseDto {
	private String messaage;

	public String getMessaage() {
		return messaage;
	}

	public void setMessaage(String messaage) {
		this.messaage = messaage;
	}

	@Override
	public String toString() {
		return "InventoryResponseDto [messaage=" + messaage + "]";
	}
	
	

}
