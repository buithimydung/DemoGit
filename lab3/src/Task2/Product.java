package Task2;
	public class Product implements Comparable<Product>{
		private String id;
		private String name;
		private double price;
		private String type;
		
		public Product(String id, String name, double price, String type) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.type = type;
		}

		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getType() {
			return type;
		}
		public double getPrice() {
			return price;
        }
		
		@Override
		public String toString() {
			return "Product [00=" + id + ", 01=" + name + ", 02=" + price + ", 03=" + type + "]";
		}

		@Override
		public int compareTo(Product o) {
			int byName = this.name.compareTo(o.name);
			if(byName == 0)
			  return -Double.compare(price, o.price);
			return byName;
		}
		
}

