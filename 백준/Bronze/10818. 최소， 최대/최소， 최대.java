import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer strtk = new StringTokenizer(br.readLine()," ");
		
		int array1[] = new int[n];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = Integer.parseInt(strtk.nextToken());
		}
		
		int min = array1[0];
		int max = array1[0];
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]>max) max = array1[i];
			if(array1[i]<min) min = array1[i];
		}
		System.out.println(min+" "+max);
		
	}
}

