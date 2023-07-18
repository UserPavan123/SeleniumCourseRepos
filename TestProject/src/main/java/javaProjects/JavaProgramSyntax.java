package javaProjects;


class A

{
	//variables
	String name="shravanthi";
	int age=30;

	
	public static void main(String args[])
	{
	}
	
	//methods
	int methodA(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	
	
}


//

public class JavaProgramSyntax {
	//Class variables like Static and Instance Variables can be declared here
	
	//Method - Here main method gets priority over other methods
	
	
	//variables
		String name="shravanthi";
		int age=30;

		//methods
		int methodA(int x,int y)
		{
			
			
			int sum=x+y;
			return sum;
		}
		
	
//AccessModifier Static/NonStatic  ReturnType  MethodName  passingargs
	public 		  static           void         main        (String[] args) throws InterruptedException {
		//Local variables can be declared here
		
		JavaProgramSyntax j1=new JavaProgramSyntax();
		int PersonAge=j1.age;
		System.out.println(j1.age);
		
		j1.methodA(3, 4);
		
		
		
		
		
		
		
	  // to print statement	
	   System.out.println("Hello World");
	   
	   //no return type passed Hence VOid is specified
	   
	}

}
