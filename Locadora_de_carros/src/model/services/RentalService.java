package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerDay;
	private Double privePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double privePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.privePerHour = privePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;

		double basicPayment;
		if(hours <= 12) {
			basicPayment = privePerHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
}
