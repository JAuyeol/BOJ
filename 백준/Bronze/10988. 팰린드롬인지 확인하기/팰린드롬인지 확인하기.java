import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		sc.close();
		int len = str.length();
		int ans = 1;
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				ans = 0;
			}
		}
		System.out.println(ans);
		
	}
}