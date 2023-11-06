package Task2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
public class Task2_1 {
	public interface Predicate<T> {
		 public boolean test(T obj);
		}
		// Remove every object, obj, from coll for which p.test(obj)
		// is true. (This does the same thing as coll.removeIf(p).)
		public static <T> void remove(Collection<T> coll, Predicate<T> p) {
		Iterator<T> iter = coll.iterator();
		while (iter.hasNext()){
			T next = iter.next();
			if (p.test(next));
			iter.remove();
		}
			
		}
			

			   
		// Remove every object, obj, from coll for which
		// pr.test(obj) is false. (That is, retain the
		// objects for which the predicate is true.)
		
		
			 public static <T> void retain(Collection<T> coll, Predicate<T> pr) {
			        Iterator<T> iterator = coll.iterator();
			        while (iterator.hasNext()) {
			            T obj = iterator.next();
			            if (!pr.test(obj)) {
			                iterator.remove();
			            }
			        }
			    
		}
		private static void While(boolean hasNext) {
			
			
		}
		// Return a Set that contains all unique objects, obj,
		// from the collection, coll, such that p.test(obj)
		// is true.
		
			 public static <T> Set<T> collect(Collection<T> coll, Predicate<T> p) {
			        Set<T> resultSet = new HashSet<>();

			        for (T obj : coll) {
			            if (p.test(obj)) {
			                resultSet.add(obj);
			            }
			        }

			        return resultSet;
			    }

			    public static void main(String[] args) {
			        // Example usage:
			        Collection<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");

			        // Define a predicate to select strings starting with 'a'
			        Predicate<String> startsWithA = s -> s.startsWith("a");

			        Set<String> selectedStrings = collect(strings, startsWithA);

			        System.out.println("Selected strings: " + selectedStrings);
			    }
			

		
		// Return the index of the first item in list
		// for which the predicate is true, if any.
		// If there is no such item, return -1.
		
			public static <T> int find(Collection<T> coll, Predicate<T> p) {
		        int index = 0;

		        for (T obj : coll) {
		            if (p.test(obj)) {
		                return index;
		            }
		            index++;
		        }

		        return -1;
		    }


		    public static void main(String[] args) {
		        // Example usage:
		        Collection<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");

		        // Define a predicate to find the first string containing 'e'
		        Predicate<String> containsE = s -> s.contains("e");

		        int index = find(strings, containsE);

		        if (index != -1) {
		            System.out.println("First element containing 'e' found at index: " + index);
		        } else {
		            System.out.println("No element found matching the condition.");
		        }
		    
		
}

}
