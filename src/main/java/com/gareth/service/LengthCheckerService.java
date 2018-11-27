package com.gareth.service;

public interface LengthCheckerService {

	LetterCheckerRepo repo = new LetterCheckerRepo();

	default String checkLength(String accountNumber, int length) {
		boolean isNotCorrectLength = accountNumber.length() != length + 1;
		if (isNotCorrectLength) {
			return "Error, string the wrong length.";
		} else {
			return repo.checkLetter(accountNumber);
		}
	}

	String checkPrize(String account);

}
