package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EAM_CautionMoney")
public class EAM_CautionMoney   implements Serializable{

private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
//	private Long ctMoney_Id; // 主键
	private Integer ctMoney_Gcdh;  //工程代号
	private Double ctMoney_Bzje;  //保证金额（元）
	private Date ctMoney_Jkrq;  //交款日期
	private String ctMoney_Sjhm;  //收据号码
	private String ctMoney_Gclb;  //工程类别
	private String ctMoney_Gfsqjsr;  //馆方收取经手人
	private String ctMoney_Gcmc;  //工程名称
	private String ctMoney_Jsdw;  //建设单位
	private String ctMoney_Gcdd;  //工程地点
	private String ctMoney_Jglx;  //结构类型
	private String ctMoney_Cs;  //层数
	private String ctMoney_Zs;  //幢数
	private String ctMoney_Ltkr;  //领退款人
	private String ctMoney_Gfthjsr;  //馆方退还经手人
	private Date ctMoney_Thrq;  //退款日期
	private String ctMoney_Bz;  //备注
	
	
	
	public String getCtMoney_Gcmc() {
		return ctMoney_Gcmc;
	}
	public void setCtMoney_Gcmc(String ctMoney_Gcmc) {
		this.ctMoney_Gcmc = ctMoney_Gcmc;
	}
	public String getCtMoney_Jsdw() {
		return ctMoney_Jsdw;
	}
	public void setCtMoney_Jsdw(String ctMoney_Jsdw) {
		this.ctMoney_Jsdw = ctMoney_Jsdw;
	}
	public String getCtMoney_Gcdd() {
		return ctMoney_Gcdd;
	}
	public void setCtMoney_Gcdd(String ctMoney_Gcdd) {
		this.ctMoney_Gcdd = ctMoney_Gcdd;
	}
	public String getCtMoney_Jglx() {
		return ctMoney_Jglx;
	}
	public void setCtMoney_Jglx(String ctMoney_Jglx) {
		this.ctMoney_Jglx = ctMoney_Jglx;
	}
	public String getCtMoney_Cs() {
		return ctMoney_Cs;
	}
	public void setCtMoney_Cs(String ctMoney_Cs) {
		this.ctMoney_Cs = ctMoney_Cs;
	}
	public String getCtMoney_Zs() {
		return ctMoney_Zs;
	}
	public void setCtMoney_Zs(String ctMoney_Zs) {
		this.ctMoney_Zs = ctMoney_Zs;
	}
	public Long getCtMoney_Id() {
		return ctMoney_Id;
	}
	public void setCtMoney_Id(Long ctMoney_Id) {
		this.ctMoney_Id = ctMoney_Id;
	}
	public Integer getCtMoney_Gcdh() {
		return ctMoney_Gcdh;
	}
	public void setCtMoney_Gcdh(Integer ctMoney_Gcdh) {
		this.ctMoney_Gcdh = ctMoney_Gcdh;
	}
	public Double getCtMoney_Bzje() {
		return ctMoney_Bzje;
	}
	public void setCtMoney_Bzje(Double ctMoney_Bzje) {
		this.ctMoney_Bzje = ctMoney_Bzje;
	}
	public Date getCtMoney_Jkrq() {
		return ctMoney_Jkrq;
	}
	public void setCtMoney_Jkrq(Date ctMoney_Jkrq) {
		this.ctMoney_Jkrq = ctMoney_Jkrq;
	}
	public String getCtMoney_Sjhm() {
		return ctMoney_Sjhm;
	}
	public void setCtMoney_Sjhm(String ctMoney_Sjhm) {
		this.ctMoney_Sjhm = ctMoney_Sjhm;
	}
	public String getCtMoney_Gclb() {
		return ctMoney_Gclb;
	}
	public void setCtMoney_Gclb(String ctMoney_Gclb) {
		this.ctMoney_Gclb = ctMoney_Gclb;
	}
	public String getCtMoney_Gfsqjsr() {
		return ctMoney_Gfsqjsr;
	}
	public void setCtMoney_Gfsqjsr(String ctMoney_Gfsqjsr) {
		this.ctMoney_Gfsqjsr = ctMoney_Gfsqjsr;
	}
	public String getCtMoney_Ltkr() {
		return ctMoney_Ltkr;
	}
	public void setCtMoney_Ltkr(String ctMoney_Ltkr) {
		this.ctMoney_Ltkr = ctMoney_Ltkr;
	}
	public String getCtMoney_Gfthjsr() {
		return ctMoney_Gfthjsr;
	}
	public void setCtMoney_Gfthjsr(String ctMoney_Gfthjsr) {
		this.ctMoney_Gfthjsr = ctMoney_Gfthjsr;
	}
	public Date getCtMoney_Thrq() {
		return ctMoney_Thrq;
	}
	public void setCtMoney_Thrq(Date ctMoney_Thrq) {
		this.ctMoney_Thrq = ctMoney_Thrq;
	}
	public String getCtMoney_Bz() {
		return ctMoney_Bz;
	}
	public void setCtMoney_Bz(String ctMoney_Bz) {
		this.ctMoney_Bz = ctMoney_Bz;
	}
	
	
	 
	
	
	
}
