package com.esquare.eam.entity.actives;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EAM_Video")
@PrimaryKeyJoinColumn(name="vi_Id") //录像表主键
public class EAM_Video extends EAM_Record{
	
	private static final long serialVersionUID = 1L;
	
	private String VI_Sc;//时长
	private String VI_Pdh;//盘代号
	private String VI_Gph;//光盘号
	private String VI_Zzdw;//作者单位
	
	public String getVI_Sc() {
		return VI_Sc;
	}
	public void setVI_Sc(String vI_Sc) {
		VI_Sc = vI_Sc;
	}
	public String getVI_Pdh() {
		return VI_Pdh;
	}
	public void setVI_Pdh(String vI_Pdh) {
		VI_Pdh = vI_Pdh;
	}
	public String getVI_Gph() {
		return VI_Gph;
	}
	public void setVI_Gph(String vI_Gph) {
		VI_Gph = vI_Gph;
	}
	public String getVI_Zzdw() {
		return VI_Zzdw;
	}
	public void setVI_Zzdw(String vI_Zzdw) {
		VI_Zzdw = vI_Zzdw;
	}
}
