package fixacao118.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order(String status, Client client) {

		initMoment();
		setStatus(status);
		this.client = client;

	}

	public Date getMoment() {
		return moment;
	}

	public String getStatus() {
		return status.toString();
	}
	
	public void setStatus(String status) {
		this.status = OrderStatus.valueOf(status);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}

	public Double total() {

		Double total = 0.0;

		for (OrderItem item : items) {
			total += item.subTotal();
		}

		return total;

	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	private void initMoment() {
		this.moment = new Date();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY: ");
		sb.append("\nOrder moment: ");
		sb.append(moment);
		sb.append("\nOrder status: ");
		sb.append(status);
		sb.append("\n");
		sb.append(client.toString());
		sb.append("\nOrder items: \n");
		
		for (OrderItem item : items) {
			sb.append(item.toString());
			sb.append("\n");
		}
		
		sb.append("Total price: $");
		sb.append(total());
		
		return sb.toString();
		
	}

}
