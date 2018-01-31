package com.mysoft.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Resultentryone entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Resultentryone implements java.io.Serializable {

	// Fields

	private Integer resultentry1id;
	private String bxjzrq;
	private String dsysrq;
	private String dz;
	private String fgsb;
	private String fgsbbh;
	private String fhrq;
	private String glsl;
	private String kdsl;
	private String sbbh;
	private String sblb;
	private String sbqq;
	private String sbxh;
	private String wblx;
	private String yh;
	private String zxhtbh;
	private String zxqdhtny;
	private String zxqdhtrq;
	private String zxqdhtrq0;
	private String zzgc;

	// Constructors

	/** default constructor */
	public Resultentryone() {
	}

	/** full constructor */
	public Resultentryone(String sbbh, String sblb, String sbqq, String sbxh, String wblx, String yh, String zxhtbh, String zxqdhtny, String zxqdhtrq, String zxqdhtrq0, String zzgc) {
		this.sbbh = sbbh;
		this.sblb = sblb;
		this.sbqq = sbqq;
		this.sbxh = sbxh;
		this.wblx = wblx;
		this.yh = yh;
		this.zxhtbh = zxhtbh;
		this.zxqdhtny = zxqdhtny;
		this.zxqdhtrq = zxqdhtrq;
		this.zxqdhtrq0 = zxqdhtrq0;
		this.zzgc = zzgc;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "resultentry1id", unique = true, nullable = false)
	public Integer getResultentry1id() {
		return this.resultentry1id;
	}

	public void setResultentry1id(Integer resultentry1id) {
		this.resultentry1id = resultentry1id;
	}
	@Column(name = "bxjzrq", length = 100)
	public String getBxjzrq() {
		return bxjzrq;
	}

	public void setBxjzrq(String bxjzrq) {
		this.bxjzrq = bxjzrq;
	}

	@Column(name = "dsysrq", length = 100)
	public String getDsysrq() {
		return dsysrq;
	}

	public void setDsysrq(String dsysrq) {
		this.dsysrq = dsysrq;
	}

	@Column(name = "dz", length = 100)
	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	@Column(name = "fgsb", length = 100)
	public String getFgsb() {
		return fgsb;
	}

	public void setFgsb(String fgsb) {
		this.fgsb = fgsb;
	}

	@Column(name = "fgsbbh", length = 100)
	public String getFgsbbh() {
		return fgsbbh;
	}

	public void setFgsbbh(String fgsbbh) {
		this.fgsbbh = fgsbbh;
	}

	@Column(name = "fhrq", length = 100)
	public String getFhrq() {
		return fhrq;
	}

	public void setFhrq(String fhrq) {
		this.fhrq = fhrq;
	}

	@Column(name = "glsl", length = 100)
	public String getGlsl() {
		return glsl;
	}

	public void setGlsl(String glsl) {
		this.glsl = glsl;
	}

	@Column(name = "kdsl", length = 100)
	public String getKdsl() {
		return kdsl;
	}

	public void setKdsl(String kdsl) {
		this.kdsl = kdsl;
	}
	@Column(name = "sbbh", length = 100)
	public String getSbbh() {
		return this.sbbh;
	}

	public void setSbbh(String sbbh) {
		this.sbbh = sbbh;
	}

	@Column(name = "sblb", length = 100)
	public String getSblb() {
		return this.sblb;
	}

	public void setSblb(String sblb) {
		this.sblb = sblb;
	}

	@Column(name = "sbqq", length = 100)
	public String getSbqq() {
		return this.sbqq;
	}

	public void setSbqq(String sbqq) {
		this.sbqq = sbqq;
	}

	@Column(name = "sbxh", length = 100)
	public String getSbxh() {
		return this.sbxh;
	}

	public void setSbxh(String sbxh) {
		this.sbxh = sbxh;
	}

	@Column(name = "wblx", length = 100)
	public String getWblx() {
		return this.wblx;
	}

	public void setWblx(String wblx) {
		this.wblx = wblx;
	}

	@Column(name = "yh", length = 100)
	public String getYh() {
		return this.yh;
	}

	public void setYh(String yh) {
		this.yh = yh;
	}

	@Column(name = "zxhtbh", length = 100)
	public String getZxhtbh() {
		return this.zxhtbh;
	}

	public void setZxhtbh(String zxhtbh) {
		this.zxhtbh = zxhtbh;
	}

	@Column(name = "zxqdhtny", length = 100)
	public String getZxqdhtny() {
		return this.zxqdhtny;
	}

	public void setZxqdhtny(String zxqdhtny) {
		this.zxqdhtny = zxqdhtny;
	}

	@Column(name = "zxqdhtrq", length = 100)
	public String getZxqdhtrq() {
		return this.zxqdhtrq;
	}

	public void setZxqdhtrq(String zxqdhtrq) {
		this.zxqdhtrq = zxqdhtrq;
	}

	@Column(name = "zxqdhtrq0", length = 100)
	public String getZxqdhtrq0() {
		return this.zxqdhtrq0;
	}

	public void setZxqdhtrq0(String zxqdhtrq0) {
		this.zxqdhtrq0 = zxqdhtrq0;
	}

	@Column(name = "zzgc", length = 100)
	public String getZzgc() {
		return this.zzgc;
	}

	public void setZzgc(String zzgc) {
		this.zzgc = zzgc;
	}

}