package org.giri.spring.pet.clinic.services.map;

import java.util.Set;


import org.giri.spring.pet.clinic.model.Vet;
import org.giri.spring.pet.clinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	public Vet findById(Long Id) {
		return super.findById(Id);
	}

	public Vet save(Vet object) {
		return super.save(object);
	}

	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	public void delete(Vet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	

}
