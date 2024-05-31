package branchingStatement;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		int a=10,b=10,c=10;
		
		if(a>b && a>c)
		{
			
			System.out.println("a is greater" +a);
		}
		if(b>a && b>c)
		{
			System.out.println("b is greater" +b );
		}
		if(c>a && c>b)
		{
			System.out.println("c is greater" +c);
		}
		else
			System.out.println("all are equal");//in any if else block is always optional
	}

}
