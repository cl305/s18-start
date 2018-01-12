import java.io.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("data/hello_unicode.txt"), "UTF-8");
		in.useDelimiter("\\Z");
		String text = in.next();
		String[] lines = text.split("\\n");

		for (int k = 0; k < lines.length; k = k + 1) {
			System.out.println(lines[k]);
		}
		in.close();
	}
}
