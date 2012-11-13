import java.util.ArrayList;
import java.util.HashMap;

public class TowersOfHanoi {
	public static HashMap<Integer, String> numbers;

	public static void main(String[] args) {
		numbers = new HashMap<Integer, String>();
		numbers.put(1, "a");
		numbers.put(2, "b");
		numbers.put(3, "c");
		System.out.println(move(5, 1, 3).size());
		for (String str : move(5, 1, 3)) {
			System.out.println(str);
		}
	}

	public static ArrayList<String> move(int num, int startPole, int endPole) {
		ArrayList<String> result = new ArrayList<String>();
		int intermediate = 6 - startPole - endPole;
		if (num == 1) {
			return result;
		}
		result.addAll(move(num - 1, startPole, intermediate));
		result.add("move " + num + " from " + numbers.get(startPole) + " to "
				+ numbers.get(endPole));
		result.addAll(move(num - 1, intermediate, endPole));
		return result;
	}
}
