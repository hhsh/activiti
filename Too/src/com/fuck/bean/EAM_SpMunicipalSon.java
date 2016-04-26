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
 * 市政管理子表
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
@Table(name = "EAM_SpMunicipalSon")
public class EAM_SpMunicipalSon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long spm_Id;
	private String spm_Lx;//类型
	private Integer spm_Sqfl;//申请分类（1、新建  2、重核  3、补发）
	
	private Date spm_Hxrq;//红线日期
	private Date spm_Sjzfarq;//审建筑方案日期
	private Date spm_Ghxzrq;//规划许可日期
	private Date spm_Ghysrq;//规划验收日期
	private Double spm_Cd;//长度
	private String spm_Gg;//规格
	private Double spm_Gd;//高度
	private Double spm_Cs;//层数
	private Double spm_Kd;//宽度
	
	private String spm_Jb;//级别
	private Double spm_Kud;//跨度
	private Double spm_Jk;//净空
	private Double spm_Hz;//荷载
	private String spm_Jh;//卷号
	private String spm_Fz;//附注
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spm_SpConstructionMunicipal")
	private EAM_SpConstructionMunicipal spm_SpConstructionMunicipal;// 跟管线工程多对一关系

	public Long getSpm_Id() {
		return spm_Id;
	}

	public void setSpm_Id(Long spm_Id) {
		this.spm_Id = spm_Id;
	}

	public String getSpm_Lx() {
		return spm_Lx;
	}

	public void setSpm_Lx(String spm_Lx) {
		this.spm_Lx = spm_Lx;
	}

	public Integer getSpm_Sqfl() {
		return spm_Sqfl;
	}

	public void setSpm_Sqfl(Integer spm_Sqfl) {
		this.spm_Sqfl = spm_Sqfl;
	}

	public Date getSpm_Hxrq() {
		return spm_Hxrq;
	}

	public void setSpm_Hxrq(Date spm_Hxrq) {
		this.spm_Hxrq = spm_Hxrq;
	}

	public Date getSpm_Sjzfarq() {
		return spm_Sjzfarq;
	}

	public void setSpm_Sjzfarq(Date spm_Sjzfarq) {
		this.spm_Sjzfarq = spm_Sjzfarq;
	}

	public Date getSpm_Ghxzrq() {
		return spm_Ghxzrq;
	}

	public void setSpm_Ghxzrq(Date spm_Ghxzrq) {
		this.spm_Ghxzrq = spm_Ghxzrq;
	}

	public Date getSpm_Ghysrq() {
		return spm_Ghysrq;
	}

	public void setSpm_Ghysrq(Date spm_Ghysrq) {
		this.spm_Ghysrq = spm_Ghysrq;
	}

	public Double getSpm_Cd() {
		return spm_Cd;
	}

	public void setSpm_Cd(Double spm_Cd) {
		this.spm_Cd = spm_Cd;
	}

	public String getSpm_Gg() {
		return spm_Gg;
	}

	public void setSpm_Gg(String spm_Gg) {
		this.spm_Gg = spm_Gg;
	}

	public Double getSpm_Gd() {
		return spm_Gd;
	}

	public void setSpm_Gd(Double spm_Gd) {
		this.spm_Gd = spm_Gd;
	}

	public Double getSpm_Cs() {
		return spm_Cs;
	}

	public void setSpm_Cs(Double spm_Cs) {
		this.spm_Cs = spm_Cs;
	}

	public Double getSpm_Kd() {
		return spm_Kd;
	}

	public void setSpm_Kd(Double spm_Kd) {
		this.spm_Kd = spm_Kd;
	}

	public String getSpm_Jb() {
		return spm_Jb;
	}

	public void setSpm_Jb(String spm_Jb) {
		this.spm_Jb = spm_Jb;
	}

	public Double getSpm_Kud() {
		return spm_Kud;
	}

	public void setSpm_Kud(Double spm_Kud) {
		this.spm_Kud = spm_Kud;
	}

	public Double getSpm_Jk() {
		return spm_Jk;
	}

	public void setSpm_Jk(Double spm_Jk) {
		this.spm_Jk = spm_Jk;
	}

	public Double getSpm_Hz() {
		return spm_Hz;
	}

	public void setSpm_Hz(Double spm_Hz) {
		this.spm_Hz = spm_Hz;
	}

	public String getSpm_Jh() {
		return spm_Jh;
	}

	public void setSpm_Jh(String spm_Jh) {
		this.spm_Jh = spm_Jh;
	}

	public String getSpm_Fz() {
		return spm_Fz;
	}

	public void setSpm_Fz(String spm_Fz) {
		this.spm_Fz = spm_Fz;
	}

	public EAM_SpConstructionMunicipal getSpm_SpConstructionMunicipal() {
		return spm_SpConstructionMunicipal;
	}

	public void setSpm_SpConstructionMunicipal(
			EAM_SpConstructionMunicipal spm_SpConstructionMunicipal) {
		this.spm_SpConstructionMunicipal = spm_SpConstructionMunicipal;
	}

	
}
