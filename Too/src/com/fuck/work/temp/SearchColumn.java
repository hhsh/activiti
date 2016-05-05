package com.fuck.work.temp;

import java.util.List;
import java.util.Map;

import com.fuck.BeanProperties;

public class SearchColumn  {

	 
	public static String getTemp(String alias) {
		String t = ""+ 
	
		"{cxzdName: '%s', cxzdValue: '"+alias+".%s', cxzdType: '%s'}," ;
		 
		return t;
	}
	
	public static void gen(String cls,String alias) {
	 
		String path = "com/fuck/bean/"+cls +".java";
		List<Map<String,String>> list = BeanProperties.getData(path);
		 
		for(int i=0;i<list.size() ;i+=1){
			Map<String,String> map =  list.get(i);
			
			String typ  = map.get("type").toLowerCase();
			if(typ.equals("double")){
				typ = "float";
			}
			
			String rs = String.format(getTemp(alias),
					map.get("labelName"),
					map.get("columnName"),
					typ
				);
			
			System.out.println(rs);
		}

	}
	
	
}
