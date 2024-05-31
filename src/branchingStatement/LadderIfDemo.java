package branchingStatement;

public class LadderIfDemo {

	public static void main(String[] args) {

	      int a=9,b=3,c=10;
			
			if(a>b && a>c)
			{
				System.out.println("a is greater" +a);
			}
			else if(b>a && b>c)
			{
				System.out.println("b is greater" +b );
			}
			else if(c>a && c>b)
			{
				System.out.println("c is greater" +c);
			}
			else
				System.out.println("all are equal");//in any if else block is always optional
			

	}

}
