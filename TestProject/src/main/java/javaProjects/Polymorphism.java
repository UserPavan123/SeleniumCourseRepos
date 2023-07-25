package javaProjects;


class Vehicle {
	void run() {
		System.out.println("running parent class Vehicle");
	}
}

class Splendor extends Vehicle {
	void run() {
		System.out.println("running safely with 60km on Splendor");
	}

}

class Honda extends Vehicle {
	void run() {
		System.out.println("running safely with 60km on Honda");
	}

}

class Hero extends Vehicle {
	void run() {
		System.out.println("running safely with 60km on Hero");
	}

}

class Bajaj extends Vehicle {
	void run() {
		System.out.println("running safely with 60km on Bajaj");
	}

}

public class Polymorphism {
	public static void main(String args[]) {
		Vehicle b;  // upcasting
		
		
		b = new Splendor();// upcasting
		b.run();
		
		b = new Honda();// upcasting
		b.run();
		
		b = new Hero();// upcasting
		b.run();
		
		b = new Bajaj();// upcasting
		b.run();
		
	}
}