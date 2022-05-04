package com.qa.enums;

public class Generics implements MethodInterface<Integer> {

	@Override
	public Integer method1(Integer object) {
		return object; 
	}

	@Override
	public void method2(Integer object) {
		System.out.println("This is the object "+ object);
		
	}

	
	
}
