package org.giri.spring.pet.clinic.services.map;

import java.util.Set;

import org.giri.spring.pet.clinic.model.Owner;
import org.giri.spring.pet.clinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public Owner findById(Long Id) {
		return super.findById(Id);
	}

	public Owner save(Owner object) {
		return super.save( object);
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

	@Override
	public Owner findByLastName(Owner entity) {
		// TODO Auto-generated method stub
		return null;
	}



}
