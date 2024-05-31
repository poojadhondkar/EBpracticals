package basic;

public class Bignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=20;
		int y=10;
		
		int res=big(x,y);
		
		System.out.println("bigest number "+res);
	}
	
	public static int big(int a, int b)
	{
		
		if(a>b)
			return a;
		else
			return b;
	}

}
