package assignments;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter age");
		int age=scanner.nextInt();
		
		if(age<=1)
		System.out.println("infant group");
		else if(age==2 || age<=3)
		{
		System.out.println("toddler" );
		}
		else if(age==4 || age<=12)
		{
		System.out.println(" child");
		}
		else if(age==13 || age<=19)
		{
			System.out.println(" teenage");
		}
		else if(age==20 || age<=64)
		{
			System.out.println(" adult");
		}
		else 
			System.out.println("senior");//in any if else block is always optional
		
scanner.close();
	}

}
