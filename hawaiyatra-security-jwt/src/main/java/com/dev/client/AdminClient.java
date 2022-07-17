package com.dev.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dev.models.*;

@FeignClient("admin")
public interface AdminClient {

	@PostMapping("/flight/create")
	public FlightDetails createFlight(@RequestBody FlightDetails details);
	
	@PutMapping("/flight/update")
	public String updateFlight(@RequestBody FlightDetails details);
	
	@PutMapping("/flight/block")
	public String blockFlight(@RequestBody FlightDetails details) ;
	
	@PutMapping("/flight/unblock")
	public String unblockFlight(@RequestBody FlightDetails details) ;
	
	@GetMapping("/flight/view")
	public List<FlightDetails> viewFlight();
	
}
