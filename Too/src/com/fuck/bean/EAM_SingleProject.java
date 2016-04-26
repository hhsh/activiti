package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * 工程信息实体对应表
 * 
 * <p>用来记录每个单项工程的信息
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 霍燕朝
 * @version 1.1.2014.1.14
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="EAM_SingleProject")
public class EAM_SingleProject implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long sp_Id; // 主键
	private Long sp_OldId; // 原系统主键
	private String sp_Gcmc;    //工程名称
	private String sp_Gcdd;    //工程地点
	private Double sp_Lat;	  //经度
	private Double sp_Lng;	  //纬度
	private String sp_Bz;	//备注
	private Integer sp_Type;     //工程类型
	private Integer sp_State;  //工程的状态

	private String sp_Gcdh;    //工程档号
    private String sp_Fldgo;    //分类大纲一级
	private String sp_Fldgt;    //分类大纲二级
	private String sp_Fldgth;    //分类大纲三级
	private String sp_Gdr;//归档人
	private Date sp_Gdrq;//归档日期

	private String sp_Gcxh;    //工程序号
	private Integer sp_Gcsxh;//工程顺序号
	private Date sp_Jgrq;//进馆日期
	private String sp_Yjdw;  //移交单位
	private String sp_Lrr;     //录入人名称
	private Timestamp   sp_Lrsj = new Timestamp(System.currentTimeMillis());	//录入时间
	
	@ManyToOne
	@JoinColumn(name = "sp_Project")
	private EAM_Project sp_Project;// 父项目分类
	
	@OneToMany(mappedBy = "file_SProject", fetch = FetchType.LAZY, targetEntity = EAM_File.class, cascade = CascadeType.ALL)
	@OrderBy("file_Id")
	private List<EAM_File> sp_File;// 跟案卷一对多关系
	
	@OneToMany(mappedBy = "record_SProject", fetch = FetchType.LAZY, targetEntity = EAM_Record.class, cascade = CascadeType.ALL)
	@OrderBy("record_Id")
	private List<EAM_Record> sp_Record;// 跟文件一对多关系
	
	private String sp_SysFrom; // 工程来源

	public Long getSp_Id() {
		return sp_Id;
	}

	public void setSp_Id(Long sp_Id) {
		this.sp_Id = sp_Id;
	}

	public Long getSp_OldId() {
		return sp_OldId;
	}

	public void setSp_OldId(Long sp_OldId) {
		this.sp_OldId = sp_OldId;
	}

	public String getSp_Gcmc() {
		return sp_Gcmc;
	}

	public void setSp_Gcmc(String sp_Gcmc) {
		this.sp_Gcmc = sp_Gcmc;
	}

	public String getSp_Gcdd() {
		return sp_Gcdd;
	}

	public void setSp_Gcdd(String sp_Gcdd) {
		this.sp_Gcdd = sp_Gcdd;
	}

	public Double getSp_Lat() {
		return sp_Lat;
	}

	public void setSp_Lat(Double sp_Lat) {
		this.sp_Lat = sp_Lat;
	}

	public Double getSp_Lng() {
		return sp_Lng;
	}

	public void setSp_Lng(Double sp_Lng) {
		this.sp_Lng = sp_Lng;
	}

	public String getSp_Bz() {
		return sp_Bz;
	}

	public void setSp_Bz(String sp_Bz) {
		this.sp_Bz = sp_Bz;
	}

	public Integer getSp_Type() {
		return sp_Type;
	}

	public void setSp_Type(Integer sp_Type) {
		this.sp_Type = sp_Type;
	}

	public Integer getSp_State() {
		return sp_State;
	}

	public void setSp_State(Integer sp_State) {
		this.sp_State = sp_State;
	}

	public String getSp_Gcdh() {
		return sp_Gcdh;
	}

	public void setSp_Gcdh(String sp_Gcdh) {
		this.sp_Gcdh = sp_Gcdh;
	}

	public String getSp_Fldgo() {
		return sp_Fldgo;
	}

	public void setSp_Fldgo(String sp_Fldgo) {
		this.sp_Fldgo = sp_Fldgo;
	}

	public String getSp_Fldgt() {
		return sp_Fldgt;
	}

	public void setSp_Fldgt(String sp_Fldgt) {
		this.sp_Fldgt = sp_Fldgt;
	}

	public String getSp_Fldgth() {
		return sp_Fldgth;
	}

	public void setSp_Fldgth(String sp_Fldgth) {
		this.sp_Fldgth = sp_Fldgth;
	}

	public String getSp_Gdr() {
		return sp_Gdr;
	}

	public void setSp_Gdr(String sp_Gdr) {
		this.sp_Gdr = sp_Gdr;
	}

	public Date getSp_Gdrq() {
		return sp_Gdrq;
	}

	public void setSp_Gdrq(Date sp_Gdrq) {
		this.sp_Gdrq = sp_Gdrq;
	}

	public String getSp_Gcxh() {
		return sp_Gcxh;
	}

	public void setSp_Gcxh(String sp_Gcxh) {
		this.sp_Gcxh = sp_Gcxh;
	}

	public Integer getSp_Gcsxh() {
		return sp_Gcsxh;
	}

	public void setSp_Gcsxh(Integer sp_Gcsxh) {
		this.sp_Gcsxh = sp_Gcsxh;
	}

	public Date getSp_Jgrq() {
		return sp_Jgrq;
	}

	public void setSp_Jgrq(Date sp_Jgrq) {
		this.sp_Jgrq = sp_Jgrq;
	}

	public String getSp_Yjdw() {
		return sp_Yjdw;
	}

	public void setSp_Yjdw(String sp_Yjdw) {
		this.sp_Yjdw = sp_Yjdw;
	}

	public String getSp_Lrr() {
		return sp_Lrr;
	}

	public void setSp_Lrr(String sp_Lrr) {
		this.sp_Lrr = sp_Lrr;
	}

	public Timestamp getSp_Lrsj() {
		return sp_Lrsj;
	}

	public void setSp_Lrsj(Timestamp sp_Lrsj) {
		this.sp_Lrsj = sp_Lrsj;
	}

	public EAM_Project getSp_Project() {
		return sp_Project;
	}

	public void setSp_Project(EAM_Project sp_Project) {
		this.sp_Project = sp_Project;
	}

	public List<EAM_File> getSp_File() {
		return sp_File;
	}

	public void setSp_File(List<EAM_File> sp_File) {
		this.sp_File = sp_File;
	}

	public List<EAM_Record> getSp_Record() {
		return sp_Record;
	}

	public void setSp_Record(List<EAM_Record> sp_Record) {
		this.sp_Record = sp_Record;
	}

	public String getSp_SysFrom() {
		return sp_SysFrom;
	}

	public void setSp_SysFrom(String sp_SysFrom) {
		this.sp_SysFrom = sp_SysFrom;
	}
}
