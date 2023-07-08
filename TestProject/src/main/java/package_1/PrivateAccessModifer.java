package package_1;

	//Java Program to create and call a default constructor  

	class A
	{  
		//private variable
		private int data=40;
		
		//private method
		private void msg()
		{
			System.out.println("Hello java");
		}
		
		//private method
		private A()
		{
			System.out.println("Hello java");
		}
		
	}  
		  
		public class PrivateAccessModifer
		{  
		 
			public static void main(String args[])
			{  
			//	A obj=new A();
				
				//since private varibles scope is within the class , it can be called here in another class
				//System.out.println(obj.data);//Compile Time Error
				
				//obj.msg();//Compile Time Error  
			}  
		}  