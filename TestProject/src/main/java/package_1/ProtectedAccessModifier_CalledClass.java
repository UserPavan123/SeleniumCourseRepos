package package_1;

	//Java Program to create and call a default constructor  

		public class ProtectedAccessModifier_CalledClass
		{  
			
			protected void Protected_AM_Method()
			{
				//this method is being called from another class(DefaultAccessModifier.java) which is under package_2
					System.out.println("this is protected_AM_Method called from package 1");
			}
			
			public void Public_Method()
			{
				//this method is being called from another class(DefaultAccessModifier.java) which is under package_2
					System.out.println("this is protected_AM_Method called from package 1");
			}
			
			
		}  