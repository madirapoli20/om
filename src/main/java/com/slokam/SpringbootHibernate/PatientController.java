package com.slokam.SpringbootHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	private PatientRepo patientRepo;
	
	@PostMapping("savePatient")
	public void savePatient(@RequestBody Patient patient) {
		System.out.println(patient);
		patientRepo.save(patient);
		
	}

}
