package com.hexaware.service;


import java.util.ArrayList;
import java.util.List;
import com.hexaware.exception.NullReferenceException;
import com.hexaware.exception.InvalidPetAgeException;
import com.hexaware.entity.Pet;

public class PetShelter {
	
	List<Pet> list=new ArrayList<>();
	
	public void addPet(Pet pet) {
		//Add pet to the list
		list.add(pet);
	}
	
	public void removePet(Pet pet) {
		//Remove Pet from list
		list.remove(pet);
	}
	
	public void listAvailablePets() throws NullReferenceException {
		//Show all available pets
		for(Pet p:list) {
			if(p.getName()==null|| p.getName().equals("null"))
				throw new NullReferenceException("Name cannot be null");
			System.out.println(p);
		}
	}

	public void validateAge(int age) throws InvalidPetAgeException {
		if(age<=0)
			throw new InvalidPetAgeException("Age cannot be below 0");
		
	}

}
