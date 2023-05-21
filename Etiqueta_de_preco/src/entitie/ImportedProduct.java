package entitie;

public class ImportedProduct extends Product {
		
	private Double customFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		 
		return getPrice() + customFee;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " ");
		sb.append(" $ "+String.format("%.2f", totalPrice())+" ");
		sb.append("(Custom fee: $ " + customFee+")" );
		return sb.toString();
	}
	
	
	
}
