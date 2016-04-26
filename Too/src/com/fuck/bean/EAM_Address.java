package com.esquare.eam.entity.actives;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * 地址表
 * 
 * <p>
 * 项目地址信息维护
 * 
 * <p>
 * Copyright by Shanghai E-Square Information Technology.Co.Ltd.
 * 
 * @author 张博
 * @version 1.0.2015-4-22
 */
@Entity
@Table(name = "EAM_Address")
public class EAM_Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long address_Id;

	private String address_Name;// 行政区

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_Parent")
	private EAM_Address address_Parent; // 档案分类子类类别

	@OneToMany(mappedBy = "address_Parent", fetch = FetchType.LAZY, targetEntity = EAM_Address.class, cascade = CascadeType.ALL)
	@OrderBy("address_Id")
	private List<EAM_Address> address_ListClass;// 子项目分类

	public Long getAddress_Id() {
		return address_Id;
	}

	public String getAddress_Name() {
		return address_Name;
	}

	public EAM_Address getAddress_Parent() {
		return address_Parent;
	}

	public void setAddress_Parent(EAM_Address address_Parent) {
		this.address_Parent = address_Parent;
	}

	public List<EAM_Address> getAddress_ListClass() {
		return address_ListClass;
	}

	public void setAddress_ListClass(List<EAM_Address> address_ListClass) {
		this.address_ListClass = address_ListClass;
	}

	public void setAddress_Id(Long address_Id) {
		this.address_Id = address_Id;
	}

	public void setAddress_Name(String address_Name) {
		this.address_Name = address_Name;
	}

}
