package org.giri.spring.pet.clinic.services.map;

import java.util.Set;


import org.giri.spring.pet.clinic.model.Vet;
import org.giri.spring.pet.clinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	public Vet findById(Long Id) {
		return super.findById(Id);
	}

	public Vet save(Vet object) {
		return super.save(object.getId(), object);
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
