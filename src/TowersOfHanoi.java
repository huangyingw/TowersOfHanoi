public class TowersOfHanoi {

	public static String[] move(int num, char startPole, char endPole) {
    String[] result=new String[5];
		if (num == 1) {
			return null;
		}
		move(num - 1, startPole, 'b');
		move(1, startPole, endPole);
		System.out.println("move " + num + " from " + startPole + " to "
				+ endPole);
		move(num - 1, 'b', endPole);
		return null;
	}

	public static void main(String[] args) {
		move(5, 'a', 'c');// move 5 disks from pole 1 to pole 3
	}
}
