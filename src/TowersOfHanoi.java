import java.util.ArrayList;

public class TowersOfHanoi {

	public static void main(String[] args) {
		for (String str : move(5, "a", "c")) {
			System.out.println(str);
		}
	}

	public static ArrayList<String> move(int num, String startPole,
			String endPole) {
		ArrayList<String> result = new ArrayList<String>();
		if (num == 1) {
			return result;
		}
		result.addAll(move(num - 1, startPole, "b"));
		move(1, startPole, endPole);
		result.add("move " + num + " from " + startPole + " to " + endPole);
		result.addAll(move(num - 1, "b", endPole));
		return result;
	}
}
