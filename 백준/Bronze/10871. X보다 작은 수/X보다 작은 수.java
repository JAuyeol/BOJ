import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수의 개수 n 입력받기
		int x = sc.nextInt(); // 정수 X
		ArrayList<Integer> arrList = new ArrayList<Integer>(n);
		
		int array1[] = new int[n];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = sc.nextInt();
			if(array1[i]<x) arrList.add(array1[i]);
		}
		
		int arrSize =arrList.size();
		Integer ansArray[] = arrList.toArray(new Integer[arrSize]);
		
		for(int i=0;i<ansArray.length;i++) 
			System.out.print(ansArray[i]+" ");
		
		sc.close();
	}
}
