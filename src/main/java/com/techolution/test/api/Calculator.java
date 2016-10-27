package com.techolution.test.api;

import java.util.List;

import com.techolution.test.SatisfactionToTimeRatio;

public interface Calculator {
	
	Long maximize(List<SatisfactionToTimeRatio> ratio, Long maxTime);
}
