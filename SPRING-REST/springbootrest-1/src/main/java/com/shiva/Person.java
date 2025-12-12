package com.shiva;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private int ppoints;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPpoints() {
		return ppoints;
	}
	public void setPpoints(int ppoints) {
		this.ppoints = ppoints;
	}
}
