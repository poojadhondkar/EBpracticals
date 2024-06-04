package assignment6;

class collegs
{
	
	int a=3,b=2;
	
	public void add()
	{
		int sum=a+b;
		System.out.println("addition is:- "+sum);
		}
	
	public void sub() 
	{
		int sub=a-b;
		System.out.println("substraction is:- "+sub);
		
	}
}
public class Question3 {

	public static void main(String[] args) {
		collegs any = new collegs()
				{
				public void add()
				{
					int sum=a+b;
					System.out.println("addition is:- "+sum);
				}
				
				public void sub()
				{
					int sub=a-b;
					System.out.println("substraction is:- "+sub);
				}
	};
	
	any.add();
	any.sub();
}

}
