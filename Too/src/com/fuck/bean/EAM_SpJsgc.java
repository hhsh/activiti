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
// * 建设工程规划管理类实体对应表
// *
// * <p>用来存放建设工程规划类 的数据信息 同时该表继承项目信息表
// *
// * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
// *
// * @author  张博
// * @version 1.0.2014-9-3
// */
//@Entity
//@Table(name="EAM_SpJsgc")
//@PrimaryKeyJoinColumn(name="jsgc_Id") //建设工程规划管理类id
//public class EAM_SpJsgc extends EAM_SingleProject{
//	
//	private static final long serialVersionUID = 1L;
//
//	private String jsgc_Jsdw;  //建设单位
//	private String jsgc_Lxpzdw;  //立项批准单位
//	private String jsgc_Sjdw;    //设计单位
//	private String jsgc_Sgdw;    //施工单位
//	private String jsgc_Lxpzwh;  //立项批准文号
//	private String jsgc_Ghxkzh;  //规划许可证号
//	private String jsgc_Ydghxkzh;//用地规划许可证号
//	private String jsgc_Gytdsyzh;//国有土地使用证号
//	private String jsgc_Dxth;  //地形图号
//	private Double jsgc_Jzmj;   //建筑面积
//	private Integer jsgc_Zs;    //幢数
//	private Double jsgc_Cd;     //长度
//	private String jsgc_Gg;     //规格
//	private Double jsgc_Gd;     //高度
//	private Integer jsgc_Cs;  //地上层数
//	private Double jsgc_Kd;     //宽度
//	private String jsgc_Jb;    //级别
//	private Double jsgc_Kj;     //跨径
//	private String jsgc_Jk;    //净空
//	private String jsgc_Hz;    //荷载
//	private Date jsgc_Sqsj;    //申请时间
//	private Date jsgc_Pzsj;    //批准时间
//	private Double jsgc_Gczj;     //工程造价
//	private String jsgc_Jglx;  //结构类型
//	
//	public String getJsgc_Jsdw() {
//		return jsgc_Jsdw;
//	}
//	public void setJsgc_Jsdw(String jsgc_Jsdw) {
//		this.jsgc_Jsdw = jsgc_Jsdw;
//	}
//	public String getJsgc_Lxpzdw() {
//		return jsgc_Lxpzdw;
//	}
//	public void setJsgc_Lxpzdw(String jsgc_Lxpzdw) {
//		this.jsgc_Lxpzdw = jsgc_Lxpzdw;
//	}
//	public String getJsgc_Sjdw() {
//		return jsgc_Sjdw;
//	}
//	public void setJsgc_Sjdw(String jsgc_Sjdw) {
//		this.jsgc_Sjdw = jsgc_Sjdw;
//	}
//	public String getJsgc_Sgdw() {
//		return jsgc_Sgdw;
//	}
//	public void setJsgc_Sgdw(String jsgc_Sgdw) {
//		this.jsgc_Sgdw = jsgc_Sgdw;
//	}
//	public String getJsgc_Lxpzwh() {
//		return jsgc_Lxpzwh;
//	}
//	public void setJsgc_Lxpzwh(String jsgc_Lxpzwh) {
//		this.jsgc_Lxpzwh = jsgc_Lxpzwh;
//	}
//	public String getJsgc_Ghxkzh() {
//		return jsgc_Ghxkzh;
//	}
//	public void setJsgc_Ghxkzh(String jsgc_Ghxkzh) {
//		this.jsgc_Ghxkzh = jsgc_Ghxkzh;
//	}
//	public String getJsgc_Ydghxkzh() {
//		return jsgc_Ydghxkzh;
//	}
//	public void setJsgc_Ydghxkzh(String jsgc_Ydghxkzh) {
//		this.jsgc_Ydghxkzh = jsgc_Ydghxkzh;
//	}
//	public String getJsgc_Gytdsyzh() {
//		return jsgc_Gytdsyzh;
//	}
//	public void setJsgc_Gytdsyzh(String jsgc_Gytdsyzh) {
//		this.jsgc_Gytdsyzh = jsgc_Gytdsyzh;
//	}
//	public String getJsgc_Dxth() {
//		return jsgc_Dxth;
//	}
//	public void setJsgc_Dxth(String jsgc_Dxth) {
//		this.jsgc_Dxth = jsgc_Dxth;
//	}
//	public Double getJsgc_Jzmj() {
//		return jsgc_Jzmj;
//	}
//	public void setJsgc_Jzmj(Double jsgc_Jzmj) {
//		this.jsgc_Jzmj = jsgc_Jzmj;
//	}
//	public Integer getJsgc_Zs() {
//		return jsgc_Zs;
//	}
//	public void setJsgc_Zs(Integer jsgc_Zs) {
//		this.jsgc_Zs = jsgc_Zs;
//	}
//	public Double getJsgc_Cd() {
//		return jsgc_Cd;
//	}
//	public void setJsgc_Cd(Double jsgc_Cd) {
//		this.jsgc_Cd = jsgc_Cd;
//	}
//	public String getJsgc_Gg() {
//		return jsgc_Gg;
//	}
//	public void setJsgc_Gg(String jsgc_Gg) {
//		this.jsgc_Gg = jsgc_Gg;
//	}
//	public Double getJsgc_Gd() {
//		return jsgc_Gd;
//	}
//	public void setJsgc_Gd(Double jsgc_Gd) {
//		this.jsgc_Gd = jsgc_Gd;
//	}
//	public Integer getJsgc_Cs() {
//		return jsgc_Cs;
//	}
//	public void setJsgc_Cs(Integer jsgc_Cs) {
//		this.jsgc_Cs = jsgc_Cs;
//	}
//	public Double getJsgc_Kd() {
//		return jsgc_Kd;
//	}
//	public void setJsgc_Kd(Double jsgc_Kd) {
//		this.jsgc_Kd = jsgc_Kd;
//	}
//	public String getJsgc_Jb() {
//		return jsgc_Jb;
//	}
//	public void setJsgc_Jb(String jsgc_Jb) {
//		this.jsgc_Jb = jsgc_Jb;
//	}
//	public Double getJsgc_Kj() {
//		return jsgc_Kj;
//	}
//	public void setJsgc_Kj(Double jsgc_Kj) {
//		this.jsgc_Kj = jsgc_Kj;
//	}
//	public String getJsgc_Jk() {
//		return jsgc_Jk;
//	}
//	public void setJsgc_Jk(String jsgc_Jk) {
//		this.jsgc_Jk = jsgc_Jk;
//	}
//	public String getJsgc_Hz() {
//		return jsgc_Hz;
//	}
//	public void setJsgc_Hz(String jsgc_Hz) {
//		this.jsgc_Hz = jsgc_Hz;
//	}
//	public Date getJsgc_Sqsj() {
//		return jsgc_Sqsj;
//	}
//	public void setJsgc_Sqsj(Date jsgc_Sqsj) {
//		this.jsgc_Sqsj = jsgc_Sqsj;
//	}
//	public Date getJsgc_Pzsj() {
//		return jsgc_Pzsj;
//	}
//	public void setJsgc_Pzsj(Date jsgc_Pzsj) {
//		this.jsgc_Pzsj = jsgc_Pzsj;
//	}
//	public Double getJsgc_Gczj() {
//		return jsgc_Gczj;
//	}
//	public void setJsgc_Gczj(Double jsgc_Gczj) {
//		this.jsgc_Gczj = jsgc_Gczj;
//	}
//	public String getJsgc_Jglx() {
//		return jsgc_Jglx;
//	}
//	public void setJsgc_Jglx(String jsgc_Jglx) {
//		this.jsgc_Jglx = jsgc_Jglx;
//	}
//	
//}
