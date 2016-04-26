package com.fuck.work.temp;

import java.util.List;
import java.util.Map;

import com.fuck.BeanProperties;

public class Form  {

	 
	public static String getTemp() {
		// 8 
		String t = ""+
		"<tr>\n"+
		"\t<td class=\"label-td\">%s</td>\n"+
		"\t<td class=\"input-td\">\n"+
			"\t\t<input name=\"%s\" type=\"text\" class=\"bt-30pct-input easyui-textbox%s\"/>\n"+
		"\t</td>\n"+
		"\t<td class=\"label-td\">%s</td>\n"+
		"\t<td class=\"input-td\">\n"+
			"\t\t<input name=\"%s\" type=\"text\" class=\"bt-30pct-input easyui-textbox%s\"/>\n"+
		"\t</td>\n"+
		"</tr>\n";
	     
		return t;
	}
	
	public static void gen(String cls) {
		String path = "com/fuck/bean/"+cls+".java";
		List<Map<String,String>> list = BeanProperties.getData(path);
		 
		for(int i=0;i<list.size()-1;i+=2){
			Map<String,String> map1 =  list.get(i);
			Map<String,String> map2 =  list.get(i+1);
			
			String t1 = "",t2 = "";
			if(map1.get("type").equals("Date")){
				t1 = " easyui-datebox";
			}
			if(map2.get("type").equals("Date")){
				t2 = " easyui-datebox";
			}
			
			String rs = String.format(getTemp(),
						map1.get("labelName"),
						map1.get("columnName"),
						t1,
						map2.get("labelName"),
						map2.get("columnName"),
						t2
						);
			
			System.out.println(rs);
		}

	}
	
	
}
