import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		int sol = (year%4==0 && year%100!=0 || year%400==0)?1:0;
		System.out.println(sol);
	
	}
}