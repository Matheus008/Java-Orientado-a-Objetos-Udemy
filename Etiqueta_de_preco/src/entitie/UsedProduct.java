package entitie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
		
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+ " (Used) ");
		sb.append(" $ "+String.format("%.2f",getPrice()) + " ");
		sb.append("(Manufacture date: "+sdf.format(manufactureDate)+")");
		return sb.toString();
	}
	
	
	
}
