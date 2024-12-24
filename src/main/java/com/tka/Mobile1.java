package com.tka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile1{
	@Id
	private int mobid;
	private String brandname;
	double salaray;
	public Mobile1(int mobid,String brandname, double salaray) {
		super();
		this.mobid=mobid;
		this.brandname = brandname;
		this.salaray = salaray;
	}
	public Mobile1(String brandname, double salaray) {
		super();
		this.brandname = brandname;
		this.salaray = salaray;
	}
	
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public double getSalaray() {
		return salaray;
	}
	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}
	public Mobile1() {
		super();
	}
	@Override
	public String toString() {
		return "Mobile1 [mobid=" + mobid + ", brandname=" + brandname + ", salaray=" + salaray + "]";
	}

}
