package com.gareth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.gareth.persistence.repository.DatabaseRepository;

public class LetterCheckerRepo {

	@Autowired
	private DatabaseRepository repo;
	
	@Value("${base.prize}")
	int basePrize;
	@Value("${multiplier.prize}")
	int multiplier;
	@Value("${win.message}")
	String winMessage;
	@Value("${lose.message}")
	String loseMessage;

	public String checkLetter(String accountNumber) {

		String letter = accountNumber.substring(0, 1);
		switch (letter) {
		case "A":
			repo.save(accountNumber);
			return winMessage + String.valueOf(basePrize);
		case "B":
			repo.save(accountNumber);
			return winMessage + String.valueOf(multiplier * basePrize);
		default:
			return loseMessage;
		}
	}
}