package com.fuck.ch;

import com.fuck.FileIO;
import com.fuck.Path;

public class MixQuote {

	 
	public static String trim(String input ) { 
		char [] arr = new char[input.length()];
		String [] lines = input.split("\n"); 
		
		for(int i=0,k=0;i<lines.length;i++){
			String line = lines[i];
			boolean beginSingleQuote = false;
			boolean beginDoubleQuote = false;
			boolean benginSlash = false;//合
			for(int j=0;j<line.length();j++){
				char ch = line.charAt(j);
				if(ch == '\\'){ //特殊字符
					arr[k++]= ch;
					if(benginSlash) // 	xxx\\
						benginSlash = false;//合
					else // 		xxx\
						benginSlash = true;//开
				}else if(ch == '\''){
					arr[k++]= ch;
					if(!beginDoubleQuote){
						if(!benginSlash) {// xxx\'
							if(!beginSingleQuote){	// xxxxxxx'
								beginSingleQuote = true;//begin of quote
							 }else{		//  xxx'xxx'
								 beginSingleQuote = false; //end of quote
							 }
						}
						else{
							benginSlash = false;//合
						}
					} 
				}else if(ch == '"'){
					arr[k++]= ch;
					if(!beginSingleQuote){
						if(!benginSlash) {// xxx\"
							if(!beginDoubleQuote){	//xxx" 
								beginDoubleQuote = true;//begin of quote
							 }else{		// xxx"xxx" 
								 beginDoubleQuote = false; //end of quote
							 }
						}
						else{
							benginSlash = false;//合
						}
					} 
				}else{
					if( ch == '\t' || ch == '\r' || ch == '\f' || ch == ' '){
						 if(beginDoubleQuote || beginSingleQuote){
							 arr[k++]= ch;
						 }else{
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
		Path.sourceCodeRoot = "D:/eclipseSpace/Too/src/";
		String path = Path.sourceCodeRoot  +  "com/fuck/text/mixTrim.txt"  ;
		 
		String input = FileIO.read(path);
		String result  = trim(input );
		System.out.println(result);
	}
}
