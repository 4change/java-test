package com.java.zen_of_design_pattern_2.responsibility_chain.women_origin;

public class Women implements IWomen {
	// 通过一个int类型的参数来描述妇女的个人状况 1--未出嫁 2--出嫁 3--夫死
	private int type = 0;
	
	// 妇女的请示
	private String request = "";

	//构造函数传递过来请求
	public Women(int _type, String _request) {
		this.type = _type;
		this.request = _request;
	}

	//获得自己的状况
	@Override
	public int getType() {
		return this.type;
	}

	//获得妇女的请求
	@Override
	public String getRequest() {
		return this.request;
	}
}
