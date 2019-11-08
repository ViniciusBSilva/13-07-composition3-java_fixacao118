package fixacao118.application;

import java.text.ParseException;
import java.util.Scanner;

import fixacao118.entities.Client;
import fixacao118.entities.Order;
import fixacao118.entities.OrderItem;
import fixacao118.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.println("How many items to this order? ");
		Integer numberOfItems = sc.nextInt();
		
		//sc.nextLine();
		
		Client client = new Client(clientName, email, birthDate);
		
		Order order = new Order(status, client);
		
		for (int i = 0; i < numberOfItems; i++) {
		
			System.out.printf("Enter %d item data: ", i);
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product newProduct = new Product(productName, price);
			OrderItem newOrderItem = new OrderItem(quantity, price);
			newOrderItem.setProduct(newProduct);
			
			order.addItem(newOrderItem);	
			
		}
		
		System.out.println(order);
		
		sc.close();
		
		
	}

}
