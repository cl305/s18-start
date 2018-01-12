import java.io.*;
import java.util.*;

public class SimpleWordCount {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(FileSelector.selectFile());
		in.useDelimiter("\\Z");
		String text = in.next();
		String[] words = text.split("\\s+");
		System.out.println("Total # words = " + words.length);

		for (int k = 0; k < words.length; k = k + 1) {
			System.out.println(words[k]);
		}
		in.close();
	}
}
