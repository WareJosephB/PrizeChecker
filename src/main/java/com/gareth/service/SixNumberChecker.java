package com.gareth.service;

public class SixNumberChecker implements LengthCheckerService {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkLength(accountNumber, 6);
	}

}
