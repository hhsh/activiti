package com.fuck.hugeObj;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		/**
		 * An internal error has occurred.
			Java heap space
		 */
		Map map ;
		for(int i=0;i<1000000000;i++){
			map = new HashMap();
			map.put("k", "xxxxxxxxxxxxxxxxx");// 6797492
			System.out.println(i);;
			 
		}
		
		
//		Map map = new HashMap();
//		for(int i=0;i<1000000000;i++){
//			map.put("k", "xxxxxxxxxxxxxxxxx");// 6755958
//			System.out.println(i);;
//		}
		
//		Map map = new HashMap();
//		String s = "xxxxxxxxxxxxxxxxx";
//		for(int i=0;i<1000000000;i++){ 
//			map.put("k", s);// 
//			System.out.println(i); // 11570000
//		}
	}
}
