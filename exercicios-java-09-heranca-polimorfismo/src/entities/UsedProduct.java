package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	private Date manufatureData;

	public UsedProduct(String name, Double price, Date manufatureData) {
		super(name, price);
		this.manufatureData = manufatureData;
	}

	public Date getManufatureData() {
		return manufatureData;
	}

	public void setManufatureData(Date manufatureData) {
		this.manufatureData = manufatureData;
	}
	
	@Override
	public String priceTag() {
		return this.getName() 
				+ " (usado) $ " + String.format("%.2f", this.getPrice()) 
				+ "(Data de fabricação: " + sdf.format(this.getManufatureData()) + ")";
	}

}
