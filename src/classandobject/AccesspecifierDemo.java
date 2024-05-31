package classandobject;

   class bird
  {
	  private int b_id;
	  
	  public String b_name;
	  
	  protected double price;
	   int x;
	   
	   
	   
	   public void readval(int b)
	   {
		   
		   b_id=b;
	   }
	   
	   public void printval()
	   {
		   
		   System.out.println("this is protected specifier"+b_id);
	   }
	   
	   
  }




public class AccesspecifierDemo {

	public static void main(String[] args) {
		
     bird b1= new bird();
     
     b1.b_name="sparrow";
     b1.price=100;
     b1.x=1;
     
	}

}
