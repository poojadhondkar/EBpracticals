package basic;

public class Casttyping {

	public static void main(String[] args) {
		 double myDouble = 9.78d;
		    int myInt = (int) myDouble; // Manual casting: double to int explicit

		    System.out.println(myDouble);   // Outputs 9.78
		    System.out.println(myInt);      // Outputs 9
		    
		    
		    int intx = 9;
		    double doublex = intx; // Automatic casting: int to double implicit

		    System.out.println(myInt);      // Outputs 9
		    System.out.println(myDouble); 
	}

}
