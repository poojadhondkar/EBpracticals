package assignments;

import java.util.Scanner;

public class EvenOddnumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n=scanner.nextInt();
		
		if(n%2==0)
		{
			System.out.println(" number is even:- "+n);
		}
		else
		{
			System.out.println("number is odd:- "+n);
		}
		
         scanner.close();
	}

}
