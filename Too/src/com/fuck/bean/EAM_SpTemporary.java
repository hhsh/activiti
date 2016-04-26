package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 临时工程类实体对应表 
 *
 * <p>用来存放临时工程类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpTemporary")
@PrimaryKeyJoinColumn(name="spt_Id") //临时工程id
public class EAM_SpTemporary extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String spt_Jsdw;  //建设单位
	private String spt_Ydghxkzh;  //用地规划许可证号
	private Date spt_Gcghxkzh;  //工程规划许可证号
	private String spt_Gytdzh;  //国有土地证号
	private String spt_Dxth;  //地形图号
	
	private String spt_Jdmj;  //基底面积（M2）
	private String spt_Jzmj;  //建筑面积（M2）
	private String spt_Dscs;  //地上层数
	private String spt_Dxcs;  //地下层数
	
	private String spt_Gd;  //高度（m）
	private String spt_Cd;  //长度（m）
	private String spt_Jglx;  //结构类型
	
	private String spt_Hxrq;  //红线日期
	private String spt_Gcghxkrq;  //工程规划许可证日期
	public String getSpt_Jsdw() {
		return spt_Jsdw;
	}
	public void setSpt_Jsdw(String spt_Jsdw) {
		this.spt_Jsdw = spt_Jsdw;
	}
	public String getSpt_Ydghxkzh() {
		return spt_Ydghxkzh;
	}
	public void setSpt_Ydghxkzh(String spt_Ydghxkzh) {
		this.spt_Ydghxkzh = spt_Ydghxkzh;
	}
	public Date getSpt_Gcghxkzh() {
		return spt_Gcghxkzh;
	}
	public void setSpt_Gcghxkzh(Date spt_Gcghxkzh) {
		this.spt_Gcghxkzh = spt_Gcghxkzh;
	}
	public String getSpt_Gytdzh() {
		return spt_Gytdzh;
	}
	public void setSpt_Gytdzh(String spt_Gytdzh) {
		this.spt_Gytdzh = spt_Gytdzh;
	}
	public String getSpt_Dxth() {
		return spt_Dxth;
	}
	public void setSpt_Dxth(String spt_Dxth) {
		this.spt_Dxth = spt_Dxth;
	}
	public String getSpt_Jdmj() {
		return spt_Jdmj;
	}
	public void setSpt_Jdmj(String spt_Jdmj) {
		this.spt_Jdmj = spt_Jdmj;
	}
	public String getSpt_Jzmj() {
		return spt_Jzmj;
	}
	public void setSpt_Jzmj(String spt_Jzmj) {
		this.spt_Jzmj = spt_Jzmj;
	}
	public String getSpt_Dscs() {
		return spt_Dscs;
	}
	public void setSpt_Dscs(String spt_Dscs) {
		this.spt_Dscs = spt_Dscs;
	}
	public String getSpt_Dxcs() {
		return spt_Dxcs;
	}
	public void setSpt_Dxcs(String spt_Dxcs) {
		this.spt_Dxcs = spt_Dxcs;
	}
	public String getSpt_Gd() {
		return spt_Gd;
	}
	public void setSpt_Gd(String spt_Gd) {
		this.spt_Gd = spt_Gd;
	}
	public String getSpt_Cd() {
		return spt_Cd;
	}
	public void setSpt_Cd(String spt_Cd) {
		this.spt_Cd = spt_Cd;
	}
	public String getSpt_Jglx() {
		return spt_Jglx;
	}
	public void setSpt_Jglx(String spt_Jglx) {
		this.spt_Jglx = spt_Jglx;
	}
	public String getSpt_Hxrq() {
		return spt_Hxrq;
	}
	public void setSpt_Hxrq(String spt_Hxrq) {
		this.spt_Hxrq = spt_Hxrq;
	}
	public String getSpt_Gcghxkrq() {
		return spt_Gcghxkrq;
	}
	public void setSpt_Gcghxkrq(String spt_Gcghxkrq) {
		this.spt_Gcghxkrq = spt_Gcghxkrq;
	}
	
	
}
