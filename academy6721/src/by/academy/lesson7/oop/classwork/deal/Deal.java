package by.academy.lesson7.oop.classwork.deal;

import by.academy.lesson7.oop.deal.Meat;
import by.academy.lesson7.oop.deal.Milk;
import by.academy.lesson7.oop.deal.Product;
import by.academy.lesson7.oop.deal.Vine;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 2;

	private String date;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public Double deal() {
		Double checkSum = 0.0;

		for (Product tmp : products) {
			if (tmp != null) {
				double d = tmp.getPrice() * tmp.getQuantity() * tmp.discount();

				if (tmp instanceof Milk) {
					System.out.print("Milk: ");
				} else if (tmp instanceof Meat) {
					System.out.print("Meat: ");
				} else if (tmp instanceof Vine) {
					System.out.print("Vine: ");
				}
				System.out.println(tmp.getPrice() + " x " + tmp.getQuantity() + " x " + tmp.discount() + " = " + d);
				checkSum += d;
			}
		}
		System.out.println("-----------------");
		System.out.println("Total price: " + checkSum);

		return checkSum;
	}
}
