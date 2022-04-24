package org.sample;

public class Empolyee {
	private void empId(int empId) {
		System.out.println("Gopi"+empId);
	}

	private void empId(String name) {
System.out.println( "thala"+name);
	}
	
	public static void main(String[] args) {
		Empolyee e = new Empolyee ();
		e.empId(1234);
		e.empId("gopi");
	}
	
	
	
	
	
	
	
}



