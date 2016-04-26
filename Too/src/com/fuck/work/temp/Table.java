package com.fuck.work.temp;

import java.util.List;
import java.util.Map;

import com.fuck.BeanProperties;

public class Table  {

	 
	public static String getTemp() {
		String s = "<tr>\n"+
				"\t<td class=\"label-td twenty-td\">%s</td>\n"+
				"\t<td data-name=\"%s\" class=\"view-td thirty-td\"/>\n"+
				"\t<td class=\"label-td twenty-td\">%s</td>\n"+
				"\t<td data-name=\"%s\" class=\"view-td thirty-td\"/>\n"+
			"</tr>\n";
		return s;
	}
	
	public static void gen(String cls) {
		String path = "com/fuck/bean/"+cls+".java";
		List<Map<String,String>> list = BeanProperties.getData(path);
		 
		for(int i=0;i<list.size()-1;i+=2){
			Map<String,String> map1 =  list.get(i);
			Map<String,String> map2 =  list.get(i+1);
			
			
			String rs = String.format(getTemp(),
						map1.get("labelName"),
						map1.get("columnName"),
						 
						map2.get("labelName"),
						map2.get("columnName") 
						);
			
			System.out.println(rs);
		}

	}
	
	
}
