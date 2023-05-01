import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer strtk = new StringTokenizer(br.readLine()," ");
		
		long n1 = Long.parseLong(strtk.nextToken());
		long n2 = Long.parseLong(strtk.nextToken());
		long n3 = Long.parseLong(strtk.nextToken());
		
		System.out.println(n1 + n2 + n3);
	}

}