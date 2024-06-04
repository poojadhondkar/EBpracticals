package assignment6;

interface colleges
{
		public void add(int a,int b);
		public void sub(int a,int b);
	}
	class student implements colleges
	{
		
		public void add(int a,int b) 
		{
			int sum=a+b;
			System.out.println("addition is:- "+sum);
		}
		
		public void sub(int a,int b) 
		{
			int sub=a-b;
			System.out.println("substraction is:- "+sub);
			
		}
	}

public class Question2 {

	public static void main(String[] args) {
		
		
          student s = new student();
		
		  s.add(3,2);
		  s.sub(3,2);

	}

}
