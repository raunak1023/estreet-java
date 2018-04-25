package com.estreet.dashboard;

import java.util.List;

public class PastPowerUsage {

    private final List<String> months;
    private final List<Double> powerUsage;
    
	public PastPowerUsage(List<String> months, List<Double> powerUsage) {
		super();
		this.months = months;
		this.powerUsage = powerUsage;
	}
	
	public List<String> getMonths() {
		return months;
	}
	
	public List<Double> getPowerUsage() {
		return powerUsage;
	}
    
}
