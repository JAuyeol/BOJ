import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수 입력 
		int line = sc.nextInt(); // 입력 줄 개수	
		int basket[] = new int[n];
		
		for(int i=0;i<basket.length;i++) {
			basket[i] = i+1;
		}
		
		for(int i=0;i<line;i++) {  
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;

			
			while(a<b) {
				int temp = basket[b];
				basket[b] = basket[a];
				basket[a] = temp;
				a++;
				b--;
			}
			
		}
		sc.close();
		for(int i=0;i<basket.length;i++) {
			System.out.print(basket[i]+" ");
		}
		
	}

}