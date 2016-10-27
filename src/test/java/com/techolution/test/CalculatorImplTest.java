package com.techolution.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.techolution.test.api.Calculator;
import com.techolution.test.api.CalculatorImpl;

public class CalculatorImplTest {

	Calculator calculator = new CalculatorImpl();
	
	@Test
	public void testMaximize() {
	
		
		List<SatisfactionToTimeRatio> ratio = new ArrayList<>();
		Long maxTime = 100L;
		
		SatisfactionToTimeRatio ratio1 = new SatisfactionToTimeRatio(60L, 6L);
		SatisfactionToTimeRatio ratio2 = new SatisfactionToTimeRatio(130L, 4L);
		SatisfactionToTimeRatio ratio3 = new SatisfactionToTimeRatio(670L, 18L);
		SatisfactionToTimeRatio ratio4 = new SatisfactionToTimeRatio(450L, 89L);
		ratio.add(ratio1);
		ratio.add(ratio2);
		ratio.add(ratio3);
		ratio.add(ratio4);
		
		Long maximize = calculator.maximize(ratio, maxTime);
		System.out.println(maximize);
	}

}
