
public class Chapter08 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}
		int array[] = { 1, 2, 4, 57, };
		for (int s = 0; s < array.length; s++) {
			System.out.println(array[s]);
		}
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}

	}
}
