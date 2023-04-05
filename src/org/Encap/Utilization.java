package org.Encap;

import java.util.LinkedHashSet;
import java.util.Set;

public class Utilization {

	public static void main(String[] args) {
		// create a object
		Banking a = new Banking();
		a.setUsername(456);
		a.setPassword("Dhivya@123");
		a.setRefId("Dhi@456");
		
		Banking b = new Banking();
		b.setUsername(789);
		b.setPassword("Devi");
		b.setRefId("Devi@789");
    Set<Banking> se1 = new LinkedHashSet<>();
    se1.add(a);
    se1.add(b);
    for (Banking banking : se1) {
		int username = banking.getUsername();
		System.out.println(username);
		String password = banking.getPassword();
		System.out.println(password);
		String refId = banking.getRefId();
		System.out.println(refId);
		
	}
}
}
