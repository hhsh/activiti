package com.esquare.eam.entity.actives;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用于设置工程下的案卷总登记号
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 张俊飞
 * @version 1.0.2014.9.4
 */
@Entity
@Table(name="EAM_FNum")
public class EAM_FNum implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long fNum_Id; // 主键
	private Integer fNum_MaxNum;  //最大总登记号
	private Integer fUnm_CurNum; //当前最大总登记号
	
	public Long getFNum_Id() {
		return fNum_Id;
	}
	public void setFNum_Id(Long fNum_Id) {
		this.fNum_Id = fNum_Id;
	}
	public Integer getFNum_MaxNum() {
		return fNum_MaxNum;
	}
	public void setFNum_MaxNum(Integer fNum_MaxNum) {
		this.fNum_MaxNum = fNum_MaxNum;
	}
	public Integer getFUnm_CurNum() {
		return fUnm_CurNum;
	}
	public void setFUnm_CurNum(Integer fUnm_CurNum) {
		this.fUnm_CurNum = fUnm_CurNum;
	}
	
	
}
