package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i < 10; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}	
			System.out.println();
	}
 }
}

