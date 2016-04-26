package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 市政设计类
 * @author 黄华山
 * @version 2016/04/20
 */
@Entity
@Table(name="EAM_SpDesignMncpl")
@PrimaryKeyJoinColumn(name="sjda_Id") //临设计档案id
public class EAM_SpDesignMunicipal extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String sjda_Jsdw;  //建设单位
	private String sjda_Sjdw;  //设计单位
	
	private String sjda_Jdmj;  //基底面积（M2）
	private String sjda_Jzmj;  //建筑面积（M2）
	private Integer sjda_Cs;  //层数
	private Double sjda_Cd;  //长度（m）
	private String sjda_Jglx;  //结构类型
	private Date sjda_Hxrq;  //红线日期
	private Date sjda_Sjrq;  //设计日期
	private String sjda_Ywh;  //业务号
 
	
	private String sjda_Xmfzr;  //项目负责人
	
	private String sjda_Dlsjr;  //道路设计人
	private String sjda_Qhsjr;  //桥涵设计人
	private String sjda_Gxsjr;  //管线设计人
	private String sjda_Dqsjr;  //电气设计人
	private String sjda_Jtsjr;  //交通设计人
	private String sjda_Lhsjr;  //绿化设计人
	private String sjda_Qtsjr;  //其他设计人
	
	
	private String sjda_Dlxdr;  //道路校对人
	private String sjda_Qhxdr;  //桥涵校对人
	private String sjda_Gxxdr;  //管线校对人
	private String sjda_Dqxdr;  //电气校对人
	private String sjda_Jtxdr;  //交通校对人
	private String sjda_Lhxdr;  //绿化校对人
	private String sjda_Qtxdr;  //其他校对人
	
	
	private String sjda_Dlshr;  //道路审核人
	private String sjda_Qhshr;  //桥涵审核人 
	private String sjda_Gxshr;  //管线审核人 
	private String sjda_Dqshr;  //电气审核人
	private String sjda_Jtshr;  //交通审核人
	private String sjda_Lhshr;  //绿化审核人
	private String sjda_Qtshr;  //其他审核人
	
	
	private String sjda_Dlzcz;  //道路注册章
	private String sjda_Qhzcz;  //桥涵注册章 
	private String sjda_Gxzcz;  //管线注册章
	private String sjda_Dqzcz;  //电气注册章 
	private String sjda_Jtzcz;  //交通注册章
	private String sjda_Lhzcz;  //绿化注册章
	private String sjda_Qtzcz;  //其他注册章
	
	
	private String sjda_Sdr;  //审定人


	public String getSjda_Jsdw() {
		return sjda_Jsdw;
	}


	public void setSjda_Jsdw(String sjda_Jsdw) {
		this.sjda_Jsdw = sjda_Jsdw;
	}


	public String getSjda_Sjdw() {
		return sjda_Sjdw;
	}


	public void setSjda_Sjdw(String sjda_Sjdw) {
		this.sjda_Sjdw = sjda_Sjdw;
	}


	public String getSjda_Jdmj() {
		return sjda_Jdmj;
	}


	public void setSjda_Jdmj(String sjda_Jdmj) {
		this.sjda_Jdmj = sjda_Jdmj;
	}


	public String getSjda_Jzmj() {
		return sjda_Jzmj;
	}


	public void setSjda_Jzmj(String sjda_Jzmj) {
		this.sjda_Jzmj = sjda_Jzmj;
	}


	public Integer getSjda_Cs() {
		return sjda_Cs;
	}


	public void setSjda_Cs(Integer sjda_Cs) {
		this.sjda_Cs = sjda_Cs;
	}


	public Double getSjda_Cd() {
		return sjda_Cd;
	}


	public void setSjda_Cd(Double sjda_Cd) {
		this.sjda_Cd = sjda_Cd;
	}


	public String getSjda_Jglx() {
		return sjda_Jglx;
	}


	public void setSjda_Jglx(String sjda_Jglx) {
		this.sjda_Jglx = sjda_Jglx;
	}


	public Date getSjda_Hxrq() {
		return sjda_Hxrq;
	}


	public void setSjda_Hxrq(Date sjda_Hxrq) {
		this.sjda_Hxrq = sjda_Hxrq;
	}


	public Date getSjda_Sjrq() {
		return sjda_Sjrq;
	}


	public void setSjda_Sjrq(Date sjda_Sjrq) {
		this.sjda_Sjrq = sjda_Sjrq;
	}


	public String getSjda_Ywh() {
		return sjda_Ywh;
	}


	public void setSjda_Ywh(String sjda_Ywh) {
		this.sjda_Ywh = sjda_Ywh;
	}


	public String getSjda_Xmfzr() {
		return sjda_Xmfzr;
	}


	public void setSjda_Xmfzr(String sjda_Xmfzr) {
		this.sjda_Xmfzr = sjda_Xmfzr;
	}


	public String getSjda_Dlsjr() {
		return sjda_Dlsjr;
	}


	public void setSjda_Dlsjr(String sjda_Dlsjr) {
		this.sjda_Dlsjr = sjda_Dlsjr;
	}


	public String getSjda_Qhsjr() {
		return sjda_Qhsjr;
	}


	public void setSjda_Qhsjr(String sjda_Qhsjr) {
		this.sjda_Qhsjr = sjda_Qhsjr;
	}


	public String getSjda_Gxsjr() {
		return sjda_Gxsjr;
	}


	public void setSjda_Gxsjr(String sjda_Gxsjr) {
		this.sjda_Gxsjr = sjda_Gxsjr;
	}


	public String getSjda_Dqsjr() {
		return sjda_Dqsjr;
	}


	public void setSjda_Dqsjr(String sjda_Dqsjr) {
		this.sjda_Dqsjr = sjda_Dqsjr;
	}


	public String getSjda_Jtsjr() {
		return sjda_Jtsjr;
	}


	public void setSjda_Jtsjr(String sjda_Jtsjr) {
		this.sjda_Jtsjr = sjda_Jtsjr;
	}


	public String getSjda_Lhsjr() {
		return sjda_Lhsjr;
	}


	public void setSjda_Lhsjr(String sjda_Lhsjr) {
		this.sjda_Lhsjr = sjda_Lhsjr;
	}


	public String getSjda_Qtsjr() {
		return sjda_Qtsjr;
	}


	public void setSjda_Qtsjr(String sjda_Qtsjr) {
		this.sjda_Qtsjr = sjda_Qtsjr;
	}


	public String getSjda_Dlxdr() {
		return sjda_Dlxdr;
	}


	public void setSjda_Dlxdr(String sjda_Dlxdr) {
		this.sjda_Dlxdr = sjda_Dlxdr;
	}


	public String getSjda_Qhxdr() {
		return sjda_Qhxdr;
	}


	public void setSjda_Qhxdr(String sjda_Qhxdr) {
		this.sjda_Qhxdr = sjda_Qhxdr;
	}


	public String getSjda_Gxxdr() {
		return sjda_Gxxdr;
	}


	public void setSjda_Gxxdr(String sjda_Gxxdr) {
		this.sjda_Gxxdr = sjda_Gxxdr;
	}


	public String getSjda_Dqxdr() {
		return sjda_Dqxdr;
	}


	public void setSjda_Dqxdr(String sjda_Dqxdr) {
		this.sjda_Dqxdr = sjda_Dqxdr;
	}


	public String getSjda_Jtxdr() {
		return sjda_Jtxdr;
	}


	public void setSjda_Jtxdr(String sjda_Jtxdr) {
		this.sjda_Jtxdr = sjda_Jtxdr;
	}


	public String getSjda_Lhxdr() {
		return sjda_Lhxdr;
	}


	public void setSjda_Lhxdr(String sjda_Lhxdr) {
		this.sjda_Lhxdr = sjda_Lhxdr;
	}


	public String getSjda_Qtxdr() {
		return sjda_Qtxdr;
	}


	public void setSjda_Qtxdr(String sjda_Qtxdr) {
		this.sjda_Qtxdr = sjda_Qtxdr;
	}


	public String getSjda_Dlshr() {
		return sjda_Dlshr;
	}


	public void setSjda_Dlshr(String sjda_Dlshr) {
		this.sjda_Dlshr = sjda_Dlshr;
	}


	public String getSjda_Qhshr() {
		return sjda_Qhshr;
	}


	public void setSjda_Qhshr(String sjda_Qhshr) {
		this.sjda_Qhshr = sjda_Qhshr;
	}


	public String getSjda_Gxshr() {
		return sjda_Gxshr;
	}


	public void setSjda_Gxshr(String sjda_Gxshr) {
		this.sjda_Gxshr = sjda_Gxshr;
	}


	public String getSjda_Dqshr() {
		return sjda_Dqshr;
	}


	public void setSjda_Dqshr(String sjda_Dqshr) {
		this.sjda_Dqshr = sjda_Dqshr;
	}


	public String getSjda_Jtshr() {
		return sjda_Jtshr;
	}


	public void setSjda_Jtshr(String sjda_Jtshr) {
		this.sjda_Jtshr = sjda_Jtshr;
	}


	public String getSjda_Lhshr() {
		return sjda_Lhshr;
	}


	public void setSjda_Lhshr(String sjda_Lhshr) {
		this.sjda_Lhshr = sjda_Lhshr;
	}


	public String getSjda_Qtshr() {
		return sjda_Qtshr;
	}


	public void setSjda_Qtshr(String sjda_Qtshr) {
		this.sjda_Qtshr = sjda_Qtshr;
	}


	public String getSjda_Dlzcz() {
		return sjda_Dlzcz;
	}


	public void setSjda_Dlzcz(String sjda_Dlzcz) {
		this.sjda_Dlzcz = sjda_Dlzcz;
	}


	public String getSjda_Qhzcz() {
		return sjda_Qhzcz;
	}


	public void setSjda_Qhzcz(String sjda_Qhzcz) {
		this.sjda_Qhzcz = sjda_Qhzcz;
	}


	public String getSjda_Gxzcz() {
		return sjda_Gxzcz;
	}


	public void setSjda_Gxzcz(String sjda_Gxzcz) {
		this.sjda_Gxzcz = sjda_Gxzcz;
	}


	public String getSjda_Dqzcz() {
		return sjda_Dqzcz;
	}


	public void setSjda_Dqzcz(String sjda_Dqzcz) {
		this.sjda_Dqzcz = sjda_Dqzcz;
	}


	public String getSjda_Jtzcz() {
		return sjda_Jtzcz;
	}


	public void setSjda_Jtzcz(String sjda_Jtzcz) {
		this.sjda_Jtzcz = sjda_Jtzcz;
	}


	public String getSjda_Lhzcz() {
		return sjda_Lhzcz;
	}


	public void setSjda_Lhzcz(String sjda_Lhzcz) {
		this.sjda_Lhzcz = sjda_Lhzcz;
	}


	public String getSjda_Qtzcz() {
		return sjda_Qtzcz;
	}


	public void setSjda_Qtzcz(String sjda_Qtzcz) {
		this.sjda_Qtzcz = sjda_Qtzcz;
	}


	public String getSjda_Sdr() {
		return sjda_Sdr;
	}


	public void setSjda_Sdr(String sjda_Sdr) {
		this.sjda_Sdr = sjda_Sdr;
	}
 
	
	
}
