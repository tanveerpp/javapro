package com.example.demo.beans;

public class Project {
private int pid;
private String pname;
private String teamname;
private String details;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}

public Project(int pid, String pname, String teamname, String details) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.teamname = teamname;
	this.details = details;
}

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
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
}
