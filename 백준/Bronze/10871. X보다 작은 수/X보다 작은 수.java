import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer strtk = new StringTokenizer(br.readLine()," ");
	    
		int n = Integer.parseInt(strtk.nextToken());
		int x = Integer.parseInt(strtk.nextToken());
		
		strtk = new StringTokenizer(br.readLine()," "); // 두 번째 줄 입력을 위해 다시 선언
		
		for(int i=0;i<n;i++) {
        	int ans = Integer.parseInt(strtk.nextToken());	
        	if(ans<x) System.out.print(ans+" ");
        }
                
	}
}

