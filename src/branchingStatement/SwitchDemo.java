package branchingStatement;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter choice");
		int ch=scanner.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("case 1");
		     
			break;
		case 2:
			System.out.println("case 2");
		     
			break;
		case 3:
			System.out.println("case 3");
		     
			break;
		case 4:
			System.out.println("case 4");
		     
			break;
		case 5:
			System.out.println("case 5");
		     
			break;
		default:
			System.out.println("dafault case");
		     
			break;
			
		}
		scanner.close();
	}

}
