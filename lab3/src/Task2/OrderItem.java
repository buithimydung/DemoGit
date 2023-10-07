package Task2;
	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Comparator;

	public class OrderItem implements Comparable<OrderItem> {
			private Product p;
			private int quality;
			
			public OrderItem(Product p, int quality) {
				this.p = p;
				this.quality = quality;
			}
			public Product getP() {
				return p;
			}
			public int getQuality() {
				return quality;
			}
			public double getCost() {
				return p.getPrice() * quality;
			}
			@Override
			public int compareTo(OrderItem o) {
				return p.getId().compareTo(o.p.getId());
			}
		    public String toString() {
				return p +" :" + quality;
		    }
	}


