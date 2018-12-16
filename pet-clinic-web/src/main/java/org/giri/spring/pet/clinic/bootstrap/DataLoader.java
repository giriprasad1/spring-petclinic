package org.giri.spring.pet.clinic.bootstrap;

import org.giri.spring.pet.clinic.model.Owner;
import org.giri.spring.pet.clinic.model.Vet;
import org.giri.spring.pet.clinic.services.OwnerService;
import org.giri.spring.pet.clinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	public final OwnerService ownerService;
	public final VetService vetService;
	
	

	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Jane");
		owner1.setLastName("Smith");
		
		this.ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("John");
		owner2.setLastName("Smith");
		this.ownerService.save(owner2);
		
		System.out.println("Saved Owners");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Julie");
		vet1.setLastName("Andersson");
		this.vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Denise");
		vet2.setLastName("Andersson");
		this.vetService.save(vet2);
		
		System.out.println("Saved Vets");
	}



}
