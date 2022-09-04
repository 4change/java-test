package com.java.zen_of_design_pattern_2.adapter.class_adapter.user_demo;

import org.junit.Test;

public class Client {
	@Test
	public void testUserInfo() {
		// 没有与外系统连接的时候， 是这样写的
		IUserInfo youngGirl = new UserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}

	@Test
	public void testOuterUserInfoAdapter() {
		// 老板一想不对呀， 兔子不吃窝边草， 还是找借用人员好点
		// 我们只修改了这句话
		IUserInfo youngGirl = new OuterUserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}
}
