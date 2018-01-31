package com.mysoft.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Resultentrytwo entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Resultentrytwo implements java.io.Serializable {

	// Fields

	private Integer resultentry2id;
	private String fgsb;
	private String djh;
	private String hfbz;
	private String hfr;
	private String hfrq;
	private String hfsl;
	private String jd;
	private String jylx;
	private String nd;
	private String sbbm;
	private String sbdz;
	private String sblb;
	private String sblx;
	private String sbn;
	private String sbw;
	private String sbxh;
	private String sbyh;
	private String sbztbm;
	private String sbztmc;
	private String wd;
	private String zzgc;

	// Constructors

	/** default constructor */
	public Resultentrytwo() {
	}

	/** full constructor */
	public Resultentrytwo(String sbdz, String sblb, String sblx, String sbn, String sbw, String sbxh, String sbyh, String sbztbm, String sbztmc, String wd, String zzgc) {
		this.sbdz = sbdz;
		this.sblb = sblb;
		this.sblx = sblx;
		this.sbn = sbn;
		this.sbw = sbw;
		this.sbxh = sbxh;
		this.sbyh = sbyh;
		this.sbztbm = sbztbm;
		this.sbztmc = sbztmc;
		this.wd = wd;
		this.zzgc = zzgc;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "resultentry2id", unique = true, nullable = false)
	public Integer getResultentry2id() {
		return this.resultentry2id;
	}

	public void setResultentry2id(Integer resultentry2id) {
		this.resultentry2id = resultentry2id;
	}
	@Column(name = "fgsb", length = 100)
	public String getFgsb() {
		return fgsb;
	}

	public void setFgsb(String fgsb) {
		this.fgsb = fgsb;
	}

	@Column(name = "djh", length = 100)
	public String getDjh() {
		return djh;
	}

	public void setDjh(String djh) {
		this.djh = djh;
	}

	@Column(name = "hfbz", length = 100)
	public String getHfbz() {
		return hfbz;
	}

	public void setHfbz(String hfbz) {
		this.hfbz = hfbz;
	}

	@Column(name = "hfr", length = 100)
	public String getHfr() {
		return hfr;
	}

	public void setHfr(String hfr) {
		this.hfr = hfr;
	}

	@Column(name = "hfrq", length = 100)
	public String getHfrq() {
		return hfrq;
	}

	public void setHfrq(String hfrq) {
		this.hfrq = hfrq;
	}

	@Column(name = "hfsl", length = 100)
	public String getHfsl() {
		return hfsl;
	}

	public void setHfsl(String hfsl) {
		this.hfsl = hfsl;
	}

	@Column(name = "jd", length = 100)
	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	@Column(name = "jylx", length = 100)
	public String getJylx() {
		return jylx;
	}

	public void setJylx(String jylx) {
		this.jylx = jylx;
	}

	@Column(name = "nd", length = 100)
	public String getNd() {
		return nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	@Column(name = "sbbm", length = 100)
	public String getSbbm() {
		return sbbm;
	}

	public void setSbbm(String sbbm) {
		this.sbbm = sbbm;
	}
	@Column(name = "sbdz", length = 100)
	public String getSbdz() {
		return this.sbdz;
	}

	public void setSbdz(String sbdz) {
		this.sbdz = sbdz;
	}

	@Column(name = "sblb", length = 100)
	public String getSblb() {
		return this.sblb;
	}

	public void setSblb(String sblb) {
		this.sblb = sblb;
	}

	@Column(name = "sblx", length = 100)
	public String getSblx() {
		return this.sblx;
	}

	public void setSblx(String sblx) {
		this.sblx = sblx;
	}

	@Column(name = "sbn", length = 100)
	public String getSbn() {
		return this.sbn;
	}

	public void setSbn(String sbn) {
		this.sbn = sbn;
	}

	@Column(name = "sbw", length = 100)
	public String getSbw() {
		return this.sbw;
	}

	public void setSbw(String sbw) {
		this.sbw = sbw;
	}

	@Column(name = "sbxh", length = 100)
	public String getSbxh() {
		return this.sbxh;
	}

	public void setSbxh(String sbxh) {
		this.sbxh = sbxh;
	}

	@Column(name = "sbyh", length = 100)
	public String getSbyh() {
		return this.sbyh;
	}

	public void setSbyh(String sbyh) {
		this.sbyh = sbyh;
	}

	@Column(name = "sbztbm", length = 100)
	public String getSbztbm() {
		return this.sbztbm;
	}

	public void setSbztbm(String sbztbm) {
		this.sbztbm = sbztbm;
	}

	@Column(name = "sbztmc", length = 100)
	public String getSbztmc() {
		return this.sbztmc;
	}

	public void setSbztmc(String sbztmc) {
		this.sbztmc = sbztmc;
	}

	@Column(name = "wd", length = 100)
	public String getWd() {
		return this.wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	@Column(name = "zzgc", length = 100)
	public String getZzgc() {
		return this.zzgc;
	}

	public void setZzgc(String zzgc) {
		this.zzgc = zzgc;
	}

}