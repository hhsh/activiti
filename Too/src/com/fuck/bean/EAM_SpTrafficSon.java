package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 交通工程类子表
 * 
 * <p>
 * 
 * 
 * <p>
 * Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name = "EAM_SpTrafficSon")
public class EAM_SpTrafficSon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long spts_Id;
	private String spts_Lx;//类型
	private String spts_Sgdw;//施工单位
	private String spts_Jglx;//结构类型
	
	private Double spts_Cd;//长度（m）
	private Double spts_Kd;//宽度（m）
	private Double spts_Gd;//高度（m）
	private Double spts_Kj;//跨径（m）
	
	private Double spts_Ks;//孔数
	private String spts_Jb;//级别
	private String spts_Hz;//荷载
	private String spts_Jk;//净空
	
	private Double spts_Ydmj;//用地面积
	private Double spts_Jzmj;//建筑面积
	private Date spts_Kgsj;//开工时间
	
	private Date spts_Ghyssj;//规划验收时间
	private Date spts_Jgsj;//竣工时间
	private Double spts_Gczj;//工程造价
	private Double spts_Gcjs;//工程结算
	private String spts_Fz;//附注
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spts_SpTraffic")
	private EAM_SpTraffic spts_SpTraffic;// 跟交通工程多对一关系

	public Long getSpts_Id() {
		return spts_Id;
	}

	public void setSpts_Id(Long spts_Id) {
		this.spts_Id = spts_Id;
	}

	public String getSpts_Lx() {
		return spts_Lx;
	}

	public void setSpts_Lx(String spts_Lx) {
		this.spts_Lx = spts_Lx;
	}

	public String getSpts_Sgdw() {
		return spts_Sgdw;
	}

	public void setSpts_Sgdw(String spts_Sgdw) {
		this.spts_Sgdw = spts_Sgdw;
	}

	public String getSpts_Jglx() {
		return spts_Jglx;
	}

	public void setSpts_Jglx(String spts_Jglx) {
		this.spts_Jglx = spts_Jglx;
	}

	public Double getSpts_Cd() {
		return spts_Cd;
	}

	public void setSpts_Cd(Double spts_Cd) {
		this.spts_Cd = spts_Cd;
	}

	public Double getSpts_Kd() {
		return spts_Kd;
	}

	public void setSpts_Kd(Double spts_Kd) {
		this.spts_Kd = spts_Kd;
	}

	public Double getSpts_Gd() {
		return spts_Gd;
	}

	public void setSpts_Gd(Double spts_Gd) {
		this.spts_Gd = spts_Gd;
	}

	public Double getSpts_Kj() {
		return spts_Kj;
	}

	public void setSpts_Kj(Double spts_Kj) {
		this.spts_Kj = spts_Kj;
	}

	public Double getSpts_Ks() {
		return spts_Ks;
	}

	public void setSpts_Ks(Double spts_Ks) {
		this.spts_Ks = spts_Ks;
	}

	public String getSpts_Jb() {
		return spts_Jb;
	}

	public void setSpts_Jb(String spts_Jb) {
		this.spts_Jb = spts_Jb;
	}

	public String getSpts_Hz() {
		return spts_Hz;
	}

	public void setSpts_Hz(String spts_Hz) {
		this.spts_Hz = spts_Hz;
	}

	public String getSpts_Jk() {
		return spts_Jk;
	}

	public void setSpts_Jk(String spts_Jk) {
		this.spts_Jk = spts_Jk;
	}

	public Double getSpts_Ydmj() {
		return spts_Ydmj;
	}

	public void setSpts_Ydmj(Double spts_Ydmj) {
		this.spts_Ydmj = spts_Ydmj;
	}

	public Double getSpts_Jzmj() {
		return spts_Jzmj;
	}

	public void setSpts_Jzmj(Double spts_Jzmj) {
		this.spts_Jzmj = spts_Jzmj;
	}

	public Date getSpts_Kgsj() {
		return spts_Kgsj;
	}

	public void setSpts_Kgsj(Date spts_Kgsj) {
		this.spts_Kgsj = spts_Kgsj;
	}

	public Date getSpts_Ghyssj() {
		return spts_Ghyssj;
	}

	public void setSpts_Ghyssj(Date spts_Ghyssj) {
		this.spts_Ghyssj = spts_Ghyssj;
	}

	public Date getSpts_Jgsj() {
		return spts_Jgsj;
	}

	public void setSpts_Jgsj(Date spts_Jgsj) {
		this.spts_Jgsj = spts_Jgsj;
	}

	public Double getSpts_Gczj() {
		return spts_Gczj;
	}

	public void setSpts_Gczj(Double spts_Gczj) {
		this.spts_Gczj = spts_Gczj;
	}

	public Double getSpts_Gcjs() {
		return spts_Gcjs;
	}

	public void setSpts_Gcjs(Double spts_Gcjs) {
		this.spts_Gcjs = spts_Gcjs;
	}

	public String getSpts_Fz() {
		return spts_Fz;
	}

	public void setSpts_Fz(String spts_Fz) {
		this.spts_Fz = spts_Fz;
	}

	public EAM_SpTraffic getSpts_SpTraffic() {
		return spts_SpTraffic;
	}

	public void setSpts_SpTraffic(EAM_SpTraffic spts_SpTraffic) {
		this.spts_SpTraffic = spts_SpTraffic;
	}

	
}
