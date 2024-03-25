package com.hexaware.controller;

import java.util.Scanner;

import com.hexaware.exception.InsufficientFundsException;
import com.hexaware.service.DonationService;

public class DonationController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DonationService donationService=new DonationService();
		System.out.println("Enter the donation amount");
		int amount=sc.nextInt();
		try {
			donationService.processDonation( amount);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		sc.close();

	}

}
