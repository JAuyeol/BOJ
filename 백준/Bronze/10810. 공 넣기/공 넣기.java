import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int basket = sc.nextInt();
		int n = sc.nextInt(); // 반복할 횟수 
		int first = 0;
		int last = 0;
		int num = 0;
		int array1[] = new int[basket]; // 5개의 바구니 만듦
		
		for(int i=0;i<n;i++) {
			 first = sc.nextInt()-1;
			 last = sc.nextInt()-1;
			 num = sc.nextInt();
			 
			 for(int j=first;j<=last;j++) {
				 array1[j] = num;
			 }
			
		}
		
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		sc.close();
		
	}

}	