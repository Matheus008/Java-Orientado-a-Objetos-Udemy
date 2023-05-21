package entities;

public class Juridica extends Pessoa {
	
	private Integer numberClerk;
	
	public Juridica() {
	}

	public Juridica(String name, Double anualIncome, Double tax, Integer numberClerk) {
		super(name, anualIncome, tax);
		this.numberClerk = numberClerk;
	}
	
	public Integer getNumberClerk() {
		return numberClerk;
	}

	public void setNumberClerk(Integer numberClerk) {
		this.numberClerk = numberClerk;
	}

	@Override
	public Double CalculationTax() {
		return getAnualIncome()*getTax();
	}

}
