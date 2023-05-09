import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array1[] = new int[30];  
		int stu = 0;
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = 0;
		}
		
		for(int i=0;i<28;i++) {
			stu = Integer.parseInt(br.readLine())-1; 
			array1[stu] = stu+1;	
		}
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]==0) System.out.println(i+1);
		}
		
		br.close();
		
	}

}	