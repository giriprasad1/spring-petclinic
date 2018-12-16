package org.giri.spring.pet.clinic.controller;

import org.giri.spring.pet.clinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
	
	private final VetService vetsService;
	
	
	
	public VetsController(VetService vetsService) {
		super();
		this.vetsService = vetsService;
	}



	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", this.vetsService.findAll());
		return "vets/index";
	}
	

}
