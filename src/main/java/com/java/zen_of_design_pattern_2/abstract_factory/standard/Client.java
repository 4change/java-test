package com.java.zen_of_design_pattern_2.abstract_factory.standard;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		@SuppressWarnings("unused")
		Product product = creator.createProduct(ConcreteProduct1.class);
		/*
		 * 继续业务处理
		 */
	}
}
