import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array1[] = new int[10];
		int compare[] = new int[42];
		int count = 0, num = 0;
		
		Arrays.fill(compare, 0);
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = sc.nextInt();
			num = array1[i] % 42; // 0,1,2 ,,, 41 까지 저장 
			
			compare[num] = num + 1;	// 0 > 0, 1 > 1, 2 > 2
		}
		for(int i=0;i<compare.length;i++) {
			if(compare[i]!=0) count++;	
		}
		
		System.out.println(count);
		
		
	}

}
