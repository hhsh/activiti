package com.esquare.eam.entity.actives;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 案卷总登记号回收表
 *
 * <p>记录可回收的案卷总登记号
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  张博
 * @version 1.0.2015-3-9
 */
@Entity
@Table(name="EAM_FileRecycleNum")
public class EAM_FileRecycleNum implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long   frn_Id; // 主键
	
	private Integer frn_Num; //案卷总登记号

	public Long getFrn_Id() {
		return frn_Id;
	}

	public Integer getFrn_Num() {
		return frn_Num;
	}

	public void setFrn_Id(Long frn_Id) {
		this.frn_Id = frn_Id;
	}

	public void setFrn_Num(Integer frn_Num) {
		this.frn_Num = frn_Num;
	}
}
