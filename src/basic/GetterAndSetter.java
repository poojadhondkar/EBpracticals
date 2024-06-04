package basic;

class sample 
{
	private int age;
	private String name;
	
	
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




public class GetterAndSetter {

	public static void main(String[] args) {
		
		sample s1 =new sample();
		
		s1.setAge(10);
		s1.setName("pooja");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		

	}

}
