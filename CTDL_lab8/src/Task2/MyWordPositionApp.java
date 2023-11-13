package Task2;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class MyWordPositionApp {

	    private Map<String, List<Integer>> wordPositionMap = new HashMap<>();

	    public static void main(String[] args) {
	        MyWordPositionApp wordPositionApp = new MyWordPositionApp();
	        wordPositionApp.add("WHAT", 1);
	        wordPositionApp.add("IS", 2);
	        wordPositionApp.add("YOUR", 3);
	        wordPositionApp.add("NAME", 4);
	        wordPositionApp.displayWordPositions();
	    }

	    public void add(String word, int position) {
	        word = word.toLowerCase(); // Convert the word to lowercase for case-insensitive comparison

	        // If the word is not in the map, create a new list and add the position
	        wordPositionMap.putIfAbsent(word, new ArrayList<>());

	        // If the word is at the end of a line, negate the position
	        int adjustedPosition = (position < 0) ? position : -position;

	        // Add the adjusted position to the list
	        wordPositionMap.get(word).add(adjustedPosition);
	    }

	    public void displayWordPositions() {
	        System.out.println("Word Positions:");
	        for (Map.Entry<String, List<Integer>> entry : wordPositionMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

		public void displayTextFileContent() {
			// TODO Auto-generated method stub
			
		}
	}

