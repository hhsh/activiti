package com.esquare.eam.entity.actives;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 交通工程管理类实体对应表 
 *
 * <p>用来存放交通工程类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpTraffic")
@PrimaryKeyJoinColumn(name="spt_Id") //交通工程类id
public class EAM_SpTraffic extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;

	private String spt_Jsdw;  //建设单位
	private String spt_Lxpzdw;  //立项批准单位
	private String spt_Sjdw;    //设计单位
	private String spt_Kcdw;    //勘察单位
	private String spt_Sgdw;    //施工单位
	private String spt_Jldw;    //监理单位
	
	private String spt_Lxpzwh;  //立项批准文号
	private String spt_Gcghxkzh;//工程规划许可证号
	private String spt_Ydghxkzh;  //用地规划许可证号
	private String spt_Gytdsyzh;//国有土地使用证号
	private String spt_Sgxkzh;//施工许可证号
	private String spt_Ghyshgzh;//规划验收合格证号
	
	@OneToMany(mappedBy = "spts_SpTraffic", fetch = FetchType.LAZY, targetEntity = EAM_SpTrafficSon.class, cascade = CascadeType.ALL)
	@OrderBy("spts_Id")
	private List<EAM_SpTrafficSon> spt_SpJtgcSon;// 跟案卷一对多关系

	public String getSpt_Jsdw() {
		return spt_Jsdw;
	}

	public void setSpt_Jsdw(String spt_Jsdw) {
		this.spt_Jsdw = spt_Jsdw;
	}

	public String getSpt_Lxpzdw() {
		return spt_Lxpzdw;
	}

	public void setSpt_Lxpzdw(String spt_Lxpzdw) {
		this.spt_Lxpzdw = spt_Lxpzdw;
	}

	public String getSpt_Sjdw() {
		return spt_Sjdw;
	}

	public void setSpt_Sjdw(String spt_Sjdw) {
		this.spt_Sjdw = spt_Sjdw;
	}

	public String getSpt_Kcdw() {
		return spt_Kcdw;
	}

	public void setSpt_Kcdw(String spt_Kcdw) {
		this.spt_Kcdw = spt_Kcdw;
	}

	public String getSpt_Sgdw() {
		return spt_Sgdw;
	}

	public void setSpt_Sgdw(String spt_Sgdw) {
		this.spt_Sgdw = spt_Sgdw;
	}

	public String getSpt_Jldw() {
		return spt_Jldw;
	}

	public void setSpt_Jldw(String spt_Jldw) {
		this.spt_Jldw = spt_Jldw;
	}

	public String getSpt_Lxpzwh() {
		return spt_Lxpzwh;
	}

	public void setSpt_Lxpzwh(String spt_Lxpzwh) {
		this.spt_Lxpzwh = spt_Lxpzwh;
	}

	public String getSpt_Gcghxkzh() {
		return spt_Gcghxkzh;
	}

	public void setSpt_Gcghxkzh(String spt_Gcghxkzh) {
		this.spt_Gcghxkzh = spt_Gcghxkzh;
	}

	public String getSpt_Ydghxkzh() {
		return spt_Ydghxkzh;
	}

	public void setSpt_Ydghxkzh(String spt_Ydghxkzh) {
		this.spt_Ydghxkzh = spt_Ydghxkzh;
	}

	public String getSpt_Gytdsyzh() {
		return spt_Gytdsyzh;
	}

	public void setSpt_Gytdsyzh(String spt_Gytdsyzh) {
		this.spt_Gytdsyzh = spt_Gytdsyzh;
	}

	public String getSpt_Sgxkzh() {
		return spt_Sgxkzh;
	}

	public void setSpt_Sgxkzh(String spt_Sgxkzh) {
		this.spt_Sgxkzh = spt_Sgxkzh;
	}

	public String getSpt_Ghyshgzh() {
		return spt_Ghyshgzh;
	}

	public void setSpt_Ghyshgzh(String spt_Ghyshgzh) {
		this.spt_Ghyshgzh = spt_Ghyshgzh;
	}

	public List<EAM_SpTrafficSon> getSpt_SpJtgcSon() {
		return spt_SpJtgcSon;
	}

	public void setSpt_SpJtgcSon(List<EAM_SpTrafficSon> spt_SpJtgcSon) {
		this.spt_SpJtgcSon = spt_SpJtgcSon;
	}

	 
	
	
	
}
