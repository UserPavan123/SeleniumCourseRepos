package javaProjects;

//Java Program to create and call a default constructor  
class ControlStatements {

	public static void main(String[] args) {

		
		// IF Statement
		int x = 10;
		int y = 12;
		
		if (x + y > 20) {
			System.out.println("x + y is greater than 20");
		}
		
		
//================================================================================
		// IF Else Statement
		if (x + y < 10) {
			System.out.println("x + y is less than      10");
		} else {
			System.out.println("x + y is greater than 20");
		}
//================================================================================
		// if-else-if ladder:
		String city = "Delhi";
		if (city == "Meerut") {
			System.out.println("city is meerut");
		} else if (city == "Noida") {
			System.out.println("city is noida");
		} else if (city == "Agra") {
			System.out.println("city is agra");
		} else {
			System.out.println(city);
		}

//================================================================================

		// Nested if-statement
		String address = "Delhi, India";
		if (address.endsWith("India")) 
		{
			if (address.contains("Meerut")) 
			{
				System.out.println("Your city is Meerut");
			} 
			else if (address.contains("Noida")) 
			{
				System.out.println("Your city is Noida");
			} 
			else
			{
				System.out.println(address.split(",")[0]);
			}
		}
		else
		{
			System.out.println("You are not living in India");
		}

//================================================================================

		// For Statement
		/*int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		*/



		for (int j = 2; j <= 10; j=j+2) {
			System.out.println(j);
		}

		//System.out.println("The sum of first 10 natural numbers is " + sum);

//================================================================================		

		// For Each Statement
		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };

		System.out.println("Printing the content of the array names:\n");

		for (String name : names) {
			System.out.println(name);
		}

//================================================================================
		// While Loop
		int i = 0;

		System.out.println("Printing the list of first 10 even numbers \n");

		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}  
//================================================================================

		// Do while Loop
		i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);

	}

}