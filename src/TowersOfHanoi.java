public class TowersOfHanoi {
	public static int count = 0;

	public static String[] move(int num, int startPole, int endPole) {
		count++;
		System.out.println(count);
		if (num == 0) {
			return null;
		}
		int intermediatePole = 6 - startPole - endPole;
		move(num - 1, startPole, intermediatePole);
		move(1, startPole, endPole);
		System.out.println("move " + num + "from " + startPole + "to "
				+ endPole);
		move(num - 1, intermediatePole, endPole);
		return null;
	}

	public static void main(String[] args) {
		move(3, 1, 3);// move 5 disks from pole 1 to pole 3
	}
}
