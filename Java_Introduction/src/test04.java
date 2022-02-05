
public class test04 {
	public static void main(String[] args) {
	    int[] aray = new int[20];
	    int num = 0;
	    for (int i = 0; i < 20; i++) {
	    	    aray[i] = num += 5;
	    	    System.out.print(aray[i] + ",");
	    }
	}
}
