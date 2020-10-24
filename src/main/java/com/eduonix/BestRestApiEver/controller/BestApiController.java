package com.eduonix.BestRestApiEver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BestApiController {
	
	@RequestMapping("/")
	public String bestApi() {
		return "THIS IS NE NEW APIIWEFPIWEFPIWPIWEFPWEPF";
	}
	
	

}
