package org.giri.spring.pet.clinic.controller;

import org.giri.spring.pet.clinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}



	@RequestMapping({"/owner","/owner/index","/owner/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners", this.ownerService.findAll());
		return "owner/index";
	}
	

}
