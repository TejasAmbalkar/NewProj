package Q7;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the marks");
		
		int marks=sc.nextInt();
		
		if(marks<25)
		System.out.println("F");
		else if(marks>=25 to marks<45)
			System.out.println("E");
		else if(marks>=45 to marks<50)
			System.out.println("D");
		else if(marks>=50 to marks<60)
			System.out.println("C");
		else if(marks>=60 to marks<80)
			System.out.println("B");
		else if(marks>80)
			System.out.println("A");
		
			
			
	}

}
