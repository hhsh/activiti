package com.esquare.eam.entity.actives;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * 项目信息房屋类型实体对应表
 * 
 * <p>用来存放单项工程房屋类 的数据信息 同时该表继承项目信息表
 * 
 * <p>Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 唐可华
 * @version 1.1.2014.2.11
 */
@Entity
@Table(name="EAM_SpCommon")
@PrimaryKeyJoinColumn(name="spc_Id") //竣工类档案id
public class EAM_SpCommon extends EAM_SingleProject{

	private static final long serialVersionUID = 1L;
	
	private String spc_Jsdw;  //建设单位
	private String spc_Jsdwlxdh;  //建设单位联系电话
	private String spc_Sgdw;  //施工单位
	private String spc_Sgdwlxdh;  //施工单位联系电话
	private String spc_Sjdw;  //设计单位
	private String spc_Kcdw;  //勘察单位
	
	public String getSpc_Jsdw() {
		return spc_Jsdw;
	}
	public void setSpc_Jsdw(String spc_Jsdw) {
		this.spc_Jsdw = spc_Jsdw;
	}
	public String getSpc_Jsdwlxdh() {
		return spc_Jsdwlxdh;
	}
	public void setSpc_Jsdwlxdh(String spc_Jsdwlxdh) {
		this.spc_Jsdwlxdh = spc_Jsdwlxdh;
	}
	public String getSpc_Sgdw() {
		return spc_Sgdw;
	}
	public void setSpc_Sgdw(String spc_Sgdw) {
		this.spc_Sgdw = spc_Sgdw;
	}
	public String getSpc_Sgdwlxdh() {
		return spc_Sgdwlxdh;
	}
	public void setSpc_Sgdwlxdh(String spc_Sgdwlxdh) {
		this.spc_Sgdwlxdh = spc_Sgdwlxdh;
	}
	public String getSpc_Sjdw() {
		return spc_Sjdw;
	}
	public void setSpc_Sjdw(String spc_Sjdw) {
		this.spc_Sjdw = spc_Sjdw;
	}
	public String getSpc_Kcdw() {
		return spc_Kcdw;
	}
	public void setSpc_Kcdw(String spc_Kcdw) {
		this.spc_Kcdw = spc_Kcdw;
	}
}
