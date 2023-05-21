package entities;

public abstract class Pessoa {
	
	private String name;
	private Double anualIncome;
	private Double tax;

	public Pessoa() {
	}

	public Pessoa(String name, Double anualIncome, Double tax) {
		this.name = name;
		this.anualIncome = anualIncome;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public abstract Double CalculationTax();
	
}
