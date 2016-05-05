package com.fuck;

public class Path {
	public static String buildPathRoot = Path.class.getClassLoader().getResource("").getPath();
	public static String projectRoot = buildPathRoot.replace("build/classes/", "");
	static{
		projectRoot = buildPathRoot.replace("bin/", "");
	}
	
	public static String sourceCodeRoot = "E:\\git\\Too\\src\\";
}
