package com.mysoft.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Allmechine {

	private Integer allmechineid;
	private String name;//编号
	private String jing;
	private String wei;
	private String mtype;//类型
	private String mvalue;//地址
	@Id
	@GeneratedValue
	@Column(name = "allmechineid", unique = true, nullable = false)
	public Integer getAllmechineid() {
		return allmechineid;
	}
	public void setAllmechineid(Integer allmechineid) {
		this.allmechineid = allmechineid;
	}
	@Column(name = "name", length = 100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "jing", length = 100)
	public String getJing() {
		return jing;
	}
	public void setJing(String jing) {
		this.jing = jing;
	}
	@Column(name = "wei", length = 100)
	public String getWei() {
		return wei;
	}
	public void setWei(String wei) {
		this.wei = wei;
	}
	@Column(name = "mtype", length = 100)
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String type) {
		this.mtype = type;
	}
	@Column(name = "mvalue", length = 100)
	public String getMvalue() {
		return mvalue;
	}
	public void setMvalue(String mvalue) {
		this.mvalue = mvalue;
	}
	public Allmechine() {
		super();
	}
	
	
}
