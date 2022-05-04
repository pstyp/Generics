package com.qa.enums;

public class AnotherClass implements MethodInterface<Double> {

	@Override
	public Double method1(Double num) {
		return num;
	}

	@Override
	public void method2(Double d) {
		System.out.println("Hello"+d);
		
	}

}
