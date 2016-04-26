package com.esquare.eam.entity.actives;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 建设用地规划管理类实体对应表
 *
 * <p>用来存放建设用地规划类 的数据信息 同时该表继承项目信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  霍燕朝
 * @version 1.0.2014-9-3
 */
@Entity
@Table(name="EAM_SpYdxz")
@PrimaryKeyJoinColumn(name="ydxz_Id") //建设用地规划管理id
public class EAM_SpYdxz extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;

	private String ydxz_Yddw;  //用地单位
	private String ydxz_Lxpzdw;  //立项批准单位
	private String ydxz_Bzdw;    //被征单位
	private String ydxz_Ghpzdw;    //规划批准单位
	private String ydxz_Lxpzwh;  //立项批准文号
	private String ydxz_Ghxkzh;  //规划许可证号
	private String ydxz_Ydxzghxkzh;//用地选址规划许可证号
	private String ydxz_Ydxzxkzh;//用地选址许可证号
	private String ydxz_Dxth;  //地形图号
	private String ydxz_Ydfl;  //用地分类
	private String ydxz_Zbfl;  //征拨分类
	private String ydxz_Ytdfl;  //原土地分类
	private Date ydxz_Pzsj;    //批准时间
	private Double ydxz_Ydmj;    //用地面积
	
	public String getYdxz_Yddw() {
		return ydxz_Yddw;
	}
	public void setYdxz_Yddw(String ydxz_Yddw) {
		this.ydxz_Yddw = ydxz_Yddw;
	}
	public String getYdxz_Lxpzdw() {
		return ydxz_Lxpzdw;
	}
	public void setYdxz_Lxpzdw(String ydxz_Lxpzdw) {
		this.ydxz_Lxpzdw = ydxz_Lxpzdw;
	}
	public String getYdxz_Bzdw() {
		return ydxz_Bzdw;
	}
	public void setYdxz_Bzdw(String ydxz_Bzdw) {
		this.ydxz_Bzdw = ydxz_Bzdw;
	}
	public String getYdxz_Ghpzdw() {
		return ydxz_Ghpzdw;
	}
	public void setYdxz_Ghpzdw(String ydxz_Ghpzdw) {
		this.ydxz_Ghpzdw = ydxz_Ghpzdw;
	}
	public String getYdxz_Lxpzwh() {
		return ydxz_Lxpzwh;
	}
	public void setYdxz_Lxpzwh(String ydxz_Lxpzwh) {
		this.ydxz_Lxpzwh = ydxz_Lxpzwh;
	}
	public String getYdxz_Ghxkzh() {
		return ydxz_Ghxkzh;
	}
	public void setYdxz_Ghxkzh(String ydxz_Ghxkzh) {
		this.ydxz_Ghxkzh = ydxz_Ghxkzh;
	}
	public String getYdxz_Ydxzghxkzh() {
		return ydxz_Ydxzghxkzh;
	}
	public void setYdxz_Ydxzghxkzh(String ydxz_Ydxzghxkzh) {
		this.ydxz_Ydxzghxkzh = ydxz_Ydxzghxkzh;
	}
	public String getYdxz_Ydxzxkzh() {
		return ydxz_Ydxzxkzh;
	}
	public void setYdxz_Ydxzxkzh(String ydxz_Ydxzxkzh) {
		this.ydxz_Ydxzxkzh = ydxz_Ydxzxkzh;
	}
	public String getYdxz_Dxth() {
		return ydxz_Dxth;
	}
	public void setYdxz_Dxth(String ydxz_Dxth) {
		this.ydxz_Dxth = ydxz_Dxth;
	}
	public String getYdxz_Ydfl() {
		return ydxz_Ydfl;
	}
	public void setYdxz_Ydfl(String ydxz_Ydfl) {
		this.ydxz_Ydfl = ydxz_Ydfl;
	}
	public String getYdxz_Zbfl() {
		return ydxz_Zbfl;
	}
	public void setYdxz_Zbfl(String ydxz_Zbfl) {
		this.ydxz_Zbfl = ydxz_Zbfl;
	}
	public String getYdxz_Ytdfl() {
		return ydxz_Ytdfl;
	}
	public void setYdxz_Ytdfl(String ydxz_Ytdfl) {
		this.ydxz_Ytdfl = ydxz_Ytdfl;
	}
	public Date getYdxz_Pzsj() {
		return ydxz_Pzsj;
	}
	public void setYdxz_Pzsj(Date ydxz_Pzsj) {
		this.ydxz_Pzsj = ydxz_Pzsj;
	}
	public Double getYdxz_Ydmj() {
		return ydxz_Ydmj;
	}
	public void setYdxz_Ydmj(Double ydxz_Ydmj) {
		this.ydxz_Ydmj = ydxz_Ydmj;
	}
	
}
