package javaProjects;


class Bank {
	int InterestRate() {
		System.out.println("running parent class Vehicle");
		return 10;
	}
}

class ICICI extends Bank {
	int InterestRate() {
		System.out.println("running safely with 60km on Splendor");
		return 11;
	}
	
	double InterestRate(int x, int y) {
		System.out.println("running safely with 60km on Splendor");
		return 11.4;
	}

}

class SBI extends Bank {
	int InterestRate() {
		System.out.println("running safely with 60km on Honda");
		return 12;
	}

}

class CITI extends Bank {
	int InterestRate() {
		System.out.println("running safely with 60km on Hero");
		return 13;
	}

}

public class Polymorphism_Overloading {
	public static void main(String args[]) {
		Bank b;  // upcasting
		int ROI;
		
		b = new ICICI();// upcasting
		ROI=b.InterestRate();

		System.out.println("ICICI ROI IS "+ROI);
		
		b = new SBI();// upcasting
		ROI=b.InterestRate();
		System.out.println("SBI ROI IS "+ROI);
		
		b = new CITI();// upcasting
		ROI=b.InterestRate();
		System.out.println("CITI ROI IS "+ROI);
		
		
	}
}