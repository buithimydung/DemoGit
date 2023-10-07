package Task2;


	import java.util.ArrayList;
	import java.util.List;

	public class Order {
			private OrderItem[] items;
			
			public Order(OrderItem[] items) {
				this.items = items;
			}
			public double cost() {
			double totaCcost = 0.0;
		    
			for (OrderItem item : items) {
		//double itemCost = item.getQuality() *   item.p().getPrice();
				totaCcost += item.getCost();
				
			}
			return totaCcost;
			}

			// using binary search approach
			public boolean contains(Product p) {
			int low = 0;
			int hight = items.length - 1;
			
			while (low <= hight) {
				int mid = low + (hight - low) / 2;
				Product midP = items[mid].getP();
				// so sánh
				if (midP.getId().equals(p.getId())) { // neu ID cua midP = ID cua p 
					return true;
				}else if (midP.getId().compareTo(p.getId()) < 0) { // neu ID cua midP < ID cua p 
					low = mid + 1; //thu hep pham vi tim kiem o nua tren
				}else {
				    hight = mid - 1;	
				}
			}
			// không tìm kết quả ra 
			return false;
			}
			// get all products based on the given type using 
			//linear search
			public Product[] filter(String type) {
			List<Product> filterP = new ArrayList<>();
			 
			for (OrderItem item : items) {
				Product p = item.getP();
				// so sánh
				if (p.getType().equals(p.getType())); {
					filterP.add(p);
				}
			}
			return filterP.toArray(new Product[0]);
			}
			
		
		
	}


