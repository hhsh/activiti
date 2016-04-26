package com.esquare.eam.entity.actives;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 私房管理类实体对应表 (全)
 *
 * <p>用来存放私房规划类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpPrivateHouse")
@PrimaryKeyJoinColumn(name="spp_Id") //私房管理id
public class EAM_SpPrivateHouse extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String spp_Jsdw;  //建设单位
	private String spp_Xzzh;  //选址证号
	private String spp_Ydghxkzh;  //用地规划许可证号
	private String spp_Gcghxkz;  //工程规划许可证号
	private String spp_Gytdzh;  //国有土地证号
	private String spp_Yshgzh;  //规划验收合格证号
	private String spp_Ljzh;  //临建证号
	private Double spp_Ydmj;  //用地面积
	private Double spp_Jdmj;  //基底面积
	private Double spp_Jzmj;  //建筑面积
	private Integer spp_Dscs;  //地上层数(层)
	private Integer spp_Dxcs;  //地下层数(层)
	private Date spp_Hxrq;  //红线日期
	private Date spp_Ghxkzrq;  //规划许可日期
	private Date spp_Ghysrq;  //规划验收日期
	private Date spp_Fhrq;  //复文日期
	private String spp_Fz;  //附注
	public String getSpp_Jsdw() {
		return spp_Jsdw;
	}
	public void setSpp_Jsdw(String spp_Jsdw) {
		this.spp_Jsdw = spp_Jsdw;
	}
	public String getSpp_Xzzh() {
		return spp_Xzzh;
	}
	public void setSpp_Xzzh(String spp_Xzzh) {
		this.spp_Xzzh = spp_Xzzh;
	}
	public String getSpp_Ydghxkzh() {
		return spp_Ydghxkzh;
	}
	public void setSpp_Ydghxkzh(String spp_Ydghxkzh) {
		this.spp_Ydghxkzh = spp_Ydghxkzh;
	}
	public String getSpp_Gcghxkz() {
		return spp_Gcghxkz;
	}
	public void setSpp_Gcghxkz(String spp_Gcghxkz) {
		this.spp_Gcghxkz = spp_Gcghxkz;
	}
	public String getSpp_Gytdzh() {
		return spp_Gytdzh;
	}
	public void setSpp_Gytdzh(String spp_Gytdzh) {
		this.spp_Gytdzh = spp_Gytdzh;
	}
	public String getSpp_Yshgzh() {
		return spp_Yshgzh;
	}
	public void setSpp_Yshgzh(String spp_Yshgzh) {
		this.spp_Yshgzh = spp_Yshgzh;
	}
	public String getSpp_Ljzh() {
		return spp_Ljzh;
	}
	public void setSpp_Ljzh(String spp_Ljzh) {
		this.spp_Ljzh = spp_Ljzh;
	}
	public Double getSpp_Ydmj() {
		return spp_Ydmj;
	}
	public void setSpp_Ydmj(Double spp_Ydmj) {
		this.spp_Ydmj = spp_Ydmj;
	}
	public Double getSpp_Jdmj() {
		return spp_Jdmj;
	}
	public void setSpp_Jdmj(Double spp_Jdmj) {
		this.spp_Jdmj = spp_Jdmj;
	}
	public Double getSpp_Jzmj() {
		return spp_Jzmj;
	}
	public void setSpp_Jzmj(Double spp_Jzmj) {
		this.spp_Jzmj = spp_Jzmj;
	}
	public Integer getSpp_Dscs() {
		return spp_Dscs;
	}
	public void setSpp_Dscs(Integer spp_Dscs) {
		this.spp_Dscs = spp_Dscs;
	}
	public Integer getSpp_Dxcs() {
		return spp_Dxcs;
	}
	public void setSpp_Dxcs(Integer spp_Dxcs) {
		this.spp_Dxcs = spp_Dxcs;
	}
	public Date getSpp_Hxrq() {
		return spp_Hxrq;
	}
	public void setSpp_Hxrq(Date spp_Hxrq) {
		this.spp_Hxrq = spp_Hxrq;
	}
	public Date getSpp_Ghxkzrq() {
		return spp_Ghxkzrq;
	}
	public void setSpp_Ghxkzrq(Date spp_Ghxkzrq) {
		this.spp_Ghxkzrq = spp_Ghxkzrq;
	}
	public Date getSpp_Ghysrq() {
		return spp_Ghysrq;
	}
	public void setSpp_Ghysrq(Date spp_Ghysrq) {
		this.spp_Ghysrq = spp_Ghysrq;
	}
	public Date getSpp_Fhrq() {
		return spp_Fhrq;
	}
	public void setSpp_Fhrq(Date spp_Fhrq) {
		this.spp_Fhrq = spp_Fhrq;
	}
	public String getSpp_Fz() {
		return spp_Fz;
	}
	public void setSpp_Fz(String spp_Fz) {
		this.spp_Fz = spp_Fz;
	}

	
}
