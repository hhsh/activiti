package com.esquare.eam.entity.actives;

import java.sql.Date;

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
@Table(name="EAM_SpHouse")
@PrimaryKeyJoinColumn(name="sph_Id") //竣工类档案id
public class EAM_SpHouse extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String sph_Jsdw;  //建设单位
	private String sph_Djdw;  //代建单位
	private String sph_Sgdw;  //施工单位
	private String sph_Sjdw;  //设计单位
	private String sph_Jldw;  //监理单位
	private String sph_Kcdw;  //勘察单位
	private String sph_Ydghxkzh;  //用地规划许可证号
	private String sph_Ghxkzh;    //工程规划许可证号
	private String sph_Gytdzh;    //国有土地证号
	private String sph_Ghyshgzh;    //规划验收合格证号
	private String sph_Jdmj;    //基地面积
	private String sph_Dxsmj; //地下室面积（M2）
	private String sph_Lxpzwh;  //立项批准文号
	private String sph_Lxpzdw;  //立项批准单位
	private String sph_Sgxkzh;  //施工许可证号
	private Double sph_Gd;  //高度
	private String sph_Dscs;  //地上层数
	private String sph_Dxcs;  //地下层数
	private String sph_Jclx;  //基础类型
	private Double sph_Jzmj;  //建筑面积
	private Double sph_Ydmj;  //用地面积
	private String sph_Jglx;  //结构类型
	private Date sph_Kgrq;  //开工日期
	private Date sph_Jgrq;  //竣工日期
	private Date sph_Ghyssj;  //规划验收时间
	private Date sph_Basj;  //备案时间
	private Integer sph_Zs;  //幢数
	private Double sph_Gczj;   //工程造价
	private Double sph_Gcys;    //工程预算
	private Double sph_Gcjs;  //工程结算
	private String sph_Fzh;  //附注
	
	
	public String getSph_Lxpzdw() {
		return sph_Lxpzdw;
	}
	public void setSph_Lxpzdw(String sph_Lxpzdw) {
		this.sph_Lxpzdw = sph_Lxpzdw;
	}
	public String getSph_Jsdw() {
		return sph_Jsdw;
	}
	public void setSph_Jsdw(String sph_Jsdw) {
		this.sph_Jsdw = sph_Jsdw;
	}
	public String getSph_Ydghxkzh() {
		return sph_Ydghxkzh;
	}
	public void setSph_Ydghxkzh(String sph_Ydghxkzh) {
		this.sph_Ydghxkzh = sph_Ydghxkzh;
	}
	public String getSph_Djdw() {
		return sph_Djdw;
	}
	public void setSph_Djdw(String sph_Djdw) {
		this.sph_Djdw = sph_Djdw;
	}
	public String getSph_Sgdw() {
		return sph_Sgdw;
	}
	public void setSph_Sgdw(String sph_Sgdw) {
		this.sph_Sgdw = sph_Sgdw;
	}
	public String getSph_Sjdw() {
		return sph_Sjdw;
	}
	public void setSph_Sjdw(String sph_Sjdw) {
		this.sph_Sjdw = sph_Sjdw;
	}
	public String getSph_Jldw() {
		return sph_Jldw;
	}
	public void setSph_Jldw(String sph_Jldw) {
		this.sph_Jldw = sph_Jldw;
	}
	public String getSph_Kcdw() {
		return sph_Kcdw;
	}
	public void setSph_Kcdw(String sph_Kcdw) {
		this.sph_Kcdw = sph_Kcdw;
	}
	public String getSph_Ghxkzh() {
		return sph_Ghxkzh;
	}
	public void setSph_Ghxkzh(String sph_Ghxkzh) {
		this.sph_Ghxkzh = sph_Ghxkzh;
	}
	public String getSph_Lxpzwh() {
		return sph_Lxpzwh;
	}
	public void setSph_Lxpzwh(String sph_Lxpzwh) {
		this.sph_Lxpzwh = sph_Lxpzwh;
	}
	public String getSph_Sgxkzh() {
		return sph_Sgxkzh;
	}
	public void setSph_Sgxkzh(String sph_Sgxkzh) {
		this.sph_Sgxkzh = sph_Sgxkzh;
	}
	public Double getSph_Gd() {
		return sph_Gd;
	}
	public void setSph_Gd(Double sph_Gd) {
		this.sph_Gd = sph_Gd;
	}
	public String getSph_Dscs() {
		return sph_Dscs;
	}
	public void setSph_Dscs(String sph_Dscs) {
		this.sph_Dscs = sph_Dscs;
	}
	public String getSph_Dxcs() {
		return sph_Dxcs;
	}
	public void setSph_Dxcs(String sph_Dxcs) {
		this.sph_Dxcs = sph_Dxcs;
	}
	public String getSph_Jclx() {
		return sph_Jclx;
	}
	public void setSph_Jclx(String sph_Jclx) {
		this.sph_Jclx = sph_Jclx;
	}
	public Double getSph_Jzmj() {
		return sph_Jzmj;
	}
	public void setSph_Jzmj(Double sph_Jzmj) {
		this.sph_Jzmj = sph_Jzmj;
	}
	public Double getSph_Ydmj() {
		return sph_Ydmj;
	}
	public void setSph_Ydmj(Double sph_Ydmj) {
		this.sph_Ydmj = sph_Ydmj;
	}
	public String getSph_Jglx() {
		return sph_Jglx;
	}
	public void setSph_Jglx(String sph_Jglx) {
		this.sph_Jglx = sph_Jglx;
	}
	public Date getSph_Kgrq() {
		return sph_Kgrq;
	}
	public void setSph_Kgrq(Date sph_Kgrq) {
		this.sph_Kgrq = sph_Kgrq;
	}
	public Date getSph_Jgrq() {
		return sph_Jgrq;
	}
	public void setSph_Jgrq(Date sph_Jgrq) {
		this.sph_Jgrq = sph_Jgrq;
	}
	public Integer getSph_Zs() {
		return sph_Zs;
	}
	public void setSph_Zs(Integer sph_Zs) {
		this.sph_Zs = sph_Zs;
	}
	public Double getSph_Gcys() {
		return sph_Gcys;
	}
	public void setSph_Gcys(Double sph_Gcys) {
		this.sph_Gcys = sph_Gcys;
	}
	public Double getSph_Gcjs() {
		return sph_Gcjs;
	}
	public void setSph_Gcjs(Double sph_Gcjs) {
		this.sph_Gcjs = sph_Gcjs;
	}
	public String getSph_Gytdzh() {
		return sph_Gytdzh;
	}
	public void setSph_Gytdzh(String sph_Gytdzh) {
		this.sph_Gytdzh = sph_Gytdzh;
	}
	public String getSph_Ghyshgzh() {
		return sph_Ghyshgzh;
	}
	public void setSph_Ghyshgzh(String sph_Ghyshgzh) {
		this.sph_Ghyshgzh = sph_Ghyshgzh;
	}
	public String getSph_Jdmj() {
		return sph_Jdmj;
	}
	public void setSph_Jdmj(String sph_Jdmj) {
		this.sph_Jdmj = sph_Jdmj;
	}
	public String getSph_Dxsmj() {
		return sph_Dxsmj;
	}
	public void setSph_Dxsmj(String sph_Dxsmj) {
		this.sph_Dxsmj = sph_Dxsmj;
	}
	public Date getSph_Ghyssj() {
		return sph_Ghyssj;
	}
	public void setSph_Ghyssj(Date sph_Ghyssj) {
		this.sph_Ghyssj = sph_Ghyssj;
	}
	public Date getSph_Basj() {
		return sph_Basj;
	}
	public void setSph_Basj(Date sph_Basj) {
		this.sph_Basj = sph_Basj;
	}
	public Double getSph_Gczj() {
		return sph_Gczj;
	}
	public void setSph_Gczj(Double sph_Gczj) {
		this.sph_Gczj = sph_Gczj;
	}
	public String getSph_Fzh() {
		return sph_Fzh;
	}
	public void setSph_Fzh(String sph_Fzh) {
		this.sph_Fzh = sph_Fzh;
	}
	
	
	
}
