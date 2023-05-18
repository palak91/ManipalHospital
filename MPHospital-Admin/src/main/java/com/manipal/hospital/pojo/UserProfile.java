package com.manipal.hospital.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserProfile {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="id")
	    private Integer userId;

	    @Column(name="firstname")
	    private String firstName;

	    @Column(name="lastname")
	    private String lastName;

	    private String email;

	    @Column(name="contactnumber")
	    private String contactNo;

	    @Column(name="lastsuccessfulllogin")
	    private String lastSuccessfulLogin;

	    @Column(name="username")
	    private String userName;

	    private String designation;


}
