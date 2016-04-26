package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;


/**
 * 案卷实体与数据库表对应
 * 
 * <p>用来记录每个案卷的信息
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.0.2014.2.14
 */
@Entity
@Table(name="EAM_File")
public class EAM_File implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long   file_Id; // 主键
	
	private String file_Ajtm; //案卷题名
	
	private String file_Ajdh;//档号
	
	private String file_Fldgo;    //分类大纲一级
	
	private String file_Fldgt;    //分类大纲二级
	
	private String file_Fldgth;    //分类大纲三级
	
	private Integer file_Num;  //总登记号
	
	private Timestamp file_Fhsj;
	
	private Integer file_Bgqx;//保管期限 （0短期、1长期、2永久）
	
	private Integer file_Mj;//密集(0内部、1秘密、2、机密、3、绝密）
	
	private String file_Lrr;//录入人
	
	private Timestamp file_Lrsj = new Timestamp(System.currentTimeMillis()); //录入时间
	
	private String file_Ljr;//立卷人
	
	private Date file_Ljsj;//立卷时间
	
	private String file_Shr;//审核人
	
	private Date file_Shsj;//审核时间
	
	private String file_Bz;//备注
	
	private String file_Bzdw;//编制单位
	
	private String file_Zrz;//责任者

	private Date file_Bzrq;//编制日期
	
	private Integer file_Borrow_State = 0;//案卷借阅状态（0可借阅、1不可借阅）
	
	private Long file_fileBoxId = 0L;//案卷盒Id值（0未归盒）
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_SProject")
	private EAM_SingleProject file_SProject;// 跟工程多对一关系

	@OneToMany(mappedBy = "record_File", fetch = FetchType.LAZY, targetEntity = EAM_Record.class, cascade = CascadeType.ALL)
	@OrderBy("record_Id")
	private List<EAM_Record> f_Record;// 跟文件一对多关系
	
	private Integer file_AjXh;  //案卷序号
	
	private String file_Jdh;//案卷旧档号
	
	private Date file_Qssj;//起始时间
	
	private Date file_Zzsj;//终止时间
	
	private String file_K;//案卷存放库
	
	private String file_L;//案卷存列
	
	private String file_G;//案卷存放柜
	
	private String file_C;//案卷存放层
	
	private String file_Ztc;//案卷主题词
	
	private Integer file_State = 0;//案卷借阅状态（默认0无意义，45借阅状态、40库存状态）

	@Column (length=1,columnDefinition="int default 0",nullable=false)
	private Integer identify_status = 0;//0正常状态，1：销毁状态
	
	@Column (length=5)
	private Long identify_Id;//定义外键与鉴定表进行弱关联
	
	private Integer file_SysFrom;//案卷系统来源标识 0档案管理系统1在线报建系统2业务管理系统
	
	public Integer getIdentify_status() {
		return identify_status;
	}

	public void setIdentify_status(Integer identify_status) {
		this.identify_status = identify_status;
	}
	
	public Long getIdentify_Id() {
		return identify_Id;
	}

	public void setIdentify_Id(Long identify_Id) {
		this.identify_Id = identify_Id;
	}
	
	public Long getFile_Id() {
		return file_Id;
	}

	public void setFile_Id(Long file_Id) {
		this.file_Id = file_Id;
	}

	public Integer getFile_Num() {
		return file_Num;
	}

	public String getFile_Lrr() {
		return file_Lrr;
	}

	public void setFile_Lrr(String file_Lrr) {
		this.file_Lrr = file_Lrr;
	}

	public void setFile_Num(Integer file_Num) {
		this.file_Num = file_Num;
	}

	public Timestamp getFile_Fhsj() {
		return file_Fhsj;
	}

	public void setFile_Fhsj(Timestamp file_Fhsj) {
		this.file_Fhsj = file_Fhsj;
	}

	public EAM_SingleProject getFile_SProject() {
		return file_SProject;
	}

	public void setFile_SProject(EAM_SingleProject file_SProject) {
		this.file_SProject = file_SProject;
	}

	public String getFile_Ajtm() {
		return file_Ajtm;
	}

	public void setFile_Ajtm(String file_Ajtm) {
		this.file_Ajtm = file_Ajtm;
	}

	public String getFile_Ajdh() {
		return file_Ajdh;
	}

	public void setFile_Ajdh(String file_Ajdh) {
		this.file_Ajdh = file_Ajdh;
	}

	public String getFile_Fldgo() {
		return file_Fldgo;
	}

	public void setFile_Fldgo(String file_Fldgo) {
		this.file_Fldgo = file_Fldgo;
	}

	public String getFile_Fldgt() {
		return file_Fldgt;
	}

	public void setFile_Fldgt(String file_Fldgt) {
		this.file_Fldgt = file_Fldgt;
	}

	public String getFile_Fldgth() {
		return file_Fldgth;
	}

	public void setFile_Fldgth(String file_Fldgth) {
		this.file_Fldgth = file_Fldgth;
	}

	public Integer getFile_Bgqx() {
		return file_Bgqx;
	}

	public Long getFile_fileBoxId() {
		return file_fileBoxId;
	}

	public void setFile_fileBoxId(Long file_fileBoxId) {
		this.file_fileBoxId = file_fileBoxId;
	}

	public void setFile_Bgqx(Integer file_Bgqx) {
		this.file_Bgqx = file_Bgqx;
	}

	public Integer getFile_Mj() {
		return file_Mj;
	}

	public void setFile_Mj(Integer file_Mj) {
		this.file_Mj = file_Mj;
	}
	
	public Timestamp getFile_Lrsj() {
		return file_Lrsj;
	}

	public void setFile_Lrsj(Timestamp file_Lrsj) {
		this.file_Lrsj = file_Lrsj;
	}

	public Date getFile_Ljsj() {
		return file_Ljsj;
	}

	public void setFile_Ljsj(Date file_Ljsj) {
		this.file_Ljsj = file_Ljsj;
	}

	public String getFile_Bz() {
		return file_Bz;
	}

	public void setFile_Bz(String file_Bz) {
		this.file_Bz = file_Bz;
	}
	
	public List<EAM_Record> getF_Record() {
		return f_Record;
	}

	public void setF_Record(List<EAM_Record> f_Record) {
		this.f_Record = f_Record;
	}

	public Integer getFile_AjXh() {
		return file_AjXh;
	}

	public void setFile_AjXh(Integer file_AjXh) {
		this.file_AjXh = file_AjXh;
	}

	public Integer getFile_Borrow_State() {
		return file_Borrow_State;
	}

	public void setFile_Borrow_State(Integer file_Borrow_State) {
		this.file_Borrow_State = file_Borrow_State;
	}

	public String getFile_Bzdw() {
		return file_Bzdw;
	}

	public void setFile_Bzdw(String file_Bzdw) {
		this.file_Bzdw = file_Bzdw;
	}
	
	public String getFile_Zrz() {
		return file_Zrz;
	}

	public void setFile_Zrz(String file_Zrz) {
		this.file_Zrz = file_Zrz;
	}

	public Date getFile_Bzrq() {
		return file_Bzrq;
	}

	public void setFile_Bzrq(Date file_Bzrq) {
		this.file_Bzrq = file_Bzrq;
	}

	public String getFile_Ljr() {
		return file_Ljr;
	}

	public void setFile_Ljr(String file_Ljr) {
		this.file_Ljr = file_Ljr;
	}

	public String getFile_Shr() {
		return file_Shr;
	}

	public void setFile_Shr(String file_Shr) {
		this.file_Shr = file_Shr;
	}

	public Date getFile_Shsj() {
		return file_Shsj;
	}

	public void setFile_Shsj(Date file_Shsj) {
		this.file_Shsj = file_Shsj;
	}

	public String getFile_Jdh() {
		return file_Jdh;
	}

	public void setFile_Jdh(String file_Jdh) {
		this.file_Jdh = file_Jdh;
	}

	public Date getFile_Qssj() {
		return file_Qssj;
	}

	public void setFile_Qssj(Date file_Qssj) {
		this.file_Qssj = file_Qssj;
	}

	public Date getFile_Zzsj() {
		return file_Zzsj;
	}

	public void setFile_Zzsj(Date file_Zzsj) {
		this.file_Zzsj = file_Zzsj;
	}

	public String getFile_K() {
		return file_K;
	}

	public void setFile_K(String file_K) {
		this.file_K = file_K;
	}

	public String getFile_L() {
		return file_L;
	}

	public void setFile_L(String file_L) {
		this.file_L = file_L;
	}

	public String getFile_G() {
		return file_G;
	}

	public void setFile_G(String file_G) {
		this.file_G = file_G;
	}

	public String getFile_C() {
		return file_C;
	}

	public void setFile_C(String file_C) {
		this.file_C = file_C;
	}

	/**
	 * @return the file_Ztc
	 */
	public String getFile_Ztc() {
		return file_Ztc;
	}

	/**
	 * @param file_Ztc the file_Ztc to set
	 */
	public void setFile_Ztc(String file_Ztc) {
		this.file_Ztc = file_Ztc;
	}

	public Integer getFile_State() {
		return file_State;
	}

	public void setFile_State(Integer file_State) {
		this.file_State = file_State;
	}

	public Integer getFile_SysFrom() {
		return file_SysFrom;
	}

	public void setFile_SysFrom(Integer file_SysFrom) {
		this.file_SysFrom = file_SysFrom;
	}
}
