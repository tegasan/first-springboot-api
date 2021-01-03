package com.javateg.springboot.startone.startoneapi.model;

import lombok.Data;

@Data
public class GenericResponseModel {
	private String displayMessage;
	private String description;
	public String getDisplayMessage() {
		return displayMessage;
	}
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
