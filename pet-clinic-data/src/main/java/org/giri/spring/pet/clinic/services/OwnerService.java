package org.giri.spring.pet.clinic.services;

import java.util.Set;

import org.giri.spring.pet.clinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(Owner entity);

}
