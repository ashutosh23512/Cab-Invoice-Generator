package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	InvoiceGenerator invoicegenerator = null;

	@Before
	public void SetUp() throws Exception {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();

	}

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoicegenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);

	}

	@Test
	public void givenlessDistanceOrTime_ShouldReturnMinFAre() {
		double distance = 0.1;
		int time = 1;
		double fare = invoicegenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);

	}

	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1), };
		InvoiceSummary summary = invoicegenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
