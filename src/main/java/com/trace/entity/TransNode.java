package com.trace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transnode")
public class TransNode {
	private String id;
	private String nodename;
	private int nodetype;
	private String regioncode;
	private int poscode;
	private String telcode;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="nodename")
	public String getNodename() {
		return nodename;
	}
	public void setNodename(String nodename) {
		this.nodename = nodename;
	}
	
	@Column(name="nodetype")
	public int getNodetype() {
		return nodetype;
	}
	public void setNodetype(int nodetype) {
		this.nodetype = nodetype;
	}
	
	@Column(name="regioncode")
	public String getRegioncode() {
		return regioncode;
	}
	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}
	
	@Column(name="poscode")
	public int getPoscode() {
		return poscode;
	}
	public void setPoscode(int poscode) {
		this.poscode = poscode;
	}
	
	@Column(name="telcode")
	public String getTelcode() {
		return telcode;
	}
	public void setTelcode(String telcode) {
		this.telcode = telcode;
	}
	
	
	
}
