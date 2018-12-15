package org.giri.spring.pet.clinic.model;

import java.time.LocalDate;

public class Pet  extends BaseEntity{
	
	private Owner owner;
	private LocalDate date;
	private PetType type;
	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the type
	 */
	public PetType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(PetType type) {
		this.type = type;
	}

}
