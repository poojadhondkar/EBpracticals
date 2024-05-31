package basic;

public class StringDemo {

	public static void main(String[] args) {
		
		String name="pooja";
		String name1="dhondkar";
		String name2=name + name1;
		System.out.println(name2);
		name=name + name1;
		System.out.println(name);
		System.out.println("concatation of string ="+name.concat(name2));
		int length= name.length();
		System.out.println("length of string="+length);
		System.out.println("cgaracter at specific index="+name1.charAt(4));
		System.out.println("substring="+name1.substring(0, 3));
		
		if(name.compareTo(name1)==0) 
		{
			System.out.println("equal");
			
		}
		else 
		{
			System.out.println("not equal");
			
		}
	}

}
