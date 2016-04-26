package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * 专题实体
 *
 * <p>记录专题信息
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  张博
 * @version 1.0.2014-12-9
 */
@Entity
@Table(name="EAM_Topic")
public class EAM_Topic implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long topic_Id; // 主键
	
	private Long  topic_PersonId;  //创建人id
	
	private String  topic_PersonName;  //创建人名称
	
	private String  topic_Name;  //专题名称
	
	private String  topic_Info;  //专题描述
	
	private Date topic_CreateDate = null; //创建时间
	
	private Long topic_CoverRecordId; // 专题封面文件id
	
	private Integer topic_RecordCount; // 专题包含文件数量
	
	@ManyToMany(cascade = CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinTable(name = "EAM_TopicRecord", joinColumns = { @JoinColumn(name = "recordTopic_Tid", 
	referencedColumnName = "topic_Id") }, inverseJoinColumns = { @JoinColumn(name = "recordTopic_Rid",
	referencedColumnName = "record_Id") })
	private List<EAM_Record> topic_Records = new ArrayList<EAM_Record>();  //专题文件集合

	public Long getTopic_Id() {
		return topic_Id;
	}

	public void setTopic_Id(Long topic_Id) {
		this.topic_Id = topic_Id;
	}

	public Long getTopic_PersonId() {
		return topic_PersonId;
	}

	public void setTopic_PersonId(Long topic_PersonId) {
		this.topic_PersonId = topic_PersonId;
	}

	public String getTopic_Name() {
		return topic_Name;
	}

	public void setTopic_Name(String topic_Name) {
		this.topic_Name = topic_Name;
	}

	public String getTopic_Info() {
		return topic_Info;
	}

	public void setTopic_Info(String topic_Info) {
		this.topic_Info = topic_Info;
	}

	public Date getTopic_CreateDate() {
		return topic_CreateDate;
	}

	public void setTopic_CreateDate(Date topic_CreateDate) {
		this.topic_CreateDate = topic_CreateDate;
	}

	public String getTopic_PersonName() {
		return topic_PersonName;
	}

	public void setTopic_PersonName(String topic_PersonName) {
		this.topic_PersonName = topic_PersonName;
	}
	
	public Long getTopic_CoverRecordId() {
		return topic_CoverRecordId;
	}

	public void setTopic_CoverRecordId(Long topic_CoverRecordId) {
		this.topic_CoverRecordId = topic_CoverRecordId;
	}

	public List<EAM_Record> getTopic_Records() {
		return topic_Records;
	}

	public void setTopic_Records(List<EAM_Record> topic_Records) {
		this.topic_Records = topic_Records;
	}

	public Integer getTopic_RecordCount() {
		return topic_RecordCount;
	}

	public void setTopic_RecordCount(Integer topic_RecordCount) {
		this.topic_RecordCount = topic_RecordCount;
	}

	@PrePersist
	public void setCreateDate() {
		this.setTopic_CreateDate(new Date());
	}
}
