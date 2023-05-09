import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int array1[] = new int[30]; // 0 ~ 29, 30개 
		int stu = 0;
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = 0;
		}
		
		for(int i=0;i<28;i++) {
			stu = sc.nextInt()-1;
			array1[stu] = stu+1;		
		}
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]==0) System.out.println(i+1);
		}
		
		sc.close();
		
	}

}	