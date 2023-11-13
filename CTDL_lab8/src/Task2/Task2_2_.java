package Task2;


	import java.util.*;

	public class Task2_2_ {

	    private Map<String, List<Integer>> wordPositionMap = new HashMap<>();

	    // ... (add method and other methods)

	    public void displayWords() {
	        System.out.println("Word Positions:");
	        List<String> sortedWords = new ArrayList<>(wordPositionMap.keySet());
	        Collections.sort(sortedWords);

	        for (String word : sortedWords) {
	            System.out.print(word.toUpperCase() + " ");
	            List<Integer> positions = wordPositionMap.get(word);
	            Collections.sort(positions);

	            for (int position : positions) {
	                System.out.print((position < 0) ? -position : position);
	                System.out.print(", ");
	            }

	            // Remove the trailing comma and space
	            if (!positions.isEmpty()) {
	                System.out.print("\b\b"); // Move the cursor back to remove the last comma and space
	            }

	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        MyWordPositionApp wordPositionApp = new MyWordPositionApp();
	        wordPositionApp.add("WHAT", 1);
	        wordPositionApp.add("IS", 2);
	        wordPositionApp.add("YOUR", 3);
	        wordPositionApp.add("NAME", 4);
	        wordPositionApp.displayWordPositions();
	    }
	}

