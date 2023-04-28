package com.manipal.hospital.Exception;

public class ApiErrorResponse {

	 private String description;

     private String details;

	    public ApiErrorResponse(String description, String details) {
		super();
		this.description = description;
		this.details = details;
	}


}
