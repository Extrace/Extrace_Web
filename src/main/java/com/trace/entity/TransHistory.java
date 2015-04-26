package com.trace.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="transhistory")
public class TransHistory {
	private int sn;
	private String packageid;
	private Date acttime;
	private int poscode;
	private int uidfrom;
	private int uidto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	
	@Column(name="packageid")
	public String getPackageid() {
		return packageid;
	}
	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}
	
	@Column(name="acttime")
	public Date getActtime() {
		return acttime;
	}
	public void setActtime(Date acttime) {
		this.acttime = acttime;
	}
	
	@Column(name="poscode")
	public int getPoscode() {
		return poscode;
	}
	public void setPoscode(int poscode) {
		this.poscode = poscode;
	}
	
	@Column(name="uidfrom")
	public int getUidfrom() {
		return uidfrom;
	}
	public void setUidfrom(int uidfrom) {
		this.uidfrom = uidfrom;
	}
	
	@Column(name="uidto")
	public int getUidto() {
		return uidto;
	}
	public void setUidto(int uidto) {
		this.uidto = uidto;
	}
	
	
}
