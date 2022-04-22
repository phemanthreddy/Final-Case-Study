package com.DoctorMicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

		
		@Autowired
		private DoctorRepository doctorrepo;
		
		@PostMapping("/addDoctor")
		
		public Doctor addDoctor(@RequestBody Doctor doctor)
		{
			return doctorrepo.save(doctor);
		}
	
	
	}
	
	
	
	
	


