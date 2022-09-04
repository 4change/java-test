package com.java.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTest {

	@Test
	public void test() {
		String regex = "^(2)\\\\d{3}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("2246");
		System.out.print(m.matches());
	}

}
