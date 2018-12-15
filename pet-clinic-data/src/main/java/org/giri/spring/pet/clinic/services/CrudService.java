package org.giri.spring.pet.clinic.services;

import java.util.Set;

import org.giri.spring.pet.clinic.model.Vet;

public interface CrudService<T,ID> {

	T findById(ID Id);

	T save(T object);

	Set<T> findAll();
	
	void delete(T object);
	
	void deleteById(ID id);

}