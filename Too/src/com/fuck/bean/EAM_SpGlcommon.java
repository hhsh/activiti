package com.esquare.eam.entity.actives;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 项目信息房屋类型实体对应表
 * 
 * <p>用来存放单项工程房屋类 的数据信息 同时该表继承项目信息表
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.1.2014.2.11
 */
@Entity
@Table(name="EAM_SpGlcommon")
@PrimaryKeyJoinColumn(name="spglc_Id") //竣工类档案id
public class EAM_SpGlcommon extends EAM_SingleProject{

	private static final long serialVersionUID = 1L;
	
	private String glc_Jsdw;  //建设单位

	public String getGlc_Jsdw() {
		return glc_Jsdw;
	}

	public void setGlc_Jsdw(String glc_Jsdw) {
		this.glc_Jsdw = glc_Jsdw;
	}
	
}
