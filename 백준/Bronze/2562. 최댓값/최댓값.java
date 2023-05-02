import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array1[] = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = Integer.parseInt(br.readLine());
			if(array1[i]>max) { 
				max = array1[i]; 
				index = i+1; 
			}
		}
		br.close();
		
		System.out.println(max);;
		System.out.println(index);
		
	}

}