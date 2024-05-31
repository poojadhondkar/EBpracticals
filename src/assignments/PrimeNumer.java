package assignments;

import java.util.Scanner;

public class PrimeNumer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n=scanner.nextInt();
		int a=0;
		for (int i=2;i<n;i++)
		{
		if(n%i==0)
		{
			a=1;
		}
		}
			if(a==0)
			{
			System.out.println(" number is prime:- "+n);
		}
		else
		{
			System.out.println("number is not prime:- "+n);
		}
		
		
         scanner.close();
	}

}
