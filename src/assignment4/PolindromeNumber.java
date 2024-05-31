package assignment4;



public class PolindromeNumber {
	
		    public static void main(String[] args) {

				int n,rev=0,r;
				
				n=121;
				int newn=n;
				while(n!=0)
				{
					r=n%10;
					rev=rev*10+r;
					n=n/10;
				}
		        if(newn==rev)
		        	System.out.println("number is polindrome");
		        else
		        	System.out.println("number is not polindrome");
		    }
		}
	


