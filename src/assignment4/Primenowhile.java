package assignment4;

public class Primenowhile {

	public static void main(String[] args) {
		
		int n=5;
		int a=0;
		int i=2;
		while(i<n)
		{
		if(n%i==0)
		{
			a=1;
		}
		i++;
		}
			if(a==0)
			{
			System.out.println(" number is prime:- "+n);
		}
		else
		{
			System.out.println("number is not prime:- "+n);
		}
		
	}

}
