package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 建筑设计类
 * @author 黄华山
 * @version 2016/04/20
 */
@Entity
@Table(name="EAM_SpDesign")
@PrimaryKeyJoinColumn(name="sjda_Id") //临设计档案id
public class EAM_SpDesign extends EAM_SingleProject{
	
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
	
	private String sjda_Jzsjr;  //建筑设计人
	private String sjda_Jgsjr;  //结构设计人
	private String sjda_Ssjr;  //水设计人
	private String sjda_Dsjr;  //电设计人
	
	private String sjda_Jzxdr;  //建筑校对人
	private String sjda_Jgxdr;  //结构校对人
	private String sjda_Sxdr;  //水校对人
	private String sjda_Dxdr;  //电校对人
	
	private String sjda_Jzshr;  //建筑审核人
	private String sjda_Jgshr;  //结构审核人
	private String sjda_Sshr;  //水审核人
	private String sjda_Dshr;  //电审核人
	
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
	
	public String getSjda_Sdr() {
		return sjda_Sdr;
	}
	public void setSjda_Sdr(String sjda_Sdr) {
		this.sjda_Sdr = sjda_Sdr;
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
	public String getSjda_Jzsjr() {
		return sjda_Jzsjr;
	}
	public void setSjda_Jzsjr(String sjda_Jzsjr) {
		this.sjda_Jzsjr = sjda_Jzsjr;
	}
	public String getSjda_Jgsjr() {
		return sjda_Jgsjr;
	}
	public void setSjda_Jgsjr(String sjda_Jgsjr) {
		this.sjda_Jgsjr = sjda_Jgsjr;
	}
	public String getSjda_Ssjr() {
		return sjda_Ssjr;
	}
	public void setSjda_Ssjr(String sjda_Ssjr) {
		this.sjda_Ssjr = sjda_Ssjr;
	}
	public String getSjda_Dsjr() {
		return sjda_Dsjr;
	}
	public void setSjda_Dsjr(String sjda_Dsjr) {
		this.sjda_Dsjr = sjda_Dsjr;
	}
	public String getSjda_Jzxdr() {
		return sjda_Jzxdr;
	}
	public void setSjda_Jzxdr(String sjda_Jzxdr) {
		this.sjda_Jzxdr = sjda_Jzxdr;
	}
	public String getSjda_Jgxdr() {
		return sjda_Jgxdr;
	}
	public void setSjda_Jgxdr(String sjda_Jgxdr) {
		this.sjda_Jgxdr = sjda_Jgxdr;
	}
	public String getSjda_Sxdr() {
		return sjda_Sxdr;
	}
	public void setSjda_Sxdr(String sjda_Sxdr) {
		this.sjda_Sxdr = sjda_Sxdr;
	}
	public String getSjda_Dxdr() {
		return sjda_Dxdr;
	}
	public void setSjda_Dxdr(String sjda_Dxdr) {
		this.sjda_Dxdr = sjda_Dxdr;
	}
	public String getSjda_Jzshr() {
		return sjda_Jzshr;
	}
	public void setSjda_Jzshr(String sjda_Jzshr) {
		this.sjda_Jzshr = sjda_Jzshr;
	}
	public String getSjda_Jgshr() {
		return sjda_Jgshr;
	}
	public void setSjda_Jgshr(String sjda_Jgshr) {
		this.sjda_Jgshr = sjda_Jgshr;
	}
	public String getSjda_Sshr() {
		return sjda_Sshr;
	}
	public void setSjda_Sshr(String sjda_Sshr) {
		this.sjda_Sshr = sjda_Sshr;
	}
	public String getSjda_Dshr() {
		return sjda_Dshr;
	}
	public void setSjda_Dshr(String sjda_Dshr) {
		this.sjda_Dshr = sjda_Dshr;
	}
	
}
