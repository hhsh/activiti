package com.esquare.eam.entity.actives;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用于判断上传文件时使用那个切片
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 张俊飞
 * @version 1.0.2014.4.24
 */
@Entity
@Table(name="EAM_Slice")
public class EAM_Slice implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long slice_Id; // 主键
	private String  slice_Name;  //切片文件夹名字
	private Integer slice_Number;  //文件夹下的数量
	private Integer slice_QFXX;		//区分哪个项目下的文件0为档案管理系统1为电子接收系统
	public Long getSlice_Id() {
		return slice_Id;
	}
	public void setSlice_Id(Long slice_Id) {
		this.slice_Id = slice_Id;
	}
	public String getSlice_Name() {
		return slice_Name;
	}
	public void setSlice_Name(String slice_Name) {
		this.slice_Name = slice_Name;
	}
	public Integer getSlice_Number() {
		return slice_Number;
	}
	public void setSlice_Number(Integer slice_Number) {
		this.slice_Number = slice_Number;
	}
	public Integer getSlice_QFXX() {
		return slice_QFXX;
	}
	public void setSlice_QFXX(Integer slice_QFXX) {
		this.slice_QFXX = slice_QFXX;
	}
}
