package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * 文件实体与数据库表对应
 * 
 * <p>用来记录每个文件的信息
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2014.2.14
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="EAM_Record")
public class EAM_Record implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long record_Id; // 主键
	private Integer record_WjXh;  //文件序号
	
	//载体类型:0文字、1图纸、2底图(张)、3照片(张)、4底片(张)、5录音带(盒)、6录像带(盒)、7光盘(盘)、
	//8计算机磁盘(盘)、9计算机磁带(盘)、10缩微片(盘)、11缩微片(张)、12其他
    private Integer record_Ztlx;  
	
	private Integer record_sl;    //数量
	
	//拟定0为照片 ,1为音频,2视频,3文字,4图纸(默认为5表示不属于任何类型)
	private Integer record_Type=5; // 文件类型：照片、音频、视频、文字、图纸
	
	private String  record_Wjdh;  //文件档号
	
	private String record_Number; // 文件编号
	
	private String  record_Wjtm;  //文件题名
	
	private String  record_Zrz;   //责任者
	
	private String  record_Wth;   //文图号
	
	private String  record_Wb;    //文本
	
    private String  record_Gg;    //规格
	
	private String  record_ty;    //提要
	
	private String  record_Ztc;   //主题词
	
	private String  record_fz;    //附注
	
	private String record_Suffix;//文件后缀
	
	private Timestamp record_Lrsj = new Timestamp(System.currentTimeMillis()); //录入时间
	
	private String  record_Lrr;   //录入人
	
	private Integer record_Borrow_State = 0;//文件借阅状态（0可借阅、1不可借阅，默认可借阅）
	
	
	private Integer record_Order ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "record_File")
	private EAM_File record_File;       // 跟案卷多对一关系
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "record_SProject")
	private EAM_SingleProject record_SProject;// 跟项目多对一关系
	
	private Integer record_Status = 0;  //文件记录是否存在对应的文件  0 不存在 1存在
	
	private String record_sliceId;      //切片的目录
	
	private Integer record_pdfPage=0;   //pdf的总页数
	
	private Integer record_IFEndTranslate = 0 ;  //文件结束转换 0没有,1结束转换.
	
	private Boolean record_IfUp = true; //是否可以上传
	
	private Date record_ShootingTime; // 拍摄时间（起始时间）
	
	private Date record_Jzsj; // 截止时间
	
	private Integer record_Mj;//密级
	
	private String record_Yjfyj;//原件/复印件
	
	private Integer record_InventoryStatus;  //文件状态
	
	@Column(columnDefinition="int default 0",nullable=false)
	private Integer record_IfDelete = 0;  //是否真删0：正常，1：回收站
	
	private Integer record_SysFrom;//文件系统来源标识 0档案管理系统1在线报建系统2业务管理系统3声像档案上传
	
	
	@ManyToMany(mappedBy = "topic_Records")
	private List<EAM_Topic> record_Topics; 
	
	
	public Integer getRecord_Order() {
		return record_Order;
	}

	public void setRecord_Order(Integer record_Order) {
		this.record_Order = record_Order;
	}

	public List<EAM_Topic> getRecord_Topics() {
		return record_Topics;
	}

	public void setRecord_Topics(List<EAM_Topic> record_Topics) {
		this.record_Topics = record_Topics;
	}

	public Integer getRecord_IfDelete() {
		return record_IfDelete;
	}

	public void setRecord_IfDelete(Integer record_IfDelete) {
		this.record_IfDelete = record_IfDelete;
	}

	public Boolean getRecord_IfUp() {
		return record_IfUp;
	}

	public void setRecord_IfUp(Boolean record_IfUp) {
		this.record_IfUp = record_IfUp;
	}

	public Integer getRecord_pdfPage() {
		return record_pdfPage;
	}

	public void setRecord_pdfPage(Integer record_pdfPage) {
		this.record_pdfPage = record_pdfPage;
	}

	public String getRecord_sliceId() {
		return record_sliceId;
	}

	public void setRecord_sliceId(String record_sliceId) {
		this.record_sliceId = record_sliceId;
	}

	public Long getRecord_Id() {
		return record_Id;
	}

	public void setRecord_Id(Long record_Id) {
		this.record_Id = record_Id;
	}

	public String getRecord_Wjdh() {
		return record_Wjdh;
	}

	public void setRecord_Wjdh(String record_Wjdh) {
		this.record_Wjdh = record_Wjdh;
	}

	public String getRecord_Wjtm() {
		return record_Wjtm;
	}

	public void setRecord_Wjtm(String record_Wjtm) {
		this.record_Wjtm = record_Wjtm;
	}

	public String getRecord_Zrz() {
		return record_Zrz;
	}

	public void setRecord_Zrz(String record_Zrz) {
		this.record_Zrz = record_Zrz;
	}

	public String getRecord_Wth() {
		return record_Wth;
	}

	public void setRecord_Wth(String record_Wth) {
		this.record_Wth = record_Wth;
	}

	public String getRecord_Wb() {
		return record_Wb;
	}

	public void setRecord_Wb(String record_Wb) {
		this.record_Wb = record_Wb;
	}

	public Integer getRecord_Ztlx() {
		return record_Ztlx;
	}

	public void setRecord_Ztlx(Integer record_Ztlx) {
		this.record_Ztlx = record_Ztlx;
	}

	public Integer getRecord_sl() {
		return record_sl;
	}

	public void setRecord_sl(Integer record_sl) {
		this.record_sl = record_sl;
	}

	public String getRecord_Gg() {
		return record_Gg;
	}

	public void setRecord_Gg(String record_Gg) {
		this.record_Gg = record_Gg;
	}

	public String getRecord_ty() {
		return record_ty;
	}

	public void setRecord_ty(String record_ty) {
		this.record_ty = record_ty;
	}

	public String getRecord_Ztc() {
		return record_Ztc;
	}

	public void setRecord_Ztc(String record_Ztc) {
		this.record_Ztc = record_Ztc;
	}

	public String getRecord_fz() {
		return record_fz;
	}

	public void setRecord_fz(String record_fz) {
		this.record_fz = record_fz;
	}
	
	public String getRecord_Lrr() {
		return record_Lrr;
	}

	public void setRecord_Lrr(String record_Lrr) {
		this.record_Lrr = record_Lrr;
	}

	public EAM_File getRecord_File() {
		return record_File;
	}

	public void setRecord_File(EAM_File record_File) {
		this.record_File = record_File;
	}

	public Integer getRecord_WjXh() {
		return record_WjXh;
	}

	public void setRecord_WjXh(Integer record_WjXh) {
		this.record_WjXh = record_WjXh;
	}

	public Integer getRecord_Status() {
		return record_Status;
	}

	public void setRecord_Status(Integer record_Status) {
		this.record_Status = record_Status;
	}

	public Integer getRecord_Borrow_State() {
		return record_Borrow_State;
	}

	public void setRecord_Borrow_State(Integer record_Borrow_State) {
		this.record_Borrow_State = record_Borrow_State;
	}

	public String getRecord_Suffix() {
		return record_Suffix;
	}

	public void setRecord_Suffix(String record_Suffix) {
		this.record_Suffix = record_Suffix;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public EAM_SingleProject getRecord_SProject() {
		return record_SProject;
	}

	public void setRecord_SProject(EAM_SingleProject record_SProject) {
		this.record_SProject = record_SProject;
	}

	public Integer getRecord_Type() {
		return record_Type;
	}

	public void setRecord_Type(Integer record_Type) {
		this.record_Type = record_Type;
	}

	public String getRecord_Number() {
		return record_Number;
	}

	public void setRecord_Number(String record_Number) {
		this.record_Number = record_Number;
	}

	public Integer getRecord_IFEndTranslate() {
		return record_IFEndTranslate;
	}

	public void setRecord_IFEndTranslate(Integer record_IFEndTranslate) {
		this.record_IFEndTranslate = record_IFEndTranslate;
	}

	public Date getRecord_ShootingTime() {
		return record_ShootingTime;
	}

	public void setRecord_ShootingTime(Date record_ShootingTime) {
		this.record_ShootingTime = record_ShootingTime;
	}

	public Timestamp getRecord_Lrsj() {
		return record_Lrsj;
	}

	public void setRecord_Lrsj(Timestamp record_Lrsj) {
		this.record_Lrsj = record_Lrsj;
	}

	public Integer getRecord_InventoryStatus() {
		return record_InventoryStatus;
	}

	public void setRecord_InventoryStatus(Integer record_InventoryStatus) {
		this.record_InventoryStatus = record_InventoryStatus;
	}

	public Integer getRecord_SysFrom() {
		return record_SysFrom;
	}

	public void setRecord_SysFrom(Integer record_SysFrom) {
		this.record_SysFrom = record_SysFrom;
	}

	public Date getRecord_Jzsj() {
		return record_Jzsj;
	}

	public void setRecord_Jzsj(Date record_Jzsj) {
		this.record_Jzsj = record_Jzsj;
	}

	public Integer getRecord_Mj() {
		return record_Mj;
	}

	public void setRecord_Mj(Integer record_Mj) {
		this.record_Mj = record_Mj;
	}

	public String getRecord_Yjfyj() {
		return record_Yjfyj;
	}

	public void setRecord_Yjfyj(String record_Yjfyj) {
		this.record_Yjfyj = record_Yjfyj;
	}
	
	
}
