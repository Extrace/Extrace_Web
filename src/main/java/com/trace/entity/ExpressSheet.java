package com.trace.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expresssheet")
public class ExpressSheet {
	private String id;
	private int expresstype;
	private int sender;
	private int receiver;
	private float weight;
	private float transcost;
	private float packagecost;
	private float insurcost;
	private String accepter;
	private String deliver;
	private Date acceptetime;
	private Date delivetime;
	private String acc1;
	private String acc2;
	private int status;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="expresstype")
	public int getExpresstype() {
		return expresstype;
	}
	public void setExpresstype(int expresstype) {
		this.expresstype = expresstype;
	}
	
	@Column(name="sender")
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	
	@Column(name="receiver")
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	
	@Column(name="weight")
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Column(name="transcost")
	public float getTranscost() {
		return transcost;
	}
	public void setTranscost(float transcost) {
		this.transcost = transcost;
	}
	
	@Column(name="packagecost")
	public float getPackagecost() {
		return packagecost;
	}
	public void setPackagecost(float packagecost) {
		this.packagecost = packagecost;
	}
	
	@Column(name="insurcost")
	public float getInsurcost() {
		return insurcost;
	}
	public void setInsurcost(float insurcost) {
		this.insurcost = insurcost;
	}
	
	@Column(name="accepter")
	public String getAccepter() {
		return accepter;
	}
	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}
	
	@Column(name="deliver")
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	
	@Column(name="acceptetime")
	public Date getAcceptetime() {
		return acceptetime;
	}
	public void setAcceptetime(Date acceptetime) {
		this.acceptetime = acceptetime;
	}
	
	@Column(name="delivetime")
	public Date getDelivetime() {
		return delivetime;
	}
	public void setDelivetime(Date delivetime) {
		this.delivetime = delivetime;
	}
	
	@Column(name="acc1")
	public String getAcc1() {
		return acc1;
	}
	public void setAcc1(String acc1) {
		this.acc1 = acc1;
	}
	
	@Column(name="acc2")
	public String getAcc2() {
		return acc2;
	}
	public void setAcc2(String acc2) {
		this.acc2 = acc2;
	}
	
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
