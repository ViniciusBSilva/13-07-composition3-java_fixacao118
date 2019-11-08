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

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public Client getClient() {
		return client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Date getMoment() {
		return moment;
	}

	public String getStatus() {
		return status.toString();
	}

	private void initMoment() {
		this.moment = new Date();
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public void setStatus(String status) {
		this.status = OrderStatus.valueOf(status);
	}

	public Double total() {

		Double total = 0.0;

		for (OrderItem item : items) {
			total += item.subTotal();
		}

		return total;

	}

}
