package com.thbs.app.UserManagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.app.UserManagement.document.Registration;
import com.thbs.app.UserManagement.repository.RegistrationRepository;

@RestController
@RequestMapping("/")
public class RegistrationController {
	private Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationRepository repository;

	public RegistrationController() {
		logger.info("created" + this.getClass().getName());
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseEntity<Registration> save(@RequestBody Registration registration) {
		logger.info("registration"+registration);
		repository.insert(registration);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}
