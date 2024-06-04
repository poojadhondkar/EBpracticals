package staticdemo;


class staticexample
{
	static int staticx=1000;
	int x=10;
	
	public void printval(int i)
	{
		x=i;
		System.out.println("staticx"+staticx);
		System.out.println("staticx"+x);
		System.out.println("..........");
	}
	
	
	
}



public class StaticvarDemo {

	public static void main(String[] args) {
		
		staticexample s1=new staticexample();
		staticexample s2=new staticexample();
		staticexample s3=new staticexample();
		
		staticexample.staticx=3000;
		
		s1.printval(10);
		s2.printval(20);
		s3.printval(30);
		
		
		
		}

}
