import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) { // 1 		2 3 4 
			for(int j=n;j>i;j--) { // 5 4 3 2 1
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
				
		
	}
}
