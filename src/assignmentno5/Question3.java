package assignmentno5;

import java.util.Scanner;

class  calc
{
	
	
	public void sum(int a,int b,int c)
	{
		int sum= a+b+c;
		
		System.out.println("The sum  is: "+ sum);
	}
	
	public void sub(int a,int b,int c)
	{
		int sub= a-b-c;
		
		System.out.println("The substraction is: "+ sub);
	}

	public void mul(int a,int b,int c)
	{
		int mul= a*b*c;
		
		System.out.println("The multiplication is: "+ mul);
	}

	public void div(int a,int b,int c)
	{
		int div= a/b/c;
		
		System.out.println("The division  is: "+ div);
		}
}


public class Question3 {

	public static void main(String[] args) {
		
		Scanner s  =new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int m1=s.nextInt();
		System.out.print("Enter the second number: ");
		int m2=s.nextInt();
		System.out.print("Enter the third number: ");
		int m3=s.nextInt();
		
		calc math1=new calc();
		
		math1.sum(m1,m2,m3);
		math1.sub(m1,m2,m3);
		math1.mul(m1,m2,m3);
		math1.div(m1,m2,m3);
		
calc math2=new calc();
		
		math2.sum(m1,m2,m3);
		math2.sub(m1,m2,m3);
		math2.mul(m1,m2,m3);
		math2.div(m1,m2,m3);
		
		s.close();
		
	}

}
