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
 * 建设工程规划管理类实体对应表 (建设工程、市政管理（D.3.7公用表）)
 *
 * <p>用来存放建设工程规划类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpConstructionMunicipal")
@PrimaryKeyJoinColumn(name="spcm_Id") //建设工程规划管理类id
public class EAM_SpConstructionMunicipal extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;

	private String spcm_Jsdw;  //建设单位
	private String spcm_Lxpzdw;  //立项批准单位
	private String spcm_Sjdw;    //设计单位
	private String spcm_Sgdw;    //施工单位
	
	private String spcm_Lxpzwh;  //立项批准文号
	private String spcm_Ydghxkzh;//用地规划许可证号
	private String spcm_Ghxkzh;  //工程规划许可证号
	private String spcm_Gytdsyzh;//国有土地使用证号
	private String spcm_Yshgzh;//验收合格证号
	private String spcm_Dxth;//地形图号
	
	@OneToMany(mappedBy = "spc_SpConstructionMunicipal", fetch = FetchType.LAZY, targetEntity = EAM_SpConstructionSon.class, cascade = CascadeType.ALL)
	@OrderBy("spc_Id")
	private List<EAM_SpConstructionSon> spcm_SpConstructionSon;// 跟建设工程一对多关系
	
	@OneToMany(mappedBy = "spm_SpConstructionMunicipal", fetch = FetchType.LAZY, targetEntity = EAM_SpMunicipalSon.class, cascade = CascadeType.ALL)
	@OrderBy("spm_Id")
	private List<EAM_SpMunicipalSon> spcm_SpMunicipalSon;// 跟市政管理类档案一对多关系

	public String getSpcm_Jsdw() {
		return spcm_Jsdw;
	}

	public void setSpcm_Jsdw(String spcm_Jsdw) {
		this.spcm_Jsdw = spcm_Jsdw;
	}

	public String getSpcm_Lxpzdw() {
		return spcm_Lxpzdw;
	}

	public void setSpcm_Lxpzdw(String spcm_Lxpzdw) {
		this.spcm_Lxpzdw = spcm_Lxpzdw;
	}

	public String getSpcm_Sjdw() {
		return spcm_Sjdw;
	}

	public void setSpcm_Sjdw(String spcm_Sjdw) {
		this.spcm_Sjdw = spcm_Sjdw;
	}

	public String getSpcm_Sgdw() {
		return spcm_Sgdw;
	}

	public void setSpcm_Sgdw(String spcm_Sgdw) {
		this.spcm_Sgdw = spcm_Sgdw;
	}

	public String getSpcm_Lxpzwh() {
		return spcm_Lxpzwh;
	}

	public void setSpcm_Lxpzwh(String spcm_Lxpzwh) {
		this.spcm_Lxpzwh = spcm_Lxpzwh;
	}

	public String getSpcm_Ydghxkzh() {
		return spcm_Ydghxkzh;
	}

	public void setSpcm_Ydghxkzh(String spcm_Ydghxkzh) {
		this.spcm_Ydghxkzh = spcm_Ydghxkzh;
	}

	public String getSpcm_Ghxkzh() {
		return spcm_Ghxkzh;
	}

	public void setSpcm_Ghxkzh(String spcm_Ghxkzh) {
		this.spcm_Ghxkzh = spcm_Ghxkzh;
	}

	public String getSpcm_Gytdsyzh() {
		return spcm_Gytdsyzh;
	}

	public void setSpcm_Gytdsyzh(String spcm_Gytdsyzh) {
		this.spcm_Gytdsyzh = spcm_Gytdsyzh;
	}

	public String getSpcm_Yshgzh() {
		return spcm_Yshgzh;
	}

	public void setSpcm_Yshgzh(String spcm_Yshgzh) {
		this.spcm_Yshgzh = spcm_Yshgzh;
	}

	public String getSpcm_Dxth() {
		return spcm_Dxth;
	}

	public void setSpcm_Dxth(String spcm_Dxth) {
		this.spcm_Dxth = spcm_Dxth;
	}

	public List<EAM_SpConstructionSon> getSpcm_SpConstructionSon() {
		return spcm_SpConstructionSon;
	}

	public void setSpcm_SpConstructionSon(
			List<EAM_SpConstructionSon> spcm_SpConstructionSon) {
		this.spcm_SpConstructionSon = spcm_SpConstructionSon;
	}

	public List<EAM_SpMunicipalSon> getSpcm_SpMunicipalSon() {
		return spcm_SpMunicipalSon;
	}

	public void setSpcm_SpMunicipalSon(List<EAM_SpMunicipalSon> spcm_SpMunicipalSon) {
		this.spcm_SpMunicipalSon = spcm_SpMunicipalSon;
	}

	
	
}
