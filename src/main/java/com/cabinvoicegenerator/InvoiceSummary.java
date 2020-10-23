package com.cabinvoicegenerator;

public class InvoiceSummary {
	private final int numOfRides;
	private final double totalFare;
	private final double averageFare;

	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare=this.totalFare/this.numOfRides;

	}
}
