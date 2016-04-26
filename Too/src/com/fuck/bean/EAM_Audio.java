package com.esquare.eam.entity.actives;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="EAM_Audio")
@PrimaryKeyJoinColumn(name="a_Id") //录音表主键
public class EAM_Audio extends EAM_Record{
	
	private static final long serialVersionUID = 1L;
	
	private Float   A_Gprl;//光盘容量
	private String  A_Yyfw;//应用范围
	
	public Float getA_Gprl() {
		return A_Gprl;
	}
	public void setA_Gprl(Float a_Gprl) {
		A_Gprl = a_Gprl;
	}
	public String getA_Yyfw() {
		return A_Yyfw;
	}
	public void setA_Yyfw(String a_Yyfw) {
		A_Yyfw = a_Yyfw;
	}
}
