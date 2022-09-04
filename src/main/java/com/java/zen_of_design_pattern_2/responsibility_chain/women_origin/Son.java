package com.java.zen_of_design_pattern_2.responsibility_chain.women_origin;

public class Son implements IHandler {
	// 母亲向儿子请示
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("母亲的请示是： " + women.getRequest());
		System.out.println("儿子的答复是： 同意");
	}
}
