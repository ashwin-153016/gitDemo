package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		
		SalesClass s = new SalesClass();
		s.show();
		
		CustomerClass c = new CustomerClass();
		c.sayCustomer();
		
		CustomerAddressClass ca = new CustomerAddressClass();
		ca.showAddress();
;
		}

	public static void greet() {
System.out.println("Welcome ");		
		for(int i=1; i<15; i++) {
			System.out.println(i + " ");
		}
	}
}
