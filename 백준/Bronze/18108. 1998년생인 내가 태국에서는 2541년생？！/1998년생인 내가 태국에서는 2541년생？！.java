import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year>=1000 && year<=3000) {
			System.out.println(year-543);
		}else
			System.out.println("1000 ~ 3000 사이의 년도를 입력");
	}
}