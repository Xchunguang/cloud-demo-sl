package com.mysoft.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Resultentrythree entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Resultentrythree implements java.io.Serializable {

	// Fields

	private Integer resultentry3id;
	private String code;
	private String dqyh;
	private String dz;
	private String fgsb;
	private String fgsbid;
	private String fhrq;
	private String htkh;
	private String name;
	private String sbbh;
	private String sbxh;
	private String sbzt;
	private String wz;
	private String yh;
	private String jb;
	private String sbsl;
	private String sbzt0;
	private String sbzt1;
	private String wd;

	// Constructors

	/** default constructor */
	public Resultentrythree() {
	}

	/** full constructor */
	public Resultentrythree(String code, String dqyh, String dz, String fgsb, String fgsbid, String fhrq, String htkh, String name, String sbbh, String sbxh, String sbzt,
			String wz, String yh, String jb, String sbsl, String sbzt0, String sbzt1, String wd) {
		this.code = code;
		this.dqyh = dqyh;
		this.dz = dz;
		this.fgsb = fgsb;
		this.fgsbid = fgsbid;
		this.fhrq = fhrq;
		this.htkh = htkh;
		this.name = name;
		this.sbbh = sbbh;
		this.sbxh = sbxh;
		this.sbzt = sbzt;
		this.wz = wz;
		this.yh = yh;
		this.jb = jb;
		this.sbsl = sbsl;
		this.sbzt0 = sbzt0;
		this.sbzt1 = sbzt1;
		this.wd = wd;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "resultentry3id", unique = true, nullable = false)
	public Integer getResultentry3id() {
		return this.resultentry3id;
	}

	public void setResultentry3id(Integer resultentry3id) {
		this.resultentry3id = resultentry3id;
	}

	@Column(name = "code", length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "dqyh", length = 100)
	public String getDqyh() {
		return this.dqyh;
	}

	public void setDqyh(String dqyh) {
		this.dqyh = dqyh;
	}

	@Column(name = "dz", length = 100)
	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	@Column(name = "fgsb", length = 100)
	public String getFgsb() {
		return this.fgsb;
	}

	public void setFgsb(String fgsb) {
		this.fgsb = fgsb;
	}

	@Column(name = "fgsbid", length = 100)
	public String getFgsbid() {
		return this.fgsbid;
	}

	public void setFgsbid(String fgsbid) {
		this.fgsbid = fgsbid;
	}

	@Column(name = "fhrq", length = 100)
	public String getFhrq() {
		return this.fhrq;
	}

	public void setFhrq(String fhrq) {
		this.fhrq = fhrq;
	}

	@Column(name = "htkh", length = 100)
	public String getHtkh() {
		return this.htkh;
	}

	public void setHtkh(String htkh) {
		this.htkh = htkh;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sbbh", length = 100)
	public String getSbbh() {
		return this.sbbh;
	}

	public void setSbbh(String sbbh) {
		this.sbbh = sbbh;
	}

	@Column(name = "sbxh", length = 100)
	public String getSbxh() {
		return this.sbxh;
	}

	public void setSbxh(String sbxh) {
		this.sbxh = sbxh;
	}

	@Column(name = "sbzt", length = 100)
	public String getSbzt() {
		return this.sbzt;
	}

	public void setSbzt(String sbzt) {
		this.sbzt = sbzt;
	}

	@Column(name = "wz", length = 100)
	public String getWz() {
		return this.wz;
	}

	public void setWz(String wz) {
		this.wz = wz;
	}

	@Column(name = "yh", length = 100)
	public String getYh() {
		return this.yh;
	}

	public void setYh(String yh) {
		this.yh = yh;
	}

	@Column(name = "jb", length = 100)
	public String getJb() {
		return this.jb;
	}

	public void setJb(String jb) {
		this.jb = jb;
	}

	@Column(name = "sbsl", length = 100)
	public String getSbsl() {
		return this.sbsl;
	}

	public void setSbsl(String sbsl) {
		this.sbsl = sbsl;
	}

	@Column(name = "sbzt1", length = 100)
	public String getSbzt1() {
		return this.sbzt1;
	}

	public void setSbzt1(String sbzt1) {
		this.sbzt1 = sbzt1;
	}
	
	@Column(name = "sbzt0", length = 100)
	public String getSbzt0() {
		return this.sbzt0;
	}

	public void setSbzt0(String sbzt0) {
		this.sbzt0 = sbzt0;
	}

	@Column(name = "wd", length = 100)
	public String getWd() {
		return this.wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

}