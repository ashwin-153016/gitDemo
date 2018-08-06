package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		SalesClass s = new SalesClass();
		s.show();
		
		System.out.println("Hello world");
		greet();
	}

	public static void greet() {
		System.out.println("Hello ");
		
		for(int i=1; i<10; i++) {
			System.out.println(i + " ");
		}
	}
}
