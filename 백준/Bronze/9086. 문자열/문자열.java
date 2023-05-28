import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력받을 횟수
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String a = sc.next();
			name[i] = a.substring(0,1)+a.substring(a.length()-1,a.length());
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);
		}
		
	}
}
