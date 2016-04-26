package com.fuck.ch;

import com.fuck.FileIO;
import com.fuck.Path;

public class Quote {

	public static String trim(String input) { 
		 return trim( input, '"');
	}
	public static String trim(String input,char delimiter) { 
		char [] arr = new char[input.length()];
		String [] lines = input.split("\n"); 
		
		for(int i=0,k=0;i<lines.length;i++){
			String line = lines[i];
			boolean beginQuote = false;
			boolean benginSlash = false;//合
			boolean isWithinQuote = false;
			for(int j=0;j<line.length();j++){
				char ch = line.charAt(j);
				if(ch == '\\'){ //特殊字符
					arr[k++]= ch;
					if(benginSlash) // 	xxx\\
						benginSlash = false;//合
					else // 		xxx\
						benginSlash = true;//开
				}else if(ch == delimiter){
					arr[k++]= ch;
					if(benginSlash)// xxx\"
						benginSlash = false;//合
					else{
						if(beginQuote){	// xxx"xxx"
							beginQuote = false; //end of quote
							isWithinQuote = false;
						 }else{		// xxxxxxx"
							 beginQuote = true;//begin of quote
							 isWithinQuote = true;
						 }
					}
				}else{
					if( ch == '\t' || ch == '\r' || ch == '\f' || ch == ' '){
						 if(isWithinQuote){
							 arr[k++]= ch;
						 }else{
							 //arr[k++]= '#';
							 continue;
						 }
					}else{
						arr[k++]= ch;
					}
				}
			}
		}
		return String.valueOf(arr) ; 
	}
	
	public static void main(String[] args) throws Throwable {
		Path.sourceCodeRoot = "D:/workplace/Too/src/";
		String path = Path.sourceCodeRoot  +  "com/fuck/text/mixTrim.txt"  ;
		 
		String input = FileIO.read(path);
		String result  = trim(input );
		System.out.println(result);
	}
}
