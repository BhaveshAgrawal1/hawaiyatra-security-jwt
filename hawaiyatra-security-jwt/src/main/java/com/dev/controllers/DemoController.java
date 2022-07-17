package com.dev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.client.AdminClient;
import com.dev.models.FlightDetails;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
	
	@Autowired
	private AdminClient admin;

	@PostMapping("/create")
	public FlightDetails createFlight(@RequestBody FlightDetails details) {
		return admin.createFlight(details);
	}
	
	@PutMapping("/update")
	public String updateFlight(@RequestBody FlightDetails details) {
		return admin.updateFlight(details);
	}
	
	@PutMapping("/block")
	public String blockFlight(@RequestBody FlightDetails details) {
		return admin.blockFlight(details);
	}

	@PutMapping("/unblock")
	public String unblockFlight(@RequestBody FlightDetails details) {
		return admin.unblockFlight(details);
	}
	
	@GetMapping("/view")
	public List<FlightDetails> view(){
		return admin.viewFlight();
	}
	
}
