package basic;

public class Enumdemo {

	public enum day{
		
		sunday,
		monday,
		tuesday,
		wenesday,
		thursday,
		friday,
		saturday
		
	}
	public enum status
	{
		
		eligible,
		not_eligible,
		no_status
	}
	public static void main(String[] args) {
		
		day today= day.friday;
		status s1=status.no_status;
		System.out.println("todays day is:- "+today);
		System.out.println("status is:- "+s1);
		
	}

}
