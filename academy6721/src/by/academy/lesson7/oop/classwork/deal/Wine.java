package by.academy.lesson7.oop.classwork.deal;

public class Wine extends Product {
	private String country;

	public Wine(double price, String type, String producerName, int quantity, String country) {
		super(price, type, producerName, quantity);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public Double discount() {
		if (country.equals("Georgia")) {
			return 0.8;
		}
		return 1.0;
	}

}
