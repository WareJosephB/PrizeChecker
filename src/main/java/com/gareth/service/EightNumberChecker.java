package com.gareth.service;

public class EightNumberChecker implements LengthCheckerService {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkLength(accountNumber, 8);
	}

}
