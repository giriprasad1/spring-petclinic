package org.giri.spring.pet.clinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
