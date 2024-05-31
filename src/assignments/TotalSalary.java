package assignments;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter basic salary");
		int salary=scanner.nextInt();
		
		if(salary<=10000)
		{
			double HRA=0.2 *salary;
			double da=0.8 * salary;
			double totalsalary=salary+HRA+da;
			System.out.println("total salary for HRA and DA 20% and 80% is:- "+totalsalary);
		}else if(salary<=20000)
		{
			double HRA=0.25 *salary;
			double da=0.90 * salary;
			double totalsalary=salary+HRA+da;
			System.out.println("total salary for HRA and DA 25% and 90% is:- "+totalsalary);
		}else if(salary>20000)
		{
			double HRA=0.3 *salary;
			double da=0.95 * salary;
			double totalsalary=salary+HRA+da;
			System.out.println("total salary for HRA and DA 30% and 95% is:- "+totalsalary);
		}
       scanner.close(); 
	}

}
