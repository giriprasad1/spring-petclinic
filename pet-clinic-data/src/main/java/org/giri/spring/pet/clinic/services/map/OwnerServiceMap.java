package org.giri.spring.pet.clinic.services.map;

import java.util.Set;

import org.giri.spring.pet.clinic.model.Owner;
import org.giri.spring.pet.clinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	public Owner findById(Long Id) {
		return super.findById(Id);
	}

	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	public void delete(Owner object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}



}
