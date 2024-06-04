package classandobject;

class person
{
	
	private int age;
	private String name;
	
   person( int age,String name)
   {
	   this.age=age;
	   this.name=name;
	   
   }

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}








public class ArrayOfObject {

	public static void main(String[] args) {
		person [] people =new person[3];
		
		people[0]=new person(10,"pooja");
		people[1]=new person(20,"xyz");
		people[2]=new person(30,"pqr");
		
//		for(int i=0;i<people.length;i++)
//		{
//		System.out.println(people[i].getAge()  + "" +people[i].getName());
//		
//		}
		
		for(person p: people)//enhance for loops
		{
			System.out.println(p.getAge()  + "  " +p.getName());
		}

	}

}
