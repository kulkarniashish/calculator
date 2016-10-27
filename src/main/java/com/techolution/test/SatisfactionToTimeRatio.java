package com.techolution.test;

import java.util.Comparator;

public class SatisfactionToTimeRatio implements Comparable<SatisfactionToTimeRatio> {
	@Override
	public String toString() {
		return "SatisfactionToTimeRatio [satisfaction=" + satisfaction + ", time=" + time + ", satisfactionToTimeRatio="
				+ satisfactionToTimeRatio + "]";
	}

	public SatisfactionToTimeRatio(Long satisfaction, Long time) {
		this.satisfaction = satisfaction;
		this.time = time;
		this.satisfactionToTimeRatio = (double) (this.satisfaction / this.time);
	}

	public SatisfactionToTimeRatio(Long satisfaction, Long time, Double satisfactionToTimeRatio) {
		this.satisfaction = satisfaction;
		this.time = time;
		this.satisfactionToTimeRatio = satisfactionToTimeRatio;
	}
	
	public SatisfactionToTimeRatio(){
		
	}

	public Long getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(Long satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Double getSatisfactionToTimeRatio() {
		return satisfactionToTimeRatio;
	}

	public void setSatisfactionToTimeRatio(Double satisfactionToTimeRatio) {
		this.satisfactionToTimeRatio = satisfactionToTimeRatio;
	}

	private Long satisfaction;
	private Long time;

	private Double satisfactionToTimeRatio;

	@Override
	public int compareTo(SatisfactionToTimeRatio o) {
		if(o.satisfactionToTimeRatio < this.satisfactionToTimeRatio)
			return -1;
		if(o.satisfactionToTimeRatio > this.satisfactionToTimeRatio)
			return 1;
		return 0;
	}
}
