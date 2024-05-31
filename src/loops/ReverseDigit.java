package loops;

public class ReverseDigit {

	public static void main(String[] args) {
     
		int n,rev=0,r;
		
		n=154;//1+5+4=10
		
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("reverse number is "+rev);
	}

}
