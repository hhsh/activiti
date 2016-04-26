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
 * 市政、管线类型实体对应表
 * 
 * <p>用来存放单项工程管线类 的数据信息 同时该表继承项目信息表
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2014.1.14
 */

@Entity
@Table(name="EAM_SpMunicipalPipeline")
@PrimaryKeyJoinColumn(name="mp_Id") //市政、管线工程级表主键
public class EAM_SpMunicipalPipeline extends EAM_SingleProject {
	
	private static final long serialVersionUID = 1L;

	private String mp_Jsdw;  //建设单位
	private String mp_Lxpzdw;  //立项批准单位(加，少了)
	private String mp_Sgdw;  //施工单位
	private String mp_Sjdw;  //设计单位
	private String mp_Jldw;  //监理单位
	private String mp_Kcdw;  //勘察单位
	
	private String mp_Lxpzwh;  //立项批准文号
	private String mp_Ydghxkzh;  //用地规划许可证号
	private String mp_Ghxkzh;  //工程规划许可证号
	private String mp_Gytdzh;  //国有土地证号(加)
	private String mp_Sgxkzh;  //施工许可证号
	private String mp_Ghyshgzh;  //规划验收合格证号（加）
	
	@OneToMany(mappedBy = "spmp_SpMunicipalPipeline", fetch = FetchType.LAZY, targetEntity = EAM_SpMunicipalPipelineSon.class, cascade = CascadeType.ALL)
	@OrderBy("spmp_Id")
	private List<EAM_SpMunicipalPipelineSon> mp_SpMunicipalPipelineSon;// 跟市政、关系的子表一对多关系

	public String getMp_Jsdw() {
		return mp_Jsdw;
	}

	public void setMp_Jsdw(String mp_Jsdw) {
		this.mp_Jsdw = mp_Jsdw;
	}

	public String getMp_Lxpzdw() {
		return mp_Lxpzdw;
	}

	public void setMp_Lxpzdw(String mp_Lxpzdw) {
		this.mp_Lxpzdw = mp_Lxpzdw;
	}

	public String getMp_Sgdw() {
		return mp_Sgdw;
	}

	public void setMp_Sgdw(String mp_Sgdw) {
		this.mp_Sgdw = mp_Sgdw;
	}

	public String getMp_Sjdw() {
		return mp_Sjdw;
	}

	public void setMp_Sjdw(String mp_Sjdw) {
		this.mp_Sjdw = mp_Sjdw;
	}

	public String getMp_Jldw() {
		return mp_Jldw;
	}

	public void setMp_Jldw(String mp_Jldw) {
		this.mp_Jldw = mp_Jldw;
	}

	public String getMp_Kcdw() {
		return mp_Kcdw;
	}

	public void setMp_Kcdw(String mp_Kcdw) {
		this.mp_Kcdw = mp_Kcdw;
	}

	public String getMp_Lxpzwh() {
		return mp_Lxpzwh;
	}

	public void setMp_Lxpzwh(String mp_Lxpzwh) {
		this.mp_Lxpzwh = mp_Lxpzwh;
	}

	public String getMp_Ydghxkzh() {
		return mp_Ydghxkzh;
	}

	public void setMp_Ydghxkzh(String mp_Ydghxkzh) {
		this.mp_Ydghxkzh = mp_Ydghxkzh;
	}

	public String getMp_Ghxkzh() {
		return mp_Ghxkzh;
	}

	public void setMp_Ghxkzh(String mp_Ghxkzh) {
		this.mp_Ghxkzh = mp_Ghxkzh;
	}

	public String getMp_Gytdzh() {
		return mp_Gytdzh;
	}

	public void setMp_Gytdzh(String mp_Gytdzh) {
		this.mp_Gytdzh = mp_Gytdzh;
	}

	public String getMp_Sgxkzh() {
		return mp_Sgxkzh;
	}

	public void setMp_Sgxkzh(String mp_Sgxkzh) {
		this.mp_Sgxkzh = mp_Sgxkzh;
	}

	public String getMp_Ghyshgzh() {
		return mp_Ghyshgzh;
	}

	public void setMp_Ghyshgzh(String mp_Ghyshgzh) {
		this.mp_Ghyshgzh = mp_Ghyshgzh;
	}

	public List<EAM_SpMunicipalPipelineSon> getMp_SpMunicipalPipelineSon() {
		return mp_SpMunicipalPipelineSon;
	}

	public void setMp_SpMunicipalPipelineSon(
			List<EAM_SpMunicipalPipelineSon> mp_SpMunicipalPipelineSon) {
		this.mp_SpMunicipalPipelineSon = mp_SpMunicipalPipelineSon;
	}

	
}