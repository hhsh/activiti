//package com.esquare.eam.entity.actives;
//
//import java.sql.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.Table;
//
//
///**
// * 建设用地规划管理类实体对应表
// *
// * <p>用来存放建设用地规划类 的数据信息 同时该表继承项目信息表
// *
// * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
// *
// * @author  张博
// * @version 1.0.2014-9-3
// */
//@Entity
//@Table(name="EAM_SpJsyd")
//@PrimaryKeyJoinColumn(name="jsyd_Id") //建设用地规划管理id
//public class EAM_SpJsyd extends EAM_SingleProject{
//	
//	private static final long serialVersionUID = 1L;
//
//	private String jsyd_Yddw;  //用地单位
//	private String jsyd_Lxpzdw;  //立项批准单位
//	private String jsyd_Bzdw;    //被征单位
//	private String jsyd_Ghpzdw;    //规划批准单位
//	private String jsyd_Lxpzwh;  //立项批准文号
//	private String jsyd_Ghxkzh;  //规划许可证号
//	private String jsyd_Ydghxkzh;//用地规划许可证号
//	private String jsyd_Gytdsyzh;//国有土地使用证号
//	private String jsyd_Dxth;  //地形图号
//	private String jsyd_Ydfl;  //用地分类
//	private String jsyd_Zbfl;  //征拨分类
//	private String jsyd_Ytdfl;  //原土地分类
//	private Date jsyd_Pzsj;    //批准时间
//	private Double jsyd_Ydmj;    //用地面积
//	
//	public String getJsyd_Yddw() {
//		return jsyd_Yddw;
//	}
//	public void setJsyd_Yddw(String jsyd_Yddw) {
//		this.jsyd_Yddw = jsyd_Yddw;
//	}
//	public String getJsyd_Lxpzdw() {
//		return jsyd_Lxpzdw;
//	}
//	public void setJsyd_Lxpzdw(String jsyd_Lxpzdw) {
//		this.jsyd_Lxpzdw = jsyd_Lxpzdw;
//	}
//	public String getJsyd_Bzdw() {
//		return jsyd_Bzdw;
//	}
//	public void setJsyd_Bzdw(String jsyd_Bzdw) {
//		this.jsyd_Bzdw = jsyd_Bzdw;
//	}
//	public String getJsyd_Ghpzdw() {
//		return jsyd_Ghpzdw;
//	}
//	public void setJsyd_Ghpzdw(String jsyd_Ghpzdw) {
//		this.jsyd_Ghpzdw = jsyd_Ghpzdw;
//	}
//	public String getJsyd_Lxpzwh() {
//		return jsyd_Lxpzwh;
//	}
//	public void setJsyd_Lxpzwh(String jsyd_Lxpzwh) {
//		this.jsyd_Lxpzwh = jsyd_Lxpzwh;
//	}
//	public String getJsyd_Ghxkzh() {
//		return jsyd_Ghxkzh;
//	}
//	public void setJsyd_Ghxkzh(String jsyd_Ghxkzh) {
//		this.jsyd_Ghxkzh = jsyd_Ghxkzh;
//	}
//	public String getJsyd_Ydghxkzh() {
//		return jsyd_Ydghxkzh;
//	}
//	public void setJsyd_Ydghxkzh(String jsyd_Ydghxkzh) {
//		this.jsyd_Ydghxkzh = jsyd_Ydghxkzh;
//	}
//	public String getJsyd_Gytdsyzh() {
//		return jsyd_Gytdsyzh;
//	}
//	public void setJsyd_Gytdsyzh(String jsyd_Gytdsyzh) {
//		this.jsyd_Gytdsyzh = jsyd_Gytdsyzh;
//	}
//	public String getJsyd_Dxth() {
//		return jsyd_Dxth;
//	}
//	public void setJsyd_Dxth(String jsyd_Dxth) {
//		this.jsyd_Dxth = jsyd_Dxth;
//	}
//	public String getJsyd_Ydfl() {
//		return jsyd_Ydfl;
//	}
//	public void setJsyd_Ydfl(String jsyd_Ydfl) {
//		this.jsyd_Ydfl = jsyd_Ydfl;
//	}
//	public String getJsyd_Zbfl() {
//		return jsyd_Zbfl;
//	}
//	public void setJsyd_Zbfl(String jsyd_Zbfl) {
//		this.jsyd_Zbfl = jsyd_Zbfl;
//	}
//	public String getJsyd_Ytdfl() {
//		return jsyd_Ytdfl;
//	}
//	public void setJsyd_Ytdfl(String jsyd_Ytdfl) {
//		this.jsyd_Ytdfl = jsyd_Ytdfl;
//	}
//	public Date getJsyd_Pzsj() {
//		return jsyd_Pzsj;
//	}
//	public void setJsyd_Pzsj(Date jsyd_Pzsj) {
//		this.jsyd_Pzsj = jsyd_Pzsj;
//	}
//	public Double getJsyd_Ydmj() {
//		return jsyd_Ydmj;
//	}
//	public void setJsyd_Ydmj(Double jsyd_Ydmj) {
//		this.jsyd_Ydmj = jsyd_Ydmj;
//	}
//}
