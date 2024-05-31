package classandobject;

class car
{
   int year;
   String model;//instance variable or data member
   
   public void readvalue(int y,String m)//data member function or method
   {
	 year=y;
	 model=m;
	   
   }
   
   public void printvalue()//data member function or method
   {
	   System.out.println("year is :-"+year);
	   System.out.println("model is:-"+model);
   }
}




public class Objectdemo {

	public static void main(String[] args) {
		
		car c =new car();//creation of object
		
		c.readvalue(2010, "i10");
		c.printvalue();
		

	}

}
