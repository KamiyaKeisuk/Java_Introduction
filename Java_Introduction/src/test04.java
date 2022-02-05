public class test04 {
	public static void main(String[] args) {
	    int[] aray = new int[20];
	    int num = 0;
	    for (int i = 0; i < 10; i++) {
	    	if((aray[i] = num += 5) % 2 != 0){
	    		System.out.print(aray[i] + ",");
	    	}
	    }
	    for (int i = 11; i < 20; i++) {
	    	if((aray[i] = num += 5) % 2 == 0) {
	    		System.out.print(aray[i] + ",");
	    	}
	    }
	}
}
