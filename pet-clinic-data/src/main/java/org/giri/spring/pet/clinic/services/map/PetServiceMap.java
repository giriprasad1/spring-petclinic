package org.giri.spring.pet.clinic.services.map;


import java.util.Set;


import org.giri.spring.pet.clinic.model.Pet;
import org.giri.spring.pet.clinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	public Pet findById(Long Id) {
		return super.findById(Id);
	}

	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	public void delete(Pet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}
