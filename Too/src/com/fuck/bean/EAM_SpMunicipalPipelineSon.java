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
 * 竣工类中 市政工程和管线工程  的子表
 * 
 * <p>
 * 
 * <p>
 * Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name = "EAM_SpMunicipalPipelineSon")
public class EAM_SpMunicipalPipelineSon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long spmp_Id;
	private String spmp_Lx;    // 类型
	private String spmp_Jglx; // 结构类型
	private Double spmp_Cd;    // 长度
	private Double spmp_Kd;    //宽度
	private Double spmp_Gd;    //高度
	private Double spmp_Kj;    //跨径
	private String spmp_Ks;    //孔数
	private String spmp_Jb;    //级别
	private String spmp_Hz;    //荷载
	private String spmp_Jk;    //净空
	private String spmp_Gg;    //规格
	private String spmp_Cz;    //材质
	private String spmp_Ydmj;  //用地面积
	private Double spmp_Jzmj;  //建筑面积
	private Date   spmp_Kgsj;  //开工时间
	private Date   spmp_Jgsj;  //竣工时间
	private Date   spmp_Ghyssj;//规划验收时间 
	private Double spmp_Gczj;//工程造价
	private Double   spmp_Gcjs;//工程结算
	private String spm_Fz;//附注
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spmp_SpMunicipalPipeline")
	private EAM_SpMunicipalPipeline spmp_SpMunicipalPipeline;// 跟管线工程多对一关系

	public Long getSpmp_Id() {
		return spmp_Id;
	}

	public void setSpmp_Id(Long spmp_Id) {
		this.spmp_Id = spmp_Id;
	}

	public String getSpmp_Lx() {
		return spmp_Lx;
	}

	public void setSpmp_Lx(String spmp_Lx) {
		this.spmp_Lx = spmp_Lx;
	}
	

	public Double getSpmp_Gczj() {
		return spmp_Gczj;
	}

	public void setSpmp_Gczj(Double spmp_Gczj) {
		this.spmp_Gczj = spmp_Gczj;
	}

	public Double getSpmp_Gcjs() {
		return spmp_Gcjs;
	}

	public void setSpmp_Gcjs(Double spmp_Gcjs) {
		this.spmp_Gcjs = spmp_Gcjs;
	}

	public String getSpm_Fz() {
		return spm_Fz;
	}

	public void setSpm_Fz(String spm_Fz) {
		this.spm_Fz = spm_Fz;
	}

	public String getSpmp_Jglx() {
		return spmp_Jglx;
	}

	public void setSpmp_Jglx(String spmp_Jglx) {
		this.spmp_Jglx = spmp_Jglx;
	}

	public Double getSpmp_Cd() {
		return spmp_Cd;
	}

	public void setSpmp_Cd(Double spmp_Cd) {
		this.spmp_Cd = spmp_Cd;
	}

	public Double getSpmp_Kd() {
		return spmp_Kd;
	}

	public void setSpmp_Kd(Double spmp_Kd) {
		this.spmp_Kd = spmp_Kd;
	}

	public Double getSpmp_Gd() {
		return spmp_Gd;
	}

	public void setSpmp_Gd(Double spmp_Gd) {
		this.spmp_Gd = spmp_Gd;
	}

	public Double getSpmp_Kj() {
		return spmp_Kj;
	}

	public void setSpmp_Kj(Double spmp_Kj) {
		this.spmp_Kj = spmp_Kj;
	}

	public String getSpmp_Ks() {
		return spmp_Ks;
	}

	public void setSpmp_Ks(String spmp_Ks) {
		this.spmp_Ks = spmp_Ks;
	}

	public String getSpmp_Jb() {
		return spmp_Jb;
	}

	public void setSpmp_Jb(String spmp_Jb) {
		this.spmp_Jb = spmp_Jb;
	}

	public String getSpmp_Hz() {
		return spmp_Hz;
	}

	public void setSpmp_Hz(String spmp_Hz) {
		this.spmp_Hz = spmp_Hz;
	}

	public String getSpmp_Jk() {
		return spmp_Jk;
	}

	public void setSpmp_Jk(String spmp_Jk) {
		this.spmp_Jk = spmp_Jk;
	}

	public String getSpmp_Gg() {
		return spmp_Gg;
	}

	public void setSpmp_Gg(String spmp_Gg) {
		this.spmp_Gg = spmp_Gg;
	}

	public String getSpmp_Cz() {
		return spmp_Cz;
	}

	public void setSpmp_Cz(String spmp_Cz) {
		this.spmp_Cz = spmp_Cz;
	}

	public String getSpmp_Ydmj() {
		return spmp_Ydmj;
	}

	public void setSpmp_Ydmj(String spmp_Ydmj) {
		this.spmp_Ydmj = spmp_Ydmj;
	}

	public Double getSpmp_Jzmj() {
		return spmp_Jzmj;
	}

	public void setSpmp_Jzmj(Double spmp_Jzmj) {
		this.spmp_Jzmj = spmp_Jzmj;
	}

	public Date getSpmp_Kgsj() {
		return spmp_Kgsj;
	}

	public void setSpmp_Kgsj(Date spmp_Kgsj) {
		this.spmp_Kgsj = spmp_Kgsj;
	}

	public Date getSpmp_Jgsj() {
		return spmp_Jgsj;
	}

	public void setSpmp_Jgsj(Date spmp_Jgsj) {
		this.spmp_Jgsj = spmp_Jgsj;
	}

	public Date getSpmp_Ghyssj() {
		return spmp_Ghyssj;
	}

	public void setSpmp_Ghyssj(Date spmp_Ghyssj) {
		this.spmp_Ghyssj = spmp_Ghyssj;
	}

	 

	public EAM_SpMunicipalPipeline getSpmp_SpMunicipalPipeline() {
		return spmp_SpMunicipalPipeline;
	}

	public void setSpmp_SpMunicipalPipeline(
			EAM_SpMunicipalPipeline spmp_SpMunicipalPipeline) {
		this.spmp_SpMunicipalPipeline = spmp_SpMunicipalPipeline;
	}

	
}
