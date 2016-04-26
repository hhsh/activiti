package com.esquare.eam.entity.actives;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="EAM_Photo")
@PrimaryKeyJoinColumn(name="ph_Id") //照片表主键
public class EAM_Photo extends EAM_Record{
	
	private static final long serialVersionUID = 1L;
	
	private String PH_Dpbh;//底片编号
	private String PH_Ajh;//案卷号
	private String PH_Zzdw;//作者单位
	private String PH_Cddw;//存档单位
	private Integer PH_Sfhydp;//是否含有底片 (0,1)
	

	public String getPH_Dpbh() {
		return PH_Dpbh;
	}
	public void setPH_Dpbh(String pH_Dpbh) {
		PH_Dpbh = pH_Dpbh;
	}
	public String getPH_Ajh() {
		return PH_Ajh;
	}
	public void setPH_Ajh(String pH_Ajh) {
		PH_Ajh = pH_Ajh;
	}
	public String getPH_Zzdw() {
		return PH_Zzdw;
	}
	public void setPH_Zzdw(String pH_Zzdw) {
		PH_Zzdw = pH_Zzdw;
	}
	public String getPH_Cddw() {
		return PH_Cddw;
	}
	public void setPH_Cddw(String pH_Cddw) {
		PH_Cddw = pH_Cddw;
	}
	public Integer getPH_Sfhydp() {
		return PH_Sfhydp;
	}
	public void setPH_Sfhydp(Integer pH_Sfhydp) {
		PH_Sfhydp = pH_Sfhydp;
	}
	
}
