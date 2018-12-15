package org.giri.spring.pet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
	
	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets() {
		return "vets/index";
	}
	

}
