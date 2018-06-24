public class StudentDetails
{

    public static void main(String[] args)
	{
    	//s1 calls main constructor
	    Student s1 = new Student("Michael","Clark",15,'M',"Mary John");
		System.out.println("Student name : "+s1.sFirstName+" "+s1.sLastName);
		System.out.println("Student's age : "+s1.age);
		System.out.println("Reporting Teacher : "+s1.teacher);
		
		System.out.println("  ");
		
		//s2 calls constructor(2)
	    Student s2 = new Student("Asha","Jain",'F',"Susan Joy");
	    System.out.println("Student name : "+s2.sFirstName+" "+s2.sLastName);
		System.out.println("Student's age : "+s2.age);
		System.out.println("Reporting Teacher : "+s2.teacher);
		
		System.out.println("  ");
		
		//s3 calls constructor(3)
	    Student s3 = new Student("Simran","Patil",16,"Susan Joy");
	    System.out.println("Student name : "+s3.sFirstName+" "+s3.sLastName);
		System.out.println("Student's age : "+s3.age);
		System.out.println("Reporting Teacher : "+s3.teacher);
		
		System.out.println("  ");
		
		//s4 calls constructor(1)
	    Student s4 = new Student();
	    System.out.println("Student name : "+s4.sFirstName+" "+s4.sLastName);
		System.out.println("Student's age : "+s4.age);
		System.out.println("Reporting Teacher : "+s4.teacher);
	
	
	}

}