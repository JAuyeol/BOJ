import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double gpa = 0, credit_sum = 0;
		char grade;
				
		for(int i=0;i<20;i++) {
			double credit = 0; 
			double sum = 0;
			
			String str_arr[] = sc.nextLine().split(" ");
			grade = str_arr[2].charAt(0);
			
			credit += Double.parseDouble(str_arr[1]);
			
			switch(grade) {
			case 'A':
				if(str_arr[2].charAt(1) == '+') sum += 4.5;
				else sum += 4.0;
				break;
			case 'B':
				if(str_arr[2].charAt(1) == '+') sum += 3.5;
				else sum += 3.0;
				break;
			case 'C':
				if(str_arr[2].charAt(1) == '+') sum += 2.5;
				else sum += 2.0;
				break;
			case 'D':
				if(str_arr[2].charAt(1) == '+') sum += 1.5;
				else sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			case 'P':
				sum += 0;
				credit = 0;
				break;
			}
			credit_sum += credit;
			gpa += credit*sum;
		}
		sc.close();

		System.out.println(gpa/credit_sum);
	}
}
