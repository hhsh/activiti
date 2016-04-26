package com.fuck;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 

public class BeanProperties {

	
	public static void introBeanByReg() { 
		Path.sourceCodeRoot = "D:/Workspaces/MyEclipse 10/Too/src/";
		String path = Path.sourceCodeRoot  + "com/fuck/bean/EAM_SpDesign.java";
		 
		String rs = FileIO.read(path);
		//System.out.println(rs);
		
		//String regex = "^\\s*private(.*)$";
		String regex = "^\\s*private\\s*(\\w+)\\s*(\\w+)\\s*;\\s*//\\s*(\\S+)\\s*$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(rs);
		int c = 0;
		while (matcher.find()) {
			c++;
			String gp1 = matcher.group(1);
			String gp2 = matcher.group(2);
			String gp3 = matcher.group(3);
			System.out.println(gp1 + ":" + gp2 + ":" + gp3);
		}
		System.out.println("共："+c);
		
	}
	
	
	public static String template1(){
		String s = "<tr>\n"+
						"\t<td class=\"label-td twenty-td\">%s</td>\n"+
						"\t<td data-name=\"%s\" class=\"view-td thirty-td\"/>\n"+
						"\t<td class=\"label-td twenty-td\">%s</td>\n"+
						"\t<td data-name=\"%s\" class=\"view-td thirty-td\"/>\n"+
					"</tr>\n";
		return s;
	}
	
	
	public static String templateEdit(){
		String s = "<tr>\n"+
						"\t<td class=\"label-td\">%s</td>\n"+
						"\t<td class=\"input-td\">\n"+
							"\t\t<input name=\"%s\" type=\"text\" class=\"bt-30pct-input easyui-textbox%s\"/>\n"+
						"\t</td>\n"+
						"\t<td class=\"label-td\">%s</td>\n"+
						"\t<td class=\"input-td\">\n"+
							"\t\t<input name=\"%s\" type=\"text\" class=\"bt-30pct-input easyui-textbox%s\"/>\n"+
						"\t</td>\n"+
					"</tr>\n";
		return s;
	}
	
	
	public static void esacapeSlash(){
		Path.sourceCodeRoot = "D:/Workspaces/MyEclipse 10/Too/src/";
		String path = Path.sourceCodeRoot  + "com/fuck/text/escape.txt";
		 
		String regex = "\\\"";
		String fileCont = FileIO.read(path);
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(fileCont);
		String rs = matcher.replaceAll("\\\\\"");
		System.out.println(rs);
	}
	
	public static List<Map<String,String>> getData(String filePath){
		//Path.sourceCodeRoot = "D:\\eclipseSpace\\Too\\src\\";
		String path = Path.sourceCodeRoot  + filePath ;
		 
		String fileCont = FileIO.read(path);
		 
		String regex = "^\\s*private\\s*(\\w+)\\s*(\\w+)\\s*;\\s*//\\s*(.+)\\s*$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(fileCont);
		//int c = 0;
		Map<String,String> map = null;
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		while (matcher.find()) {
			//c++;
			String type = matcher.group(1);
			String columnName  = matcher.group(2);
			String labelName = matcher.group(3);
			map = new HashMap<String,String>();
			
			map.put("labelName", labelName);
			map.put("columnName", columnName);
			map.put("type", type);
			list.add(map);
		}
		return list;
	}
 
	public static void table() { 
		String path = "com/fuck/bean/EAM_SpMunicipalSon.java";
		List<Map<String,String>> list = getData(path);
		
		for(int i=0;i<list.size()-1;i+=2){
			Map<String,String> map1 =  list.get(i);
			Map<String,String> map2 =  list.get(i+1);
			
			String rs = String.format(template1(),
						map1.get("labelName"),map1.get("columnName"),
						map2.get("labelName"),map2.get("columnName"));
			
			System.out.println(rs);
		}
	 
		
	}
	public static void form() { 
		String path = "com/fuck/bean/EAM_SpMunicipalSon.java";
		List<Map<String,String>> list = getData(path);
		
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
			
			String rs = String.format(templateEdit(),
						map1.get("labelName"),map1.get("columnName"),t1 ,
						map2.get("labelName"),map2.get("columnName"),t2);
			
			System.out.println(rs);
		}
	}
	
	public static void formSon() { 
		String path = "com\\fuck\\bean\\EAM_SpConstructionSon.java";
		List<Map<String,String>> list = getData(path);
		
		for(int i=0;i<list.size()-1;i+=2){
			Map<String,String> map1 =  list.get(i);
			Map<String,String> map2 =  list.get(i+1);
			
			String t1 = "",t2 = "";
			if(map1.get("type").equals("Double")){
				t1 = " data-options=\"min:0,precision:2\" ";
			}
			if(map2.get("type").equals("Date")){
				t2 = " easyui-datebox";
			}
			
			String rs = String.format(templateEdit(),
						map1.get("labelName"),map1.get("columnName"),t1 ,
						map2.get("labelName"),map2.get("columnName"),t2);
			
			System.out.println(rs);
		}
	}
	
	public static void main(String[] args) throws Throwable {
		 //table();
		 //esacapeSlash();
		 formSon();
		
		 //format2();
		//iterator(null);
		 
	}
	
	public static Map format2(){
		Path.sourceCodeRoot = "D:/Workspaces/MyEclipse 10/Too/src/";
		String path = Path.sourceCodeRoot  + "com/fuck/text/format.txt" ;
		 
		String fileCont = FileIO.read(path);
		String regex = "\\s*";
		 
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(fileCont);
		String rs = matcher.replaceAll("");
		System.out.println(rs);
		
		// {s:1,"a":{b:3,c:6,d:{e:false}},'f":8}
		String p = rs.substring(1, rs.indexOf(":"));
		System.out.println(p);
		boolean isComplex = false;
		LinkedList<Character> dStack = new LinkedList<Character>();
		LinkedList<String> chStack = new LinkedList<String>();
		for(int i=0;i<rs.length();i++){
			char ch =rs.charAt(i);
			if(ch == '{'){
				dStack.push(ch);
			}
			else{
				int pos = rs.indexOf(":");
				String txt = rs.substring(i, pos);
				chStack.push(txt);
				i++;
			}
		}
		//if()
		//string v = rs.substring(rs.indexOf(":"), endIndex)
		return null;
	}
	// {s:1,"a":{b:3,c:6,d:{e:false,g:5}},'f":8}
	public static void iterator2(String input){
		input = "e:false,g:true";
		String regex = "^([^:]+:[^,]+,?)*$"; //这是匹配整个串
		 
		Pattern pattern = Pattern.compile(regex );
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) {
			String rt =matcher.group(0);
			System.out.println(rt);
		}
	}
		
		// {s:1,"a":{b:3,c:6,d:{e:false,g:5}},'f":8}
		public static void iterator(String input){
			input = "e:false,g:true";
		    String regex = "(?:([^:]+:[^,]+),?)";//部分匹配
			 
			Pattern pattern = Pattern.compile(regex );
			Matcher matcher = pattern.matcher(input);
			List<Map<String,String>> pvList = new LinkedList<Map<String,String>>();
			while (matcher.find()) {
				String rt =matcher.group(1);
				String [] pv = rt.split(":");
				Map<String,String> map = new HashMap<String,String>();
				map.put(pv[0], pv[1]);
				pvList.add(map);
				//System.out.println(rt);
			}
		}
			
//		
//		for(int i=0;i<input.length();i++){
//			char ch =rs.charAt(i);
//			if(ch == '{'){
//				dStack.push(ch);
//			}
//			else{
//				int pos = rs.indexOf(":");
//				String txt = rs.substring(i, pos);
//				chStack.push(txt);
//				i++;
//			}
//		}
  
	
	public static Map format(){
	 
		 Map root = new LinkedHashMap();
		 
		 Map map1 = new LinkedHashMap();
		 map1.put("b",3 );
		 map1.put("c",6);
		 
		 Map map2 = new LinkedHashMap();
		 map2.put("e",false);
		 
		 map1.put("d",map2);
		 
		 root.put("a",map1);
		 root.put("f",8);
		 return root;
	}

	

//	public static void main(String[] args) throws Throwable {
//		Class<? extends Object> type = EAM_Address.class;
//	 
//		BeanInfo beanInfo = Introspector.getBeanInfo(type);
//		PropertyDescriptor[] pdArr = beanInfo.getPropertyDescriptors();
//		
//		String s ="";
//		for (PropertyDescriptor descriptor : pdArr) {
//			Class<?> tCls = descriptor.getPropertyType();
//			String pName = descriptor.getName();
//			if (pName.equals("class")) 
//				continue;
//			System.out.println(pName+":"+ tCls.getName());
//			
//			String rs = String.format("<td data-name=\"%s\" class=\"view-td\" colspan=\"3\"/>%s",pName,tCls.getName());
//			System.out.println(rs);
//
//		}
		
//		 introBeanByReg();
//
//	}
	

}