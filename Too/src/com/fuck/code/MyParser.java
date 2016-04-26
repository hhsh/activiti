package com.fuck.code;

import java.util.ArrayList;
import java.util.List;

public class MyParser implements Parser{
	boolean beginMultiLineComment = false;
	boolean beginForwardSlash = false;
	
	int multiLineCommoneEndAsteriskIndex = -1;
	
	@Override
	public String parse(String line) {
		boolean beginSingleLineComment = false;
		int forwardSlashIndex = -1;

		List<Character> list = new ArrayList<Character>();
		boolean beginSingleQuote = false;
		boolean beginDoubleQuote = false;
		
		boolean benginSlash = false;//合
		for(int i=0;i<line.length();i++){
			char ch = line.charAt(i);
			list.add(ch);
			if(ch == '\\'){ // 反斜杠
				if(!beginSingleLineComment && !beginMultiLineComment){
					if(benginSlash) // 	xxx\\
						benginSlash = false;//合
					else // 		xxx\
						benginSlash = true;//开
				}
				
			}else if(ch == '\''){// 单引号
				if(!beginSingleLineComment && !beginMultiLineComment){
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
				}
				
			}else if(ch == '"'){
				if(!beginSingleLineComment && !beginMultiLineComment){
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
				}
				
			}else if(ch == '/'){
				if(!beginSingleLineComment && !beginMultiLineComment){ //排除注释内的情况
					if(!beginDoubleQuote && !beginSingleQuote){ // 接着排除在引号内的情况
						if(forwardSlashIndex == -1 ){
							forwardSlashIndex = i;
						}
						if(i == forwardSlashIndex + 1){ 
							beginSingleLineComment = true;
						}else{
							beginForwardSlash = true;
						}
					} 
				}
				if(beginMultiLineComment){
					if(multiLineCommoneEndAsteriskIndex != -1 && i == multiLineCommoneEndAsteriskIndex+1){
						beginMultiLineComment = false;
					}
				}
				
			}else if(ch == '*'){
				if(beginMultiLineComment){ 
					multiLineCommoneEndAsteriskIndex = i;
				}
				if(!beginSingleLineComment && !beginMultiLineComment){
					if(!beginDoubleQuote && !beginSingleQuote){ // 接着排除在引号内的情况
						if(beginForwardSlash){
							if(forwardSlashIndex != -1 && i == forwardSlashIndex + 1){
								beginMultiLineComment = true;
							}
						} 
					} 
				} 
				
			}
			else{
				;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++){
			sb.append(list.get(i));
		}
		return sb.toString();
	}

}
