package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 规划公示类实体对应表 
 *
 * <p>用来存放规划公示类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpPublicity")
@PrimaryKeyJoinColumn(name="sppu_Id") //规划公示id
public class EAM_SpPublicity extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String sppu_Jsdw;  //建设单位
	private String sppu_Lxpzdw;  //立项批准单位
	private String sppu_Gsfzdw;  //公示负责单位（部门）
	
	private String sppu_Lxpzwh;  //立项批准文号
	private String sppu_Ydghxkzh;  //用地规划许可证号
	private String sppu_Gytdzh;  //国有土地证号
	private String sppu_Dxth;  //地形图号
	private Date sppu_Gssj;  //公示时间
	private String sppu_Xc;  //现场
	private String sppu_Bz;  //报纸
	private String sppu_Wz;  //网站
	private String sppu_Pqgs;  //批前公示
	private String sppu_Phgs;  //批后公示
	private String sppu_Ghcg;  //规划成果
	private String sppu_Sjgh;  //“三旧”规划
	private String sppu_Zpmtgs;  //总平面图公示
	
	public String getSppu_Jsdw() {
		return sppu_Jsdw;
	}
	public void setSppu_Jsdw(String sppu_Jsdw) {
		this.sppu_Jsdw = sppu_Jsdw;
	}
	public String getSppu_Lxpzdw() {
		return sppu_Lxpzdw;
	}
	public void setSppu_Lxpzdw(String sppu_Lxpzdw) {
		this.sppu_Lxpzdw = sppu_Lxpzdw;
	}
	public String getSppu_Gsfzdw() {
		return sppu_Gsfzdw;
	}
	public void setSppu_Gsfzdw(String sppu_Gsfzdw) {
		this.sppu_Gsfzdw = sppu_Gsfzdw;
	}
	public String getSppu_Lxpzwh() {
		return sppu_Lxpzwh;
	}
	public void setSppu_Lxpzwh(String sppu_Lxpzwh) {
		this.sppu_Lxpzwh = sppu_Lxpzwh;
	}
	public String getSppu_Ydghxkzh() {
		return sppu_Ydghxkzh;
	}
	public void setSppu_Ydghxkzh(String sppu_Ydghxkzh) {
		this.sppu_Ydghxkzh = sppu_Ydghxkzh;
	}
	public String getSppu_Gytdzh() {
		return sppu_Gytdzh;
	}
	public void setSppu_Gytdzh(String sppu_Gytdzh) {
		this.sppu_Gytdzh = sppu_Gytdzh;
	}
	public String getSppu_Dxth() {
		return sppu_Dxth;
	}
	public void setSppu_Dxth(String sppu_Dxth) {
		this.sppu_Dxth = sppu_Dxth;
	}
	public Date getSppu_Gssj() {
		return sppu_Gssj;
	}
	public void setSppu_Gssj(Date sppu_Gssj) {
		this.sppu_Gssj = sppu_Gssj;
	}
	public String getSppu_Xc() {
		return sppu_Xc;
	}
	public void setSppu_Xc(String sppu_Xc) {
		this.sppu_Xc = sppu_Xc;
	}
	public String getSppu_Bz() {
		return sppu_Bz;
	}
	public void setSppu_Bz(String sppu_Bz) {
		this.sppu_Bz = sppu_Bz;
	}
	public String getSppu_Wz() {
		return sppu_Wz;
	}
	public void setSppu_Wz(String sppu_Wz) {
		this.sppu_Wz = sppu_Wz;
	}
	public String getSppu_Pqgs() {
		return sppu_Pqgs;
	}
	public void setSppu_Pqgs(String sppu_Pqgs) {
		this.sppu_Pqgs = sppu_Pqgs;
	}
	public String getSppu_Phgs() {
		return sppu_Phgs;
	}
	public void setSppu_Phgs(String sppu_Phgs) {
		this.sppu_Phgs = sppu_Phgs;
	}
	public String getSppu_Ghcg() {
		return sppu_Ghcg;
	}
	public void setSppu_Ghcg(String sppu_Ghcg) {
		this.sppu_Ghcg = sppu_Ghcg;
	}
	public String getSppu_Sjgh() {
		return sppu_Sjgh;
	}
	public void setSppu_Sjgh(String sppu_Sjgh) {
		this.sppu_Sjgh = sppu_Sjgh;
	}
	public String getSppu_Zpmtgs() {
		return sppu_Zpmtgs;
	}
	public void setSppu_Zpmtgs(String sppu_Zpmtgs) {
		this.sppu_Zpmtgs = sppu_Zpmtgs;
	}

}
