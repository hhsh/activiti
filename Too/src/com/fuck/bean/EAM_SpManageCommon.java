package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 规划勘察类实体对应表 （与综合类、施工执照类共用一个表）
 *
 * <p>用来存放规划勘察类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpManageCommon")
@PrimaryKeyJoinColumn(name="spmc_Id") //规划勘察id
public class EAM_SpManageCommon extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String spmc_Jsdw;  //编制单位
	private String spmc_Xzzh;  //组织编制单位
	private Date spmc_Ydghxkzh;  //批复日期
	
	public String getSpmc_Jsdw() {
		return spmc_Jsdw;
	}
	public void setSpmc_Jsdw(String spmc_Jsdw) {
		this.spmc_Jsdw = spmc_Jsdw;
	}
	public String getSpmc_Xzzh() {
		return spmc_Xzzh;
	}
	public void setSpmc_Xzzh(String spmc_Xzzh) {
		this.spmc_Xzzh = spmc_Xzzh;
	}
	public Date getSpmc_Ydghxkzh() {
		return spmc_Ydghxkzh;
	}
	public void setSpmc_Ydghxkzh(Date spmc_Ydghxkzh) {
		this.spmc_Ydghxkzh = spmc_Ydghxkzh;
	}
	
	
}
