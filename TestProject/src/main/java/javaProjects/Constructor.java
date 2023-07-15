package javaProjects;

	//Java Program to create and call a default constructor  
	class Bike1{
		
		//creating a default constructor
		
		// it is like any other method , but the name of the method is same as class name
		// there is no return type
		//declared as static
		
		// this is static method
		static void Bike2()
		{
			
		}
		
		// this is constructor method
		Bike1()
		{
			System.out.println("Bike is created");
			
		}
		
		//main method  
			public static void main(String args[]){  
			
			//calling a default constructor
			
			//instanation is not required , becuase as class loaded automatically method is interacted
			Bike2();
				
			///for a constructor , Object instanation is required in order to call the constructor method
			Bike1 b=new Bike1();
			
			
			}


}  
