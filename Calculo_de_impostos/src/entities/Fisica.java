package entities;

public class Fisica extends Pessoa {
	
	private Double outgoingsHealth;
	
	public Fisica() {
	}

	public Fisica(String name, Double anualIncome, Double tax, Double outgoingsHealth) {
		super(name, anualIncome, tax);
		this.outgoingsHealth = outgoingsHealth;
	}

	public Double getOutgoingsHealth() {
		return outgoingsHealth;
	}

	public void setOutgoingsHealth(Double outgoingsHealth) {
		this.outgoingsHealth = outgoingsHealth;
	}

	@Override
	public Double CalculationTax() {
		return (getAnualIncome()*getTax())-(outgoingsHealth*0.5);
	}
}
