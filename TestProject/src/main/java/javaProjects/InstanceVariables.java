package javaProjects;

	//Java Program to create and call a default constructor  
	class InstanceVariables{
		
		//Class variables
		int length;
		int breadth;
		int height;
		int Area;
		
		static String Shape="Rectangle";
		
		
		//functions or methods
		int CalcArea()
		
		{
 			Area=length*breadth*height;
			return Area;
		}
		
		
		//main method  
			public static void main(String args[])
			{
			InstanceVariables obj=new InstanceVariables();
			obj.length=10;
			obj.breadth=10;
			obj.height=10;
			
			//local variables
			int RecArea=obj.CalcArea();
			System.out.println("Area of the 1 instance "+Shape+"is "+RecArea);
			
			
			
			InstanceVariables obj1=new InstanceVariables();
			//local variables
			obj1.length=11;
			obj1.breadth=11;
			obj1.height=11;
			int RecArea1=obj1.CalcArea();
			System.out.println("Area of the 2 instance "+Shape+"is "+RecArea1);
				
			}
			
				


}  
