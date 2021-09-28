package Q8;

import java.util.Scanner;

public class checksqrect 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length=1,breadth=2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a length");
		
		length=sc.nextInt();
		breadth=sc.nextInt();
		
		if(length==breadth)
		{
			System.out.println("square");
		}
		else 
		{
			System.out.println("rectangle");
		}
	}
}


