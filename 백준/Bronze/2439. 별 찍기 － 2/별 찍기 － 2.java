import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 숫자형의 문자열을 인자 값으로 받으면 해당 값을 10진수 Integer로 변환해줌
		
		for(int i=1;i<=n;i++) { // 1 		2 3 4 
			for(int j=n;j>i;j--) { // 5 4 3 2 1
//				System.out.print(" ");
				bw.write(" ");
			}
			for(int k=1;k<=i;k++) {
//			System.out.print("*");
				bw.write("*");
			}
			bw.write("\n");		
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

