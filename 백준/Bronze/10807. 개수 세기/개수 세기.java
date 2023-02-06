import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수의 개수 n 입력받기
		int array1[] = new int[n];
		int count = 0; 
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = sc.nextInt(); // array1 배열에 값들을 저장
			
		}
		
		int x = sc.nextInt();
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]==x) count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
