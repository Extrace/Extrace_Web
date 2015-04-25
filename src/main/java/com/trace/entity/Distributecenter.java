package com.trace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="distributecenter")
public class Distributecenter {

	private int sn;
	private String expresssheetid;
	private String packageid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	
	@Column(name="expresssheetid")
	public String getExpresssheetid() {
		return expresssheetid;
	}
	public void setExpresssheetid(String expresssheetid) {
		this.expresssheetid = expresssheetid;
	}
	
	@Column(name="packageid")
	public String getPackageid() {
		return packageid;
	}
	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}
	
	
	
}
