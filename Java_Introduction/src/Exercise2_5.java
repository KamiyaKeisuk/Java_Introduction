import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_5 {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		
		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		
		System.out.println( "平均値=" + ( ( x + y ) / 2 ) );
	}
}
