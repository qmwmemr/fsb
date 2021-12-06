package com.itcen.fsb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String index() {
		logger.info("Welcome home! index.");
		
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		logger.info("Welcome home! about.");
		
		return "about";
	}
	
	@GetMapping("/products")
	public String products() {
		logger.info("Welcome home! products.");
		
		return "products";
	}
	
	@GetMapping("/store")
	public String store() {
		logger.info("Welcome home! store.");
		
		return "store";
	}
	
	
}
