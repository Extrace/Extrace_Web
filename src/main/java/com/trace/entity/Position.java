package com.trace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="position")
public class Position {
	private int poscode;
	private float x;
	private float y;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getPoscode() {
		return poscode;
	}
	public void setPoscode(int poscode) {
		this.poscode = poscode;
	}
	
	@Column(name="x")
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	@Column(name="y")
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
}
