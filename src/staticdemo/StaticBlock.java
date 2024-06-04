package staticdemo;

class staticblockdemo
{
	static int code=1001;
	
	static
	{
	code=1005;
	System.out.println("code"+code);
	}
}





public class StaticBlock {

	public static void main(String[] args) {
		
		new staticblockdemo();
	}

}
