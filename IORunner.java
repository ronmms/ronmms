
import java.io.*;
import java.util.*;

public class IORunner {

	static String IN_FILE_PATH = "/home/ron/Downloads/ExampleInputs/Romeo and Juliet  Entire Play.txt";

	static String OUT_FILE_PATH = "/home/ron/Downloads/ExampleInputs/out.txt";

	public static void main(String[] args) {
		FileInputStream input;
		FileOutputStream output;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		try {
			input = new FileInputStream(IN_FILE_PATH);
			output = new FileOutputStream(OUT_FILE_PATH);
			int x;

			while ((x = input.read()) != -1) // Keep going until forced out.
			// for (int i = 0; i < 100; i++) // Check only 100 first bytes.
			{
				// System.out.print(x);
				// System.out.print((char)x);
				output.write(x);
				if (!map.containsKey((char) x))
					map.put((char) x, 1);
				else {
					int count = map.get((char) x);
					map.put((char) x, count + 1);
				}
			}
			ArrayList<HuffmanNode> freq = new ArrayList<>();
			map.forEach((k, v) -> {
				freq.add(new HuffmanNode(k, v));
			});
			Collections.sort(freq);
			for (int i = 55; i < 71; i++)
				System.out.println(freq.get(i).toString());

			input.close();
			output.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
