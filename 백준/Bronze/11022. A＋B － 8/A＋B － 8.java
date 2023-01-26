import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int a[] = new int[n]; //이전과 다르게 배열로 선언 
		int b[] = new int[n]; // 숫자까지 출력하기 위해서 선언한 것
		int array[] = new int[n];
		
		for(i = 0;i < n;i++) 
		{
			a[i] = sc.nextInt();
			b[i] =sc.nextInt();
			array[i] = a[i]+b[i];
		}
		
		for(i = 0;i < n;i++) 
		{
			System.out.print("Case #");
			System.out.print((i+1)+": ");
			System.out.println(a[i]+" + "+b[i]+" = "+array[i]);
		}
		
	}

}