package com.manipal.hospital.pojo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity
public class UserProfile {
	
	    @GeneratedValue
	    private Integer userId;

	    private String firstName;

	    private String lastName;

	    private String email;

	    private String contactNo;

	    private String lastSuccessfulLogin;

	    private String userName;

	    private String faxNumber;

	    private String designation;


}
