import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int busket = sc.nextInt(); 
		int count = sc.nextInt(); 
		
		int n1, n2, temp = 0; 
		
		int array1[] = new int[busket]; 
		
		for(int i=0;i<array1.length;i++) { 
			array1[i] = i+1; 
		}
		
		for(int i=0;i<count;i++) {
			n1 = sc.nextInt()-1; 
			n2 = sc.nextInt()-1;
			
			temp = array1[n1];
			array1[n1] = array1[n2];
			array1[n2] = temp;
			
		}
		
		sc.close();
		
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
	}
}

