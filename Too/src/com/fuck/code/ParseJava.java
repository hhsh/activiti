//package com.fuck.code;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import com.fuck.FileIO;
//
//public class ParseJava {
//
//	static String base = "D:\\eclipseSpace\\Too\\src\\";
//	static String path = base  +  "com/fuck/code/ParseJava.java"  ;
//	 
//	
//	public static void main(String[] args) {
//		String input = FileIO.read(path);
//		input = packageScan(input);
//		System.out.println(input);
//
//	}
//	
//	public static String packageScan(String input){
//		String regex = "\\bpackage\\b";
//		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//		Matcher matcher = pattern.matcher(input);
//		return matcher.replaceFirst("<span class='package'>package</span>");
//	}
//	
//	
//
//}
