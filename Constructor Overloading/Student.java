class Student
{
	
String sFirstName;
String sLastName;
int age;
char gender;
String teacher;

Student() //default constructor - constructor(1)
    {
	System.out.println("Invalid!");
    }


Student(String fName, String lName, char gen, String teacher)  //constructor(2)
    {
	this(fName,lName,0,gen,teacher);
	/*
	 * calling the main constructor using 'this' keyword
	 * age is not given, so putting 0 in parameter list
	 */
    }


Student(String fName, String lName, int age, String teacher) //constructor(3)
    {
	this(fName, lName, age, '\0', teacher); 
	/*
	 * 'this' is used to call the main constructor
	 * here gender is not given('\0' is used for null)
	 */
    }


Student(String fName, String lName, int age, char gen, String teacher) 
//main constructor
    {
	//all parameters are being assigned to the instance variables here
	//this.instance_variable = constructor_parameter
	
	if(gen=='M')
	  {
		this.sFirstName="Mr. "+fName;
	  }
	else if(gen=='F')
	  {
		this.sFirstName="Ms. "+fName;
	  }
	else
	  {
		this.sFirstName=fName;
	  }
	this.sLastName=lName;
	this.age=age;
	this.gender=gen;
	this.teacher=teacher;

	}

}