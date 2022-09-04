package com.java.zen_of_design_pattern_2.adapter.object_adapter.user_demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
	
	// 员工的工作信息， 比如， 职位等
	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<>();
		officeInfo.put("jobPosition", "这个人的职位是BOSS...");
		officeInfo.put("officeTelNumber", "员工的办公电话是...");
		return officeInfo;
	}

}
