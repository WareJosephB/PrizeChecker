package com.gareth.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gareth.service.SixNumberChecker;
import com.gareth.service.EightNumberChecker;
import com.gareth.service.TenNumberChecker;
import com.gareth.service.LengthCheckerService;

public class AppConfig {

	@Bean(name = "accountGenerator6")
	public LengthCheckerService getPrizeChecker6() {
		return new com.gareth.service.SixNumberChecker();
	}

//	@Bean(name = "accountGenerator8")
//	public IPrizeChecker getPrizeChecker8() {
//		return new EightNumberChecker();
//	}
//	
//	@Bean(name = "accountGenerator10")
//	public IPrizeChecker getPrizeChecker10() {
//		return new TenNumberChecker();
//	}
}