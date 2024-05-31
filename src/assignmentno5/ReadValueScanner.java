package assignmentno5;

import java.util.Scanner;


 class Sum {
    
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of two integeris: "+ sum);
    }

 }

public class ReadValueScanner {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter the first integer: ");
	        int firstNumber = scanner.nextInt();
	        
	        System.out.print("Enter the second integer: ");
	        int secondNumber = scanner.nextInt();
	        
	        Sum s = new Sum();
	        s.printSum(firstNumber,secondNumber);
	        
	        scanner.close();

	}

}
