package com.hexaware.controller;

import java.util.Scanner;
import com.hexaware.exception.InvalidPetAgeException;
import com.hexaware.exception.NullReferenceException;
import com.hexaware.entity.Pet;
import com.hexaware.service.PetShelter;

public class PetController {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		PetShelter petShelter=new PetShelter();
		while(true) {
			System.out.println("press 1-To add pet to shelter");
			System.out.println("press 2-To list available pets");
			int input=sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1:
				System.out.println("Enter the name");
				String name=sc.nextLine();
				System.out.println("Enter age");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the breed");
				String breed=sc.nextLine();
				try {
					petShelter.validateAge(age);
					Pet pet=new Pet(name,age,breed);
					petShelter.addPet(pet);
					System.out.println("pet added successfully!!");
				} catch (InvalidPetAgeException e) {
		           System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					petShelter.listAvailablePets();
				} catch (NullReferenceException e) {
					System.out.println(e.getMessage());
				}
				break;
				
		
			}
			sc.close();
		}
	
	}


}
