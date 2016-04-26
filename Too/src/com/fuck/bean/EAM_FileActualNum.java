package com.esquare.eam.entity.actives;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 案卷总登记号实时值表
 *
 * <p>记录案卷最新的总登记号
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  张博
 * @version 1.0.2015-3-9
 */
@Entity
@Table(name="EAM_FileActualNum")
public class EAM_FileActualNum implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long   fan_Id; // 主键
	
	private Integer fan_OldActualNum; //库存档案的总登记号实时值

	private Integer fan_CriticalNum; //总登记号临界值
	
	private Integer fan_NewActualNum; //新增档案的总登记号实时值
	
	public Long getFan_Id() {
		return fan_Id;
	}

	public Integer getFan_OldActualNum() {
		return fan_OldActualNum;
	}

	public Integer getFan_CriticalNum() {
		return fan_CriticalNum;
	}

	public Integer getFan_NewActualNum() {
		return fan_NewActualNum;
	}

	public void setFan_Id(Long fan_Id) {
		this.fan_Id = fan_Id;
	}

	public void setFan_OldActualNum(Integer fan_OldActualNum) {
		this.fan_OldActualNum = fan_OldActualNum;
	}

	public void setFan_CriticalNum(Integer fan_CriticalNum) {
		this.fan_CriticalNum = fan_CriticalNum;
	}

	public void setFan_NewActualNum(Integer fan_NewActualNum) {
		this.fan_NewActualNum = fan_NewActualNum;
	}
}
