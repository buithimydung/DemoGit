package Task2;
	import java.lang.reflect.Array;
	import java.util.Arrays;
	import java.util.Comparator;

	public class TestOrder {
		public static void main(String[] args) {
			Product p1 = new Product("1", "Coca Cola", 9.0, "Drink");
			Product p2 = new Product("2", "Product 2", 5.0, "Type 2");
			Product p3 = new Product("3", "Product 3", 8.0, "Type 3");
			
			OrderItem i1 = new OrderItem(p1,2);
			OrderItem i2 = new OrderItem(p2,3);
			OrderItem i3 = new OrderItem(p3,1);
			OrderItem[] or1 = {i1,i2,i3};
			
//			double totaCcost = or1.length;
//			Integer[] arr = {1,3,0,2,4};
//			Array.sort(arr, new Comparator<Integer>() {
	//
//				@Override
//				public int compare(Integer o1, Integer o2) {
//					return o1 - o2;
//					System.out.println(Arrays.toString(Integer));
//				}
//			}
				Arrays.sort(or1);
				System.out.println(Arrays.toString(or1));
			
			//System.out.println(totaCcost);
		}
	}


