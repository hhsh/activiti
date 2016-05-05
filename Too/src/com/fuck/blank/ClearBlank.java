package com.fuck.blank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fuck.FileIO;
import com.fuck.Path;

public class ClearBlank {
	
	public static void main(String[] args) {
		clearBlank();
	}

	public static void clearBlank(){
		String path = Path.sourceCodeRoot  + "com/fuck/text/error.txt";
		 
		String regex = "^(\\s*)|()$"; //剔除含有空格符或 换行符的行
		String fileCont = FileIO.read(path);
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(fileCont);
		String rs = matcher.replaceAll("");
		System.out.println(rs);
	}
	
}
