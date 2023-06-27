import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		// nextLine은 Enter를 치기 전까지 쓴 문자열을 모두 리턴
		// next는 공백 전까지 입력받은 문자열을 리턴 
		sc.close();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
	}
}