package test;

public class NestedLoop {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
