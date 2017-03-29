package com.jp.prototype;

import java.util.HashMap;
import java.util.Map;

public class Coper {

	static Map<String, HomeWork> workMap;
	static {
		workMap = new HashMap<String, HomeWork>();
		workMap.put("math", new MathHomeWork());
		workMap.put("english", new EnglishHomeWork());
	}

	public static HomeWork copyHomeWork(String type) {
		HomeWork homeWork = workMap.get(type).clone();
		return homeWork;

	}
}
