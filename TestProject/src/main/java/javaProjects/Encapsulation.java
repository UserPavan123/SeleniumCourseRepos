package javaProjects;

class A {

	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
}


public class Encapsulation

{
	public static void main(String[] args)

	{
		A e = new A();
		
		e.setName("pavan");

		System.out.println(e.getName());
		
		e.setName("sushma");

		System.out.println(e.getName());

	}

}
