package package_2;

import package_1.*;

 		public class DefaultAccessModifer
		{  
		 
			public static void main(String args[])
			{  
				/*
					the scope of DefaultAccessModifier_CalledClass class and 
					its method DefaultAM_Method() is default
					so it cannot be accessed from outside the package.
				*/
				DefaultAccessModifier_CalledClass obj=new DefaultAccessModifier_CalledClass();
			//	obj.DefaultAM_Method();
						  
			}  
		}  