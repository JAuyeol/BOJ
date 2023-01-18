
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt(); 
		int time = sc.nextInt();
	
		minute = minute + time; 
		
		if(minute>=60) { 
			hour = hour + minute/60; 
			minute = minute % 60;
			
			
		}
		
		if(hour>=24) hour = hour - 24;

		System.out.println(hour+" "+minute);
		
		
		sc.close();
	}
}
