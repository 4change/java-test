package com.java.zen_of_design_pattern_2.adapter.class_adapter.standard;

public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("if you need any help,pls call me!");
	}
}