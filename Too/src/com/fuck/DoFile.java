//package com.fuck;
//
//import java.beans.BeanInfo;
//import java.beans.IntrospectionException;
//import java.beans.Introspector;
//import java.beans.PropertyDescriptor;
//class Foo{
//	private String sjda_Dxdr;  //电校对人 （电气（照明））
//	private String sjda_Qtxdr;  //其他校对人
//	private String sjda_Lhxdr;  //绿化校对人
//	public String getSjda_Dxdr() {
//		return sjda_Dxdr;
//	}
//	public void setSjda_Dxdr(String sjda_Dxdr) {
//		this.sjda_Dxdr = sjda_Dxdr;
//	}
//	public String getSjda_Qtxdr() {
//		return sjda_Qtxdr;
//	}
//	public void setSjda_Qtxdr(String sjda_Qtxdr) {
//		this.sjda_Qtxdr = sjda_Qtxdr;
//	}
//	public String getSjda_Lhxdr() {
//		return sjda_Lhxdr;
//	}
//	public void setSjda_Lhxdr(String sjda_Lhxdr) {
//		this.sjda_Lhxdr = sjda_Lhxdr;
//	}
//	
//}
//public class DoFile {
//
// 
//	public static void main(String[] args) throws  Exception {
//		Class<? extends Object> type = Foo.class;
//		
//		
//		BeanInfo beanInfo = Introspector.getBeanInfo(type); 
//		PropertyDescriptor[] pdArr = beanInfo.getPropertyDescriptors();
//		for (PropertyDescriptor descriptor : pdArr) {
//			String propertyName = descriptor.getName();
//			if (!propertyName.equals("class")) {\
//				
//			}
//		}
//
//	}
//
//}
