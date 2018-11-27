package com.gareth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.service.LengthCheckerService;

@RestController
@RequestMapping("${base.URL}")
public class PrizeGeneratorEndpoint {

	@Autowired
	private LengthCheckerService service;

	@PostMapping("${method.URL}")
	public String checkPrize(@RequestBody String accountNumber) {
		return service.checkPrize(accountNumber);
	}

}
