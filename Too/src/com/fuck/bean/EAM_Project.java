package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * 项目信息实体对应表
 * 
 * <p>用来记录每个工程或者单项工程的信息
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.1.2014.1.14
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="EAM_Project")
public class EAM_Project implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long   p_Id; // 主键
	private Long   p_OldId; // 原系统主键
	private String p_Xmmc;    //项目名称
	private String p_Xmxh;  //项目序号
	private String p_Xmdd;    //项目地点
	private String p_Jsdw;  //建设单位
	private String p_Bz;    //备注
	
	private Double p_Lat;	  //经度
	private Double p_Lng;	  //纬度
	private String p_Fz;      //附注
	private String p_Lrr;     //录入人名称
	private Long p_Uid;       // 登记人id
	private Date p_Jgrq;      //进馆日期
	private Timestamp   p_Lrrq; //录入时间
	
	@OneToMany(mappedBy = "sp_Project", fetch = FetchType.LAZY, targetEntity = EAM_SingleProject.class, cascade = CascadeType.ALL)
	@OrderBy("sp_Id")
	private List<EAM_SingleProject> p_SingleProject;// 子项目分类
	
	private Integer p_SysFrom;//项目系统来源标识 0档案管理系统1在线报建系统2业务管理系统

	public Long getP_Id() {
		return p_Id;
	}
	
	public void setP_Id(Long p_Id) {
		this.p_Id = p_Id;
	}

	public Long getP_OldId() {
		return p_OldId;
	}

	public void setP_OldId(Long p_OldId) {
		this.p_OldId = p_OldId;
	}

	public String getP_Xmmc() {
		return p_Xmmc;
	}

	public void setP_Xmmc(String p_Xmmc) {
		this.p_Xmmc = p_Xmmc;
	}

	public String getP_Xmxh() {
		return p_Xmxh;
	}

	public void setP_Xmxh(String p_Xmxh) {
		this.p_Xmxh = p_Xmxh;
	}

	public String getP_Xmdd() {
		return p_Xmdd;
	}

	public void setP_Xmdd(String p_Xmdd) {
		this.p_Xmdd = p_Xmdd;
	}

	public Double getP_Lat() {
		return p_Lat;
	}

	public void setP_Lat(Double p_Lat) {
		this.p_Lat = p_Lat;
	}

	public Double getP_Lng() {
		return p_Lng;
	}

	public void setP_Lng(Double p_Lng) {
		this.p_Lng = p_Lng;
	}

	public String getP_Fz() {
		return p_Fz;
	}

	public void setP_Fz(String p_Fz) {
		this.p_Fz = p_Fz;
	}

	public String getP_Lrr() {
		return p_Lrr;
	}

	public void setP_Lrr(String p_Lrr) {
		this.p_Lrr = p_Lrr;
	}

	public Long getP_Uid() {
		return p_Uid;
	}

	public void setP_Uid(Long p_Uid) {
		this.p_Uid = p_Uid;
	}

	public Timestamp getP_Lrrq() {
		return p_Lrrq;
	}

	public void setP_Lrrq(Timestamp p_Lrrq) {
		this.p_Lrrq = p_Lrrq;
	}

	public List<EAM_SingleProject> getP_SingleProject() {
		return p_SingleProject;
	}

	public void setP_SingleProject(List<EAM_SingleProject> p_SingleProject) {
		this.p_SingleProject = p_SingleProject;
	}

	public Integer getP_SysFrom() {
		return p_SysFrom;
	}

	public void setP_SysFrom(Integer p_SysFrom) {
		this.p_SysFrom = p_SysFrom;
	}

	public String getP_Jsdw() {
		return p_Jsdw;
	}

	public void setP_Jsdw(String p_Jsdw) {
		this.p_Jsdw = p_Jsdw;
	}

	public Date getP_Jgrq() {
		return p_Jgrq;
	}

	public void setP_Jgrq(Date p_Jgrq) {
		this.p_Jgrq = p_Jgrq;
	}

	public String getP_Bz() {
		return p_Bz;
	}

	public void setP_Bz(String p_Bz) {
		this.p_Bz = p_Bz;
	}

	
	
}
