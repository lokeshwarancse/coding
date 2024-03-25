package com.hexaware.service;
import com.hexaware.exception.InsufficientFundsException;

public class DonationService {

	public void processDonation(int amount) throws InsufficientFundsException {
		if(amount < 10)
			throw new InsufficientFundsException("Amount should be greater than Rs.10!!Thanks");
		System.out.println("Donation Processed");
	}

	 
}
