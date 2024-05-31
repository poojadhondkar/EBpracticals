package loops;

public class Factorialdowhile {

	public static void main(String[] args) {
		
		
		int n=5;
		
		int x=1;
		int fact=1;
		
		do {
			fact=fact*x;
			x++;
		}while(x<=n);
		
		System.out.println("factorial of number"+fact);
		}
		
	}


