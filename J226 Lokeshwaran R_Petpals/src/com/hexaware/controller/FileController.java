package com.hexaware.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.entity.Pet;

public class FileController {

	public static void main(String[] args) {
		
		File file=new File("pets.txt");
		List<Pet> list=new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String data="";
			while((data=reader.readLine())!= null) {
				String arry[]=data.split(",");
				Pet pet=new Pet(arry[0],Integer.parseInt(arry[1]),arry[2]);
				list.add(pet);
				
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		 
	 for(Pet p:list) {
		 System.out.println(p);
	 }

	}

}
