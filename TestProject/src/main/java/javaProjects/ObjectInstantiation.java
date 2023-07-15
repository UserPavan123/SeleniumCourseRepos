package javaProjects;
  

//AccessModifier  //    ClassName
public class ObjectInstantiation {
	
     //instance Variables	
	 int id;//field or data member or instance variable  
	 String name;
	 
	 //static variable
	 static String CollegeName="Badruka";
	 
	 //static method
	 static void methodA(){
		 System.out.println("this is static method called");
	 }
	 
	 //non static method
	 void methodB(){
		 System.out.println("this is non static or mthod B method called");
	 }
	 
	 //creating main method inside the  class  
	 public static void main(String args[]){  
		 
	 //for static references no need of Object reference
	 //Hence Object instantiation is not needed to call this methods or variables
		 methodA();
		 System.out.println(CollegeName);
		 
		 //non static References
    //	Methods and Variables can be called only using Object reference
		 //Hence called variables are called  instance variables
		 ObjectInstantiation obj=new ObjectInstantiation();
		 
		 //this is method B
		 obj.methodB();
		 System.out.println(obj.name);
		  
	 }  

}
