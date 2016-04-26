package com.esquare.eam.entity.actives;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 项目信息市政类型实体对应表
 * 
 * <p>用来存放单项工程市政类 的数据信息 同时该表继承项目信息表
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2014.1.14
 */

@Entity
@Table(name="EAM_SpMnuicipal")
@PrimaryKeyJoinColumn(name="spm_Id") //市政基础设施工程级表主键
public class EAM_SpMunicipal extends EAM_SingleProject {
	
	private static final long serialVersionUID = 1L;

	private String spm_Jsdw;  //建设单位
	private String spm_Djdw;  //代建单位
	private String spm_Sgdw;  //施工单位
	private String spm_Sjdw;  //设计单位
	private String spm_Jldw;  //监理单位
	private String spm_Kcdw;  //勘察单位
	private Integer spm_Szgclb;  //市政工程类别
	private String spm_Ydghxkzh;  //用地规划许可证号
	private String spm_Ghxkzh;  //规划许可证号
	private String spm_Lxpzwh;  //立项批准文号
	private String spm_Sgxkzh;  //施工许可证号
	private String spm_Jglx;  //结构类型
	private String spm_Jb;    //级别
	private String spm_Hz;    //荷载
	private Double spm_Cd;     //长度
	private Double spm_Kd;     //宽度
	private Double spm_Gd;     //高度
	private Double spm_Kj;     //跨径
	private Integer spm_Ks;   //孔数
	private String spm_Jk;    //净空
	private Double spm_Jzmj;   //建筑面积
	private Date spm_Kgrq;  //开工日期
	private Date spm_Jgrq;  //竣工日期
	private Double spm_Ydmj;  //用地面积
	private Double spm_Gcys;  //工程预算
	private Double spm_Gcjs;  //工程决算
	public String getSpm_Jsdw() {
		return spm_Jsdw;
	}
	public void setSpm_Jsdw(String spm_Jsdw) {
		this.spm_Jsdw = spm_Jsdw;
	}
	public String getSpm_Ydghxkzh() {
		return spm_Ydghxkzh;
	}
	public void setSpm_Ydghxkzh(String spm_Ydghxkzh) {
		this.spm_Ydghxkzh = spm_Ydghxkzh;
	}
	public String getSpm_Djdw() {
		return spm_Djdw;
	}
	public void setSpm_Djdw(String spm_Djdw) {
		this.spm_Djdw = spm_Djdw;
	}
	public String getSpm_Sgdw() {
		return spm_Sgdw;
	}
	public void setSpm_Sgdw(String spm_Sgdw) {
		this.spm_Sgdw = spm_Sgdw;
	}
	public String getSpm_Sjdw() {
		return spm_Sjdw;
	}
	public void setSpm_Sjdw(String spm_Sjdw) {
		this.spm_Sjdw = spm_Sjdw;
	}
	public String getSpm_Jldw() {
		return spm_Jldw;
	}
	public void setSpm_Jldw(String spm_Jldw) {
		this.spm_Jldw = spm_Jldw;
	}
	public String getSpm_Kcdw() {
		return spm_Kcdw;
	}
	public void setSpm_Kcdw(String spm_Kcdw) {
		this.spm_Kcdw = spm_Kcdw;
	}
	public Integer getSpm_Szgclb() {
		return spm_Szgclb;
	}
	public void setSpm_Szgclb(Integer spm_Szgclb) {
		this.spm_Szgclb = spm_Szgclb;
	}
	public String getSpm_Ghxkzh() {
		return spm_Ghxkzh;
	}
	public void setSpm_Ghxkzh(String spm_Ghxkzh) {
		this.spm_Ghxkzh = spm_Ghxkzh;
	}
	public String getSpm_Lxpzwh() {
		return spm_Lxpzwh;
	}
	public void setSpm_Lxpzwh(String spm_Lxpzwh) {
		this.spm_Lxpzwh = spm_Lxpzwh;
	}
	public String getSpm_Sgxkzh() {
		return spm_Sgxkzh;
	}
	public void setSpm_Sgxkzh(String spm_Sgxkzh) {
		this.spm_Sgxkzh = spm_Sgxkzh;
	}
	public String getSpm_Jglx() {
		return spm_Jglx;
	}
	public void setSpm_Jglx(String spm_Jglx) {
		this.spm_Jglx = spm_Jglx;
	}
	public String getSpm_Jb() {
		return spm_Jb;
	}
	public void setSpm_Jb(String spm_Jb) {
		this.spm_Jb = spm_Jb;
	}
	public String getSpm_Hz() {
		return spm_Hz;
	}
	public void setSpm_Hz(String spm_Hz) {
		this.spm_Hz = spm_Hz;
	}
	public Double getSpm_Cd() {
		return spm_Cd;
	}
	public void setSpm_Cd(Double spm_Cd) {
		this.spm_Cd = spm_Cd;
	}
	public Double getSpm_Kd() {
		return spm_Kd;
	}
	public void setSpm_Kd(Double spm_Kd) {
		this.spm_Kd = spm_Kd;
	}
	public Double getSpm_Gd() {
		return spm_Gd;
	}
	public void setSpm_Gd(Double spm_Gd) {
		this.spm_Gd = spm_Gd;
	}
	public Double getSpm_Kj() {
		return spm_Kj;
	}
	public void setSpm_Kj(Double spm_Kj) {
		this.spm_Kj = spm_Kj;
	}
	public Integer getSpm_Ks() {
		return spm_Ks;
	}
	public void setSpm_Ks(Integer spm_Ks) {
		this.spm_Ks = spm_Ks;
	}
	public String getSpm_Jk() {
		return spm_Jk;
	}
	public void setSpm_Jk(String spm_Jk) {
		this.spm_Jk = spm_Jk;
	}
	public Double getSpm_Jzmj() {
		return spm_Jzmj;
	}
	public void setSpm_Jzmj(Double spm_Jzmj) {
		this.spm_Jzmj = spm_Jzmj;
	}
	public Date getSpm_Kgrq() {
		return spm_Kgrq;
	}
	public void setSpm_Kgrq(Date spm_Kgrq) {
		this.spm_Kgrq = spm_Kgrq;
	}
	public Date getSpm_Jgrq() {
		return spm_Jgrq;
	}
	public void setSpm_Jgrq(Date spm_Jgrq) {
		this.spm_Jgrq = spm_Jgrq;
	}
	public Double getSpm_Ydmj() {
		return spm_Ydmj;
	}
	public void setSpm_Ydmj(Double spm_Ydmj) {
		this.spm_Ydmj = spm_Ydmj;
	}
	public Double getSpm_Gcys() {
		return spm_Gcys;
	}
	public void setSpm_Gcys(Double spm_Gcys) {
		this.spm_Gcys = spm_Gcys;
	}
	public Double getSpm_Gcjs() {
		return spm_Gcjs;
	}
	public void setSpm_Gcjs(Double spm_Gcjs) {
		this.spm_Gcjs = spm_Gcjs;
	}
}