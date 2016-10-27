package com.techolution.test;

import java.util.List;

public class Input {
	@Override
	public String toString() {
		return "Input [noOfInputs=" + noOfInputs + ", maxTime=" + maxTime + ", entries=" + entries + "]";
	}
	public Long getNoOfInputs() {
		return noOfInputs;
	}
	public void setNoOfInputs(Long noOfInputs) {
		this.noOfInputs = noOfInputs;
	}
	public Long getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
	}
	public List<SatisfactionToTimeRatio> getEntries() {
		return entries;
	}
	public void setEntries(List<SatisfactionToTimeRatio> entries) {
		this.entries = entries;
	}
	
	public Input(Long noOfInputs, Long maxTime, List<SatisfactionToTimeRatio> entries) {
		this.noOfInputs = noOfInputs;
		this.maxTime = maxTime;
		this.entries = entries;
	}

	private Long noOfInputs;
	private Long maxTime;	
	List<SatisfactionToTimeRatio> entries;
}
