package org.giri.spring.pet.clinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.giri.spring.pet.clinic.model.BaseEntity;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {
	
	Map<Long, T> map = new HashMap<>();
	
	T findById(ID id) {
		return map.get(id);
	}

	T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				Long id = this.getMaxId();
				object.setId(id);
				map.put(id, object);
			}
		} else {
			throw new RuntimeException("Entity cannot be null");
		}
		
		return object;
	}

	Set<T> findAll() {
		return new HashSet<T>(map.values());
		
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
		
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	private Long getMaxId() {
		
		return map.keySet().size() + 1L;
	}

}
