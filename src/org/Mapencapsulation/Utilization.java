package org.Mapencapsulation;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Utilization {

	public static void main(String[] args) {
		// creating object
		Banking b = new Banking();
		// calling the method using object
b.setUsername("Dhivya");
b.setPassword(56789);
b.setRefId(456);
Banking c = new Banking();
c.setUsername("Manju");
c.setPassword(7531);
c.setRefId(963);

// using Map concept
Map<Integer, Banking> mp1 = new LinkedHashMap<>();
mp1.put(1, b);
mp1.put(2, c);
	
Collection<Banking> values = mp1.values();
for (Banking banking : values) {

	String username = banking.getUsername();
	System.out.println(username);
	int password = banking.getPassword();
	System.out.println(password);
	int refId = banking.getRefId();
	System.out.println(refId);
	
	
	
	
}

	}


		
		
		
	}
	
	
	
