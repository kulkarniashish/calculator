package com.techolution.test.api;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techolution.test.SatisfactionToTimeRatio;

@Service
public class CalculatorImpl implements Calculator {

	@Override
	public Long maximize(List<SatisfactionToTimeRatio> ratios, Long maxTime) {

		Collections.sort(ratios);
		Long time = maxTime;
		Long maxSatisfaction = 0L;

		for (SatisfactionToTimeRatio ratio : ratios) {
			if (ratio.getTime() < time) {
				maxSatisfaction += ratio.getSatisfaction();
				time = time - ratio.getTime();
			}

			if (time <= 0) {
				break;
			}
		}
		return maxSatisfaction;

	}

}
