import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException{ // IOException을 통해 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n;i++) {
			String str = br.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			bw.write((a+b)+"\n"); // write는 개행이 안되기 때문에 "\n" 
		}
		br.close();
		bw.flush(); // 남아있는 데이터 모두 출력 
		bw.close();
	}
}
 