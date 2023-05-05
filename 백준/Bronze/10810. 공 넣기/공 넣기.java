import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int busket = sc.nextInt(); // 5개의 바구니
		int count = sc.nextInt(); // 4번 실행 
		
		int n1, n2, ball = 0; // n1번째 바구니부터 n2번째 바구니, ball
		
		int array1[] = new int[busket]; // 5개의 배열(바구니) 생성 
		
		for(int i=0;i<count;i++) { // 4번 실행
			n1 = sc.nextInt();  // n1번째 바구니 입력받기 1번째 > 0번째
			n2 = sc.nextInt(); // n2번째까지의 바구니 입력받기 2번째 바구니까지 > 1번째
			ball = sc.nextInt(); // 넣을 공 입력받기 
			
			for(int j=n1-1;j<=n2-1;j++) { // n1 ~ n2 
				array1[j] = ball;
			}
		}
		
		for(int i=0;i<busket;i++) {
			System.out.print(array1[i]+" ");
		}
	}
}

