package assignments;

import java.util.Scanner;

public class DayWeek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n=scanner.nextInt();
		
		if(n==1)
		{
			System.out.println("monday");
		}
		else if(n==2)
		{
			System.out.println("tuesday" );
		}
		else if(n==3)
		{
			System.out.println("wenesday");
		}
		else if(n==4)
			{
				System.out.println("thursday");
			}else if(n==5)
			{
				System.out.println("friday");
			}else if(n==6)
			{
				System.out.println("saturday");
			}else if(n==7)
			{
				System.out.println("sunday");
			}
			else
			System.out.println("plese enter right number ");//in any if else block is always optional
		scanner.close();
	}

}
