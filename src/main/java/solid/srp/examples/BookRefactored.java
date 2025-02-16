package solid.srp.examples;
import lombok.Data;

@Data
public class BookRefactored {
	
	
	// STEP 1: Retain all methods and data related to the Book class
	// STEP 2: Move the additional functionality to a different class
	private String name;
	private String author;
	private String text;

	// constructor, getters and setters

	// methods that directly relate to the book properties
	public String replaceWordInText(String word, String replacementWord) {
		return text.replaceAll(word, replacementWord);
	}

	public boolean isWordInText(String word) {
		return text.contains(word);
	}


}
