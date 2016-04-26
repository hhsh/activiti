package com.fuck.code;

import com.fuck.FileIO;
import com.fuck.Path;

public class ParseCode {
	 /**
	  * dfdf
	  */
	String s = "af/**  afdf */a";
	public static void main(String[] args) throws Throwable {
		Path.sourceCodeRoot = "D:/eclipseSpace/Too/src/";
		String path = Path.sourceCodeRoot  +  "com/fuck/text/java.txt"  ;
		 
		Parser p = new MyParser();
		String input = FileIO.read(path,p);
		
		
		System.out.println(input);
	}
}
