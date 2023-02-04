import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력을 받는다.
		int x = n; // n의 값을 복사
		int count = 0; // 사이클 횟수 
		
		
		while(true) {
			int ten = x/10; // 십의 자리 
			int one = x%10; // 일의 자리 
			
			x = one * 10 + (ten + one) % 10;
			
			count++;
			
			if(n==x)  // while을 통해 계산 > n과 x가 같아지게 되면 break 
				break;
		}
		System.out.println(count);
		sc.close();
	}
}
