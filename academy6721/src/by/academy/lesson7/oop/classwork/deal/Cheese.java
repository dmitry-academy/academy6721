package by.academy.lesson7.oop.classwork.deal;

public final class Cheese extends Product {
	private Integer age;

	public Cheese(double price, String type, String producerName, int quantity, Integer age) {
		super(price, type, producerName, quantity);
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public Double discount() {
		if (age > 20) {
			return 0.83;
		}
		return 1.0;
	}

}
