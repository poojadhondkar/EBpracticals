package branchingStatement;

public class NewSwitch {

	public static void main(String[] args) {
		
		
		String dayname;
		int ch=7;
		dayname=switch(ch)
		{
		case 1->"sunday";
		case 2->"monday";
		case 3->"tuesday";
	    case 4->"wenesday";
	    case 5->"thursday";
	    case 6->"friday";
	    case 7->"saturday";
	    default->"invalid case";
			};
			System.out.println("selected day is :-"+dayname);
			dayname=switch(ch)
					{
					case 1,2,3,4,5->"weekdays";
					case 6,7->"weekends";
					default->"invalid case";
					};
						System.out.println("selected day is :-"+dayname);
						int c=1;
						int reults=switch(c)
								{
								case 1->{
									int x=5;
									int sum=x+x;
									yield sum;
									
								}
								case 2->4;
								default->0;
								};
									System.out.println("sum is :-"+reults);
						
					     
	}

}
