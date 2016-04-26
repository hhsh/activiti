package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 案卷盒实体与数据库表对应
 * 
 * <p>
 * 用来记录每个案卷盒的信息
 * 
 * <p>
 * Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 张俊飞
 * @version 1.0.2014.6.30
 */
@Entity
@Table(name = "EAM_FileBox")
public class EAM_FileBox implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long box_Id; // 主键
	private Integer box_NumInt; // 盒序号	
	private String box_NumString; // 盒编号
	private String box_NumArchive; // 盒档号	
	private String box_Name;// 盒名称	
	private Integer box_FileNumber;// 盒内案卷数	
	private String box_User;// 盒整理人	
	private Integer box_Width;//背脊宽度(2、3、4、5、6单位cm)	
	@Temporal(TemporalType.DATE)
	private Date box_CreateDate;// 编制日期	
	private String box_StoreAdd;// 盒存放地址	
	private String box_Description;// 盒备注内容	
	private String box_ArchiveNo;//档案馆号	
	private String box_MicroNo;//缩微号	
	private String box_OrgUnit;//编制单位	
	private Integer box_RetenPeriod = 0;//（0短期、1长期、2永久）
	private Integer box_SecuClass = 0;//密级(0内部、1秘密、2、机密、3、绝密）	
	private Long box_ArcLoacl;//所属单元格
	public Long getBox_Id() {
		return box_Id;
	}

	public void setBox_Id(Long box_Id) {
		this.box_Id = box_Id;
	}

	public Integer getBox_NumInt() {
		return box_NumInt;
	}

	public void setBox_NumInt(Integer box_NumInt) {
		this.box_NumInt = box_NumInt;
	}

	public String getBox_NumString() {
		return box_NumString;
	}

	public void setBox_NumString(String box_NumString) {
		this.box_NumString = box_NumString;
	}

	public String getBox_Name() {
		return box_Name;
	}

	public void setBox_Name(String box_Name) {
		this.box_Name = box_Name;
	}

	public Integer getBox_FileNumber() {
		return box_FileNumber;
	}

	public void setBox_FileNumber(Integer box_FileNumber) {
		this.box_FileNumber = box_FileNumber;
	}

	public String getBox_User() {
		return box_User;
	}

	public void setBox_User(String box_User) {
		this.box_User = box_User;
	}

	public Date getBox_CreateDate() {
		return box_CreateDate;
	}

	public void setBox_CreateDate(Date box_CreateDate) {
		this.box_CreateDate = box_CreateDate;
	}

	public String getBox_StoreAdd() {
		return box_StoreAdd;
	}

	public void setBox_StoreAdd(String box_StoreAdd) {
		this.box_StoreAdd = box_StoreAdd;
	}

	public String getBox_Description() {
		return box_Description;
	}

	public void setBox_Description(String box_Description) {
		this.box_Description = box_Description;
	}

	public String getBox_ArchiveNo() {
		return box_ArchiveNo;
	}

	public void setBox_ArchiveNo(String box_ArchiveNo) {
		this.box_ArchiveNo = box_ArchiveNo;
	}

	public String getBox_MicroNo() {
		return box_MicroNo;
	}

	public void setBox_MicroNo(String box_MicroNo) {
		this.box_MicroNo = box_MicroNo;
	}
	
	public String getBox_NumArchive() {
		return box_NumArchive;
	}

	public void setBox_NumArchive(String box_NumArchive) {
		this.box_NumArchive = box_NumArchive;
	}

	public String getBox_OrgUnit() {
		return box_OrgUnit;
	}

	public void setBox_OrgUnit(String box_OrgUnit) {
		this.box_OrgUnit = box_OrgUnit;
	}

	public Integer getBox_RetenPeriod() {
		return box_RetenPeriod;
	}

	public void setBox_RetenPeriod(Integer box_RetenPeriod) {
		this.box_RetenPeriod = box_RetenPeriod;
	}

	public Integer getBox_SecuClass() {
		return box_SecuClass;
	}

	public void setBox_SecuClass(Integer box_SecuClass) {
		this.box_SecuClass = box_SecuClass;
	}

	public Long getBox_ArcLoacl() {
		return box_ArcLoacl;
	}

	public void setBox_ArcLoacl(Long box_ArcLoacl) {
		this.box_ArcLoacl = box_ArcLoacl;
	}

	public Integer getBox_Width() {
		return box_Width;
	}

	public void setBox_Width(Integer box_Width) {
		this.box_Width = box_Width;
	}
	
}
