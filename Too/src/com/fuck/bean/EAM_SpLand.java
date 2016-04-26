package com.esquare.eam.entity.actives;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 建设用地类实体对应表 
 *
 * <p>用来存放建设用地类 的数据信息 同时该表继承单项工程信息表
 *
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 *
 * @author  唐可华
 * @version 1.0.2016-1-9
 */
@Entity
@Table(name="EAM_SpLand")
@PrimaryKeyJoinColumn(name="land_Id") //建设用地类id
public class EAM_SpLand extends EAM_SingleProject{
	
	private static final long serialVersionUID = 1L;
	
	private String land_Jsdw; //建设单位
	private String land_Lxpzdw;  //立项批准单位
	private String land_Bzdw;    //被征单位
	private String land_Lxpzwh;  //立项批准文号
	private String land_Xzzh;  //选址证号
	private String land_Ydghxkzh;//用地规划许可证号
	private String land_Gytdsyzh;//国有土地使用证号
	private String land_Dxth;  //地形图号
	 
	@OneToMany(mappedBy = "spc_SpLand", fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
	@OrderBy("spc_Id")
	private List<EAM_SpLandSon> land_SpLandSon;

	public String getLand_Jsdw() {
		return land_Jsdw;
	}

	public void setLand_Jsdw(String land_Jsdw) {
		this.land_Jsdw = land_Jsdw;
	}

	public String getLand_Lxpzdw() {
		return land_Lxpzdw;
	}

	public void setLand_Lxpzdw(String land_Lxpzdw) {
		this.land_Lxpzdw = land_Lxpzdw;
	}

	public String getLand_Bzdw() {
		return land_Bzdw;
	}

	public void setLand_Bzdw(String land_Bzdw) {
		this.land_Bzdw = land_Bzdw;
	}

	public String getLand_Lxpzwh() {
		return land_Lxpzwh;
	}

	public void setLand_Lxpzwh(String land_Lxpzwh) {
		this.land_Lxpzwh = land_Lxpzwh;
	}

	public String getLand_Xzzh() {
		return land_Xzzh;
	}

	public void setLand_Xzzh(String land_Xzzh) {
		this.land_Xzzh = land_Xzzh;
	}

	public String getLand_Ydghxkzh() {
		return land_Ydghxkzh;
	}

	public void setLand_Ydghxkzh(String land_Ydghxkzh) {
		this.land_Ydghxkzh = land_Ydghxkzh;
	}

	public String getLand_Gytdsyzh() {
		return land_Gytdsyzh;
	}

	public void setLand_Gytdsyzh(String land_Gytdsyzh) {
		this.land_Gytdsyzh = land_Gytdsyzh;
	}

	public String getLand_Dxth() {
		return land_Dxth;
	}

	public void setLand_Dxth(String land_Dxth) {
		this.land_Dxth = land_Dxth;
	}

	public List<EAM_SpLandSon> getLand_SpLandSon() {
		return land_SpLandSon;
	}

	public void setLand_SpLandSon(List<EAM_SpLandSon> land_SpLandSon) {
		this.land_SpLandSon = land_SpLandSon;
	}

}
