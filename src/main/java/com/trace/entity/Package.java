package com.trace.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class Package {
	
	private String id;
	private String sourcenode;
	private String targetnode;
	private Date createtime;
	private int status;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="sourcenode")
	public String getSourcenode() {
		return sourcenode;
	}
	public void setSourcenode(String sourcenode) {
		this.sourcenode = sourcenode;
	}
	
	@Column(name="targetnode")
	public String getTargetnode() {
		return targetnode;
	}
	public void setTargetnode(String targetnode) {
		this.targetnode = targetnode;
	}
	
	@Column(name="createtime")
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
