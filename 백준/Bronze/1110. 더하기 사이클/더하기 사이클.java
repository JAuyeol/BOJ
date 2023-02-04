import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
        int x = n;
        int count = 0; 
        
        while (true) {
            int ten = x / 10; 
            int one = x % 10; 
 
            x = one * 10 + (ten + one) % 10; 
            
            count++;
 
            if(x == n) break;
           
        }
 
        System.out.println(count);
        
        br.close();
	}
}

