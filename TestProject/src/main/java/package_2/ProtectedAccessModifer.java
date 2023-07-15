package package_2;

import package_1.*;

 		class ProtectedAccessModifer extends ProtectedAccessModifier_CalledClass
		{  
		 
			public static void main(String args[])
			{  
				/*
					the scope of DefaultAccessModifier_CalledClass class and its method DefaultAM_Method() is default
					so it cannot be accessed from outside the package.
				*/
				ProtectedAccessModifer obj=new ProtectedAccessModifer();
				obj.Protected_AM_Method();
				
				
				/*
				the scope of Public AccessModifier_CalledClass class 
				and all it methods declared as public can be accessed from anywhere
				so it can be accessed from inside and outside the package.
				 */
				obj.Public_Method();
				
				
			}  
		}  