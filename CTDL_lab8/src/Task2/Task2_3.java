package Task2;
import java.util.*;
public class Task2_3 {
	

	
	    private Map<String, List<Integer>> MyWordPositionApp = new HashMap<>();
	    private Map<String, List<String>> Task2_2_ = new HashMap<>();

	    // ... (add method and other methods)

	    

	    public void displayTextFileContent() {
	        System.out.println("Text File Content:");

	        List<String> sortedWords = new ArrayList<>(MyWordPositionApp.keySet());
	        Collections.sort(sortedWords);

	        for (String word : sortedWords) {
	            System.out.print(word.toUpperCase() + " ");
	            List<Integer> positions = MyWordPositionApp.get(word);
	            List<String> originalWords = Task2_2_.get(word);
	            Collections.sort(positions);

	            for (int i = 0; i < positions.size(); i++) {
	                System.out.print(originalWords.get(i) + "[" + ((positions.get(i) < 0) ? -positions.get(i) : positions.get(i)) + "]");
	                if (i < positions.size() - 1) {
	                    System.out.print(", ");
	                }
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
	        wordPositionApp.displayTextFileContent();
	    }
	}
	