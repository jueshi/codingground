import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		input.add("");
		input.add("a");
		input.add("aa");
		input.add("aaa");
		input.add("ab");
		input.add("abb");
		input.add("aabb");
		input.add("aaab");
		input.add("abbb");
		input.add("b");


		for (String ssn : input) {
			if (ssn.matches("a?b+")) {
				System.out.println("Found match: " + ssn);
			}
		}
	}
}