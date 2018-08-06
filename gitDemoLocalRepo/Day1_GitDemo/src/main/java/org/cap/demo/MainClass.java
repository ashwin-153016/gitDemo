package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		
		SalesClass s = new SalesClass();
		s.show();
		
		CustomerClass c = new CustomerClass();
		c.sayCustomer();
		
		CustomerAddressClass ca = new CustomerAddressClass();
		ca.showAddress();
		System.out.println("Edited again");
		CustomerCityClass cc = new CustomerCityClass();
		cc.showCity();
		
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
