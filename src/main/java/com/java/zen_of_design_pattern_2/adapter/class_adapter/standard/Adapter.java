package com.java.zen_of_design_pattern_2.adapter.class_adapter.standard;

public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}
