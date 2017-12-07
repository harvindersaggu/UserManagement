package com.thbs.app.UserManagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.app.UserManagement.document.DeliveryStatus;
import com.thbs.app.UserManagement.repository.DeliveryStatusRepository;

@RestController
@RequestMapping("/")
public class DeliveryStatusController {

	private Logger logger = LoggerFactory.getLogger(DeliveryStatusController.class);
	
	@Autowired
	private DeliveryStatusRepository repository;
	
	public DeliveryStatusController() {
		logger.info("created" + this.getClass().getName());
	}
	
	@RequestMapping(value="/getAllDeliveryStatusData", method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<DeliveryStatus> getTable(){
		logger.info("getTable"+repository.findAll());
		return repository.findAll();
	}
	
	@RequestMapping(value="/addDeliveryStatusData", method=RequestMethod.POST,  consumes=MediaType.APPLICATION_JSON_VALUE)
	public void  addTableData(@RequestBody DeliveryStatus status){
		logger.info("status-------"+status);
		repository.insert(status);
	}
	
}
