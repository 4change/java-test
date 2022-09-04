package com.java.zen_of_design_pattern_2.adapter.object_adapter.user_demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	// 员工的家庭信息
	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
		homeInfo.put("homeAddress", "员工的家庭地址是...");
		return homeInfo;
	}
}
