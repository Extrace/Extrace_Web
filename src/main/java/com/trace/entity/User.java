package com.trace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	private int id;
	private String uname;
	private String password;
	private int role;
	private String telcode;
	private int status;
	private String dptid;
	private String receivepid;
	private String deliverpid;
	private String transpid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="uname")
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="role")
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	@Column(name="telcode")
	public String getTelcode() {
		return telcode;
	}
	public void setTelcode(String telcode) {
		this.telcode = telcode;
	}
	
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column(name="dptid")
	public String getDptid() {
		return dptid;
	}
	public void setDptid(String dptid) {
		this.dptid = dptid;
	}
	
	@Column(name="receivepid")
	public String getReceivepid() {
		return receivepid;
	}
	public void setReceivepid(String receivepid) {
		this.receivepid = receivepid;
	}
	
	@Column(name="deliverpid")
	public String getDeliverpid() {
		return deliverpid;
	}
	public void setDeliverpid(String deliverpid) {
		this.deliverpid = deliverpid;
	}
	
	@Column(name="transpid")
	public String getTranspid() {
		return transpid;
	}
	public void setTranspid(String transpid) {
		this.transpid = transpid;
	}
	
	
	
}
