package com.gareth.service;

public class TenNumberChecker implements LengthCheckerService {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkLength(accountNumber, 10);
	}

}
