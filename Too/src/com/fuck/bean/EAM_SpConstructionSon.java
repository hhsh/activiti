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
 * 建设工程规划管理子表
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
@Table(name = "EAM_SpConstructionSon")
public class EAM_SpConstructionSon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long spc_Id;
	private String spc_Lx;//类型
	private Double spc_Jdmj;//基地面积
	private Double spc_Jzmj;//建筑面积（M2）
	private Double spc_Gd;//高度（m）
	private Integer spc_Dxcs;//地下层数
	private Integer spc_Dscs;//地上层数
	private String spc_Jglx;//结构类型
	private String spc_Xz;//性质
	private Integer spc_Zs;//幢数
	private Date spc_Hxrq;//红线日期
	private Date spc_Sfrq;//始发日期
	private Date spc_Csrq;//重审日期
	private Date spc_Ghxkrq;//规划许可日期
	private Date spc_Ghysrq;//规划验收日期
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spc_SpConstructionMunicipal")
	private EAM_SpConstructionMunicipal spc_SpConstructionMunicipal;// 跟管线工程多对一关系


	public Long getSpc_Id() {
		return spc_Id;
	}


	public void setSpc_Id(Long spc_Id) {
		this.spc_Id = spc_Id;
	}


	public String getSpc_Lx() {
		return spc_Lx;
	}


	public void setSpc_Lx(String spc_Lx) {
		this.spc_Lx = spc_Lx;
	}


	public Double getSpc_Jdmj() {
		return spc_Jdmj;
	}


	public void setSpc_Jdmj(Double spc_Jdmj) {
		this.spc_Jdmj = spc_Jdmj;
	}


	public Double getSpc_Jzmj() {
		return spc_Jzmj;
	}


	public void setSpc_Jzmj(Double spc_Jzmj) {
		this.spc_Jzmj = spc_Jzmj;
	}


	public Double getSpc_Gd() {
		return spc_Gd;
	}


	public void setSpc_Gd(Double spc_Gd) {
		this.spc_Gd = spc_Gd;
	}


	public Integer getSpc_Dxcs() {
		return spc_Dxcs;
	}


	public void setSpc_Dxcs(Integer spc_Dxcs) {
		this.spc_Dxcs = spc_Dxcs;
	}


	public Integer getSpc_Dscs() {
		return spc_Dscs;
	}


	public void setSpc_Dscs(Integer spc_Dscs) {
		this.spc_Dscs = spc_Dscs;
	}


	public String getSpc_Jglx() {
		return spc_Jglx;
	}


	public void setSpc_Jglx(String spc_Jglx) {
		this.spc_Jglx = spc_Jglx;
	}


	public String getSpc_Xz() {
		return spc_Xz;
	}


	public void setSpc_Xz(String spc_Xz) {
		this.spc_Xz = spc_Xz;
	}


	public Integer getSpc_Zs() {
		return spc_Zs;
	}


	public void setSpc_Zs(Integer spc_Zs) {
		this.spc_Zs = spc_Zs;
	}


	public Date getSpc_Hxrq() {
		return spc_Hxrq;
	}


	public void setSpc_Hxrq(Date spc_Hxrq) {
		this.spc_Hxrq = spc_Hxrq;
	}


	public Date getSpc_Sfrq() {
		return spc_Sfrq;
	}


	public void setSpc_Sfrq(Date spc_Sfrq) {
		this.spc_Sfrq = spc_Sfrq;
	}


	public Date getSpc_Csrq() {
		return spc_Csrq;
	}


	public void setSpc_Csrq(Date spc_Csrq) {
		this.spc_Csrq = spc_Csrq;
	}


	public Date getSpc_Ghxkrq() {
		return spc_Ghxkrq;
	}


	public void setSpc_Ghxkrq(Date spc_Ghxkrq) {
		this.spc_Ghxkrq = spc_Ghxkrq;
	}


	public Date getSpc_Ghysrq() {
		return spc_Ghysrq;
	}


	public void setSpc_Ghysrq(Date spc_Ghysrq) {
		this.spc_Ghysrq = spc_Ghysrq;
	}


	public EAM_SpConstructionMunicipal getSpc_SpConstructionMunicipal() {
		return spc_SpConstructionMunicipal;
	}


	public void setSpc_SpConstructionMunicipal(
			EAM_SpConstructionMunicipal spc_SpConstructionMunicipal) {
		this.spc_SpConstructionMunicipal = spc_SpConstructionMunicipal;
	}

	
}
