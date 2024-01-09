package scenarioBased.Java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private String name;
	private int quantity;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

}

public class TotalCostOfAllProducts {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Samsung", 1, 20091.20));
		productList.add(new Product("RealmeC55", 3, 8009.50));
		productList.add(new Product("Noika", 1, 800.50));

		double totalPrice = productList.stream().filter(q -> q.getQuantity() > 0)
				.mapToDouble(p -> p.getQuantity() * p.getPrice()).sum();
		System.out.println("Total price of the product is : " + totalPrice);

		productList.stream().filter(p -> p.getPrice() > 2000).forEach(s -> System.out.println(s.getName()));

		List<Integer> numbers = Arrays.asList(1, 34, 22, 13, 55, 4, 3, 87, 11, 22, 12);
		List<Integer> resultedNum = numbers.stream().filter(i -> i % 2 == 0).distinct().sorted()
				.collect(Collectors.toList());
		for (Integer integer : resultedNum) {
			System.out.print(integer + " , ");
		}
	}

}
