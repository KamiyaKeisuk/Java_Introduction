
public class test02 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
				count += 1;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
	}
}
