
public class test03 {
	public static void main(String[] args) {
		int[] aray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i : aray) {
            System.out.print(i);
            if (i < 10) {
            	System.out.print(",");
            }
		}
	}
}
