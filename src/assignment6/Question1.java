package assignment6;

 class College 
 {
    
	    class Student 
	    {
           private String studentName;
           private int studentId;

        public Student(String studentName, int studentId) 
        {
            this.studentName = studentName;
            this.studentId = studentId;
        }
        
        public void displayDetails() 
         {
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentId);
         }
     }
}
public class Question1 {

	public static void main(String[] args) 
	{
		
        College myCollege = new College();

        College.Student student1 = myCollege.new Student("pooja", 1);

        student1.displayDetails();
	}

}
