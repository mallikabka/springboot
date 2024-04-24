package com.ojas;

import java.util.Optional;

public class OptionalClassEx {

	public static void main(String[] args) {
	Optional<Object> obj=Optional.empty();
	System.out.println(obj);
	//Optional<Object> obj1=Optional.of(null);
	//System.out.println(obj1);
	Optional<Object> obj2=Optional.ofNullable("Vinay");
	System.out.println("OfNullable "+obj2.get());
	}

}
