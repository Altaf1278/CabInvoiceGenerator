package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {

	private final double totalFare;
	private final double averageFare;
	private int numOfRides = 0;

	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.numOfRides;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.averageFare, averageFare) == 0;

	}
}
