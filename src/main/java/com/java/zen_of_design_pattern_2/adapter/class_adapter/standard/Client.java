package com.java.zen_of_design_pattern_2.adapter.class_adapter.standard;

import org.junit.Test;

public class Client {
	
	@Test
	public void test() {
		// 原有的业务逻辑
//		Target target = new ConcreteTarget();
//		target.request();
		
		// 现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
	
}
