package com.esquare.eam.entity.actives;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EAM_Book")
public class EAM_Book {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	//private Long   book_Id; // 主键
	//private String book_Bh; // 编号
	private String book_Sm; // 书名
	private String book_Zz; // 作者
	private String book_Cbs; // 出版社
	private Date book_Cbrq; // 出版日期
	private Integer book_Sl; // 数量
	private Date book_Jsrq; // 接收日期
	private String book_Cfdd; // 存放地点
	private String book_Remark; //备注
	public Long getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(Long book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_Bh() {
		return book_Bh;
	}
	public void setBook_Bh(String book_Bh) {
		this.book_Bh = book_Bh;
	}
	public String getBook_Sm() {
		return book_Sm;
	}
	public void setBook_Sm(String book_Sm) {
		this.book_Sm = book_Sm;
	}
	public String getBook_Zz() {
		return book_Zz;
	}
	public void setBook_Zz(String book_Zz) {
		this.book_Zz = book_Zz;
	}
	public String getBook_Cbs() {
		return book_Cbs;
	}
	public void setBook_Cbs(String book_Cbs) {
		this.book_Cbs = book_Cbs;
	}
	public Date getBook_Cbrq() {
		return book_Cbrq;
	}
	public void setBook_Cbrq(Date book_Cbrq) {
		this.book_Cbrq = book_Cbrq;
	}
	public Integer getBook_Sl() {
		return book_Sl;
	}
	public void setBook_Sl(Integer book_Sl) {
		this.book_Sl = book_Sl;
	}
	public Date getBook_Jsrq() {
		return book_Jsrq;
	}
	public void setBook_Jsrq(Date book_Jsrq) {
		this.book_Jsrq = book_Jsrq;
	}
	public String getBook_Cfdd() {
		return book_Cfdd;
	}
	public void setBook_Cfdd(String book_Cfdd) {
		this.book_Cfdd = book_Cfdd;
	}
	public String getBook_Remark() {
		return book_Remark;
	}
	public void setBook_Remark(String book_Remark) {
		this.book_Remark = book_Remark;
	}
	
	 
	
	
}
