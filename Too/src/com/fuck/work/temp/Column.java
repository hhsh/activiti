package com.fuck.work.temp;

import java.util.List;
import java.util.Map;

import com.fuck.BeanProperties;

public class Column  {

	 
	public static String getTemp() {
		// 8 
		String t = ""+ 
		"{title: '%s', field: '%s', width: 60 %s}," ;
		 
		return t;
	}
	
	public static void gen(String cls) {
	 
		String path = "com/fuck/bean/"+cls +".java";
		List<Map<String,String>> list = BeanProperties.getData(path);
		 
		for(int i=0;i<list.size() ;i+=1){
			Map<String,String> map =  list.get(i);
			
			String editor = "";
			if(map.get("type").equals("Date")){
				//editor = ",editor: {type: 'textbox', options: {precision: 2}" ;
			}
			 
			
			String rs = String.format(getTemp(),
					map.get("labelName"),
					map.get("columnName"),
					editor 
				);
			
			System.out.println(rs);
		}

	}
	
	
}
