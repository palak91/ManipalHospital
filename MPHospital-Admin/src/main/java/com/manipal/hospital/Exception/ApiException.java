package com.manipal.hospital.Exception;

public class ApiException extends RuntimeException{
	
	 private static final long serialVersionUID = 1L;
	 
	 private ApiErrorResponse errorResponse;

	    private ErrorDetail detail = null;
	    
	    

	    public ApiErrorResponse getErrorResponse() {
	        return errorResponse;
	    }



}
