package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author 黄华山
 *
 */
@Entity
@Table(name = "EAM_SpLandSon")
public class EAM_SpLandSon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long   spc_Id;
	private String spc_Ydxkfl;//用地许可分类
	private String spc_Sqfl;//申请分类
	private String spc_Ydxz;//用地性质
	private String spc_Jrxz;//兼容性质
	private String spc_Flxz;//分类性质
	private Double spc_Ydmj;//用地面积
	private Double spc_Jydmj;//净用地面积
	private Double spc_Dlmj;//道路面积
	private Double spc_Lhmj;//绿化面积
	private Double spc_Qtfzmj;//其他附征面积
	private String spc_Jsgm;//建设规模
	
	private String spc_Rjl;//容积率
	private Date spc_Zpmsprq;//总平面审批日期
	private Date spc_Xzzrq;//选址证日期
	private Date spc_Ydxkrq;//用地许可日期
	private String spc_Hxxmmc;//红线项目名称
	private String spc_jiegou;//结构
	private Integer spc_Dscs;//地上层数
	private Integer spc_Dxcs;//地下层数
	private Double spc_jdmj;//基底面积
	private Double spc_jzmj;//建筑面积
	private Double spc_wqcd;//围墙长度
	private Date spc_Hxrq;//红线日期
	private String spc_Fuzh;//附注
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spc_SpLand")
	private EAM_SpLand  spc_SpLand;


	public Long getSpc_Id() {
		return spc_Id;
	}


	public void setSpc_Id(Long spc_Id) {
		this.spc_Id = spc_Id;
	}


	public String getSpc_Ydxkfl() {
		return spc_Ydxkfl;
	}


	public void setSpc_Ydxkfl(String spc_Ydxkfl) {
		this.spc_Ydxkfl = spc_Ydxkfl;
	}


	public String getSpc_Sqfl() {
		return spc_Sqfl;
	}


	public void setSpc_Sqfl(String spc_Sqfl) {
		this.spc_Sqfl = spc_Sqfl;
	}


	public String getSpc_Ydxz() {
		return spc_Ydxz;
	}


	public void setSpc_Ydxz(String spc_Ydxz) {
		this.spc_Ydxz = spc_Ydxz;
	}


	public String getSpc_Jrxz() {
		return spc_Jrxz;
	}


	public void setSpc_Jrxz(String spc_Jrxz) {
		this.spc_Jrxz = spc_Jrxz;
	}


	public String getSpc_Flxz() {
		return spc_Flxz;
	}


	public void setSpc_Flxz(String spc_Flxz) {
		this.spc_Flxz = spc_Flxz;
	}


	public Double getSpc_Ydmj() {
		return spc_Ydmj;
	}


	public void setSpc_Ydmj(Double spc_Ydmj) {
		this.spc_Ydmj = spc_Ydmj;
	}


	public Double getSpc_Jydmj() {
		return spc_Jydmj;
	}


	public void setSpc_Jydmj(Double spc_Jydmj) {
		this.spc_Jydmj = spc_Jydmj;
	}


	public Double getSpc_Dlmj() {
		return spc_Dlmj;
	}


	public void setSpc_Dlmj(Double spc_Dlmj) {
		this.spc_Dlmj = spc_Dlmj;
	}


	public Double getSpc_Lhmj() {
		return spc_Lhmj;
	}


	public void setSpc_Lhmj(Double spc_Lhmj) {
		this.spc_Lhmj = spc_Lhmj;
	}


	public Double getSpc_Qtfzmj() {
		return spc_Qtfzmj;
	}


	public void setSpc_Qtfzmj(Double spc_Qtfzmj) {
		this.spc_Qtfzmj = spc_Qtfzmj;
	}


	public String getSpc_Jsgm() {
		return spc_Jsgm;
	}


	public void setSpc_Jsgm(String spc_Jsgm) {
		this.spc_Jsgm = spc_Jsgm;
	}


	public String getSpc_Rjl() {
		return spc_Rjl;
	}


	public void setSpc_Rjl(String spc_Rjl) {
		this.spc_Rjl = spc_Rjl;
	}


	public Date getSpc_Zpmsprq() {
		return spc_Zpmsprq;
	}


	public void setSpc_Zpmsprq(Date spc_Zpmsprq) {
		this.spc_Zpmsprq = spc_Zpmsprq;
	}


	public Date getSpc_Xzzrq() {
		return spc_Xzzrq;
	}


	public void setSpc_Xzzrq(Date spc_Xzzrq) {
		this.spc_Xzzrq = spc_Xzzrq;
	}


	public Date getSpc_Ydxkrq() {
		return spc_Ydxkrq;
	}


	public void setSpc_Ydxkrq(Date spc_Ydxkrq) {
		this.spc_Ydxkrq = spc_Ydxkrq;
	}


	public String getSpc_Hxxmmc() {
		return spc_Hxxmmc;
	}


	public void setSpc_Hxxmmc(String spc_Hxxmmc) {
		this.spc_Hxxmmc = spc_Hxxmmc;
	}


	public String getSpc_jiegou() {
		return spc_jiegou;
	}


	public void setSpc_jiegou(String spc_jiegou) {
		this.spc_jiegou = spc_jiegou;
	}


	public Integer getSpc_Dscs() {
		return spc_Dscs;
	}


	public void setSpc_Dscs(Integer spc_Dscs) {
		this.spc_Dscs = spc_Dscs;
	}


	public Integer getSpc_Dxcs() {
		return spc_Dxcs;
	}


	public void setSpc_Dxcs(Integer spc_Dxcs) {
		this.spc_Dxcs = spc_Dxcs;
	}


	public Double getSpc_jdmj() {
		return spc_jdmj;
	}


	public void setSpc_jdmj(Double spc_jdmj) {
		this.spc_jdmj = spc_jdmj;
	}


	public Double getSpc_jzmj() {
		return spc_jzmj;
	}


	public void setSpc_jzmj(Double spc_jzmj) {
		this.spc_jzmj = spc_jzmj;
	}


	public Double getSpc_wqcd() {
		return spc_wqcd;
	}


	public void setSpc_wqcd(Double spc_wqcd) {
		this.spc_wqcd = spc_wqcd;
	}


	public Date getSpc_Hxrq() {
		return spc_Hxrq;
	}


	public void setSpc_Hxrq(Date spc_Hxrq) {
		this.spc_Hxrq = spc_Hxrq;
	}


	public String getSpc_Fuzh() {
		return spc_Fuzh;
	}


	public void setSpc_Fuzh(String spc_Fuzh) {
		this.spc_Fuzh = spc_Fuzh;
	}


	public EAM_SpLand getSpc_SpLand() {
		return spc_SpLand;
	}


	public void setSpc_SpLand(EAM_SpLand spc_SpLand) {
		this.spc_SpLand = spc_SpLand;
	} 

 
	
	
}
