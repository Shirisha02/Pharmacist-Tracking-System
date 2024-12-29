package com.representative.daily_activity.Entity;


	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

	@Data
	@Entity
	@Table(name = "contact_admin")
	public class contactAdminEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String yourName;
	    private String yourEmail;
	    private String subject;
	    private String message;

}
