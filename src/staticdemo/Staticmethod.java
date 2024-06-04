package staticdemo;

class staticdemo
{
	static int code=1001;
	
	int x;
	
	public void setx(int i)
	{
		x=i;
		
		System.out.println("x"+x);
	}
	
	public static void staticprint()
	{
		code=1005;
		System.out.println("code"+code);
		
	}
	
}








public class Staticmethod {

	public static void main(String[] args) {
		
		staticdemo s1=new staticdemo();
		staticdemo s2=new staticdemo();
		
		s1.setx(10);
		staticdemo.staticprint();
		s2.setx(20);
		staticdemo.staticprint();
		
		
		
		
		

	}

}
