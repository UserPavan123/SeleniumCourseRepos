package javaProjects;

//AccessModifier  //    ClassName
public class Variables {
 //Instance Variables or class variables=which are declared inside the class
// but outside of method
//Memory is allocated to this variables every time object is instantiated for use of these variables
	String Name;
	int RollNo;
	String City;
	String Gender;
		
//Static Variables carry keyword static 
//Memory is allocated to this variable only Once when class is loaded
   static String Initial;
   static String Organization="Cognizant";
	
	////Method 1
	void sleep()
	{
//Local Variables== which are declared inside the method and scope is within this method 
		int time=10;
		System.out.println("this method denotes sleep");
	}

	//Method 2
	void study()
	{ System.out.println("this method denotes study functionality"); }
	
	
	public static void main(String[] args) throws InterruptedException {
		
	   //local variable
		String PersonName;
		
		//classname obj=new Classname();
		Variables obj1=new Variables();
		PersonName=obj1.Name="pavan";
		
		System.out.println("name value is "+PersonName);
		
		Variables obj2=new Variables();
		PersonName=obj2.Name="Harisha";
		
		
		System.out.println("name value is "+PersonName);
		
		Variables obj3=new Variables();
		PersonName=obj3.Name="Shravanthi";
		
		System.out.println("name value is "+PersonName);
 
	}

}
