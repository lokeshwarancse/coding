package com.hexaware.entity;

public class Cat extends Pet {
	private String CatColor;
	
	public Cat(String name, int age, String breed, String Catcolor) {
		super(name, age, breed);
		this.CatColor=CatColor;
	}
	
	public String getCatColor() {
		return CatColor;
	}
	
	public void SetCatColor(String CatColor) {
		this.CatColor=CatColor;
	}
	
	
	
}