package com.esquare.eam.entity.actives;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 项目信息管线类型实体对应表
 * 
 * <p>用来存放单项工程管线类 的数据信息 同时该表继承项目信息表
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2014.1.14
 */

@Entity
@Table(name="EAM_SpPipeline")
@PrimaryKeyJoinColumn(name="spp_Id") //城市管线工程级表主键
public class EAM_SpPipeline extends EAM_SingleProject {
	
	private static final long serialVersionUID = 1L;

	private String spp_Jsdw;  //建设单位
	private String spp_Djdw;  //代建单位
	private String spp_Sgdw;  //施工单位
	private String spp_Sjdw;  //设计单位
	private String spp_Jldw;  //监理单位
	private String spp_Kcdw;  //勘察单位
	private String spp_Ydghxkzh;  //用地规划许可证号
	private String spp_Ghxkzh;  //规划许可证号
	private String spp_Lxpzwh;  //立项批准文号
	private String spp_Sgxkzh;  //施工许可证号
	private String spp_Dxth;   //地形图号
	private String spp_Qd;     //起点
	private String spp_Zd;     //止点
	private Double spp_Cd;     //长度
	private String spp_Gg;     //规格
	private String spp_Cz;     //材质
	private String spp_Hz;     //荷载
	private Date spp_Kgrq;  //开工日期
	private Date spp_Jgrq;  //竣工日期
	private Double spp_Gcys;    //工程预算
	private Double spp_Gcjs;  //工程决算
	public String getSpp_Jsdw() {
		return spp_Jsdw;
	}
	public void setSpp_Jsdw(String spp_Jsdw) {
		this.spp_Jsdw = spp_Jsdw;
	}
	public String getSpp_Ydghxkzh() {
		return spp_Ydghxkzh;
	}
	public void setSpp_Ydghxkzh(String spp_Ydghxkzh) {
		this.spp_Ydghxkzh = spp_Ydghxkzh;
	}
	public String getSpp_Djdw() {
		return spp_Djdw;
	}
	public void setSpp_Djdw(String spp_Djdw) {
		this.spp_Djdw = spp_Djdw;
	}
	public String getSpp_Sgdw() {
		return spp_Sgdw;
	}
	public void setSpp_Sgdw(String spp_Sgdw) {
		this.spp_Sgdw = spp_Sgdw;
	}
	public String getSpp_Sjdw() {
		return spp_Sjdw;
	}
	public void setSpp_Sjdw(String spp_Sjdw) {
		this.spp_Sjdw = spp_Sjdw;
	}
	public String getSpp_Jldw() {
		return spp_Jldw;
	}
	public void setSpp_Jldw(String spp_Jldw) {
		this.spp_Jldw = spp_Jldw;
	}
	public String getSpp_Kcdw() {
		return spp_Kcdw;
	}
	public void setSpp_Kcdw(String spp_Kcdw) {
		this.spp_Kcdw = spp_Kcdw;
	}
	public String getSpp_Ghxkzh() {
		return spp_Ghxkzh;
	}
	public void setSpp_Ghxkzh(String spp_Ghxkzh) {
		this.spp_Ghxkzh = spp_Ghxkzh;
	}
	public String getSpp_Lxpzwh() {
		return spp_Lxpzwh;
	}
	public void setSpp_Lxpzwh(String spp_Lxpzwh) {
		this.spp_Lxpzwh = spp_Lxpzwh;
	}
	public String getSpp_Sgxkzh() {
		return spp_Sgxkzh;
	}
	public void setSpp_Sgxkzh(String spp_Sgxkzh) {
		this.spp_Sgxkzh = spp_Sgxkzh;
	}
	public String getSpp_Dxth() {
		return spp_Dxth;
	}
	public void setSpp_Dxth(String spp_Dxth) {
		this.spp_Dxth = spp_Dxth;
	}
	public String getSpp_Qd() {
		return spp_Qd;
	}
	public void setSpp_Qd(String spp_Qd) {
		this.spp_Qd = spp_Qd;
	}
	public String getSpp_Zd() {
		return spp_Zd;
	}
	public void setSpp_Zd(String spp_Zd) {
		this.spp_Zd = spp_Zd;
	}
	public Double getSpp_Cd() {
		return spp_Cd;
	}
	public void setSpp_Cd(Double spp_Cd) {
		this.spp_Cd = spp_Cd;
	}
	public String getSpp_Gg() {
		return spp_Gg;
	}
	public void setSpp_Gg(String spp_Gg) {
		this.spp_Gg = spp_Gg;
	}
	public String getSpp_Cz() {
		return spp_Cz;
	}
	public void setSpp_Cz(String spp_Cz) {
		this.spp_Cz = spp_Cz;
	}
	public String getSpp_Hz() {
		return spp_Hz;
	}
	public void setSpp_Hz(String spp_Hz) {
		this.spp_Hz = spp_Hz;
	}
	public Date getSpp_Kgrq() {
		return spp_Kgrq;
	}
	public void setSpp_Kgrq(Date spp_Kgrq) {
		this.spp_Kgrq = spp_Kgrq;
	}
	public Date getSpp_Jgrq() {
		return spp_Jgrq;
	}
	public void setSpp_Jgrq(Date spp_Jgrq) {
		this.spp_Jgrq = spp_Jgrq;
	}
	public Double getSpp_Gcys() {
		return spp_Gcys;
	}
	public void setSpp_Gcys(Double spp_Gcys) {
		this.spp_Gcys = spp_Gcys;
	}
	public Double getSpp_Gcjs() {
		return spp_Gcjs;
	}
	public void setSpp_Gcjs(Double spp_Gcjs) {
		this.spp_Gcjs = spp_Gcjs;
	}
}