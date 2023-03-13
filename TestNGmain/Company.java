package ustbatchno3.TestNG;

public class Company {
	private String cities;
	private int price_with;
	private int price_without;
	

	public Company(String cities, int price_with, int price_without) {
		super();
		this.cities = cities;
		this.price_with = price_with;
		this.price_without = price_without;
	}

	

	public String getCities() {
		return cities;
	}



	public void setCities(String cities) {
		this.cities = cities;
	}



	public int getPrice_with() {
		return price_with;
	}



	public void setPrice_with(int price_with) {
		this.price_with = price_with;
	}



	public int getPrice_without() {
		return price_without;
	}



	public void setPrice_without(int price_without) {
		this.price_without = price_without;
	}

public double total(int sqft) {
	return ((sqft*price_with)+(sqft*price_without));
}
}
	