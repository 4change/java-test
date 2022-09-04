package com.java.zen_of_design_pattern_2.command.standard;

public abstract class Receiver {
	// 抽象接收者， 定义每个接收者都必须完成的业务
	public abstract void doSomething();
}
