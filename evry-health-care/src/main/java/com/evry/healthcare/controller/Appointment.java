package com.evry.healthcare.controller;

public class Appointment {
private int pid;
private String name;
private int age;
private String blood_group;
private String checkup;
private String doctor;
private String tests;

public Appointment() {
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBlood_group() {
	return blood_group;
}
public void setBlood_group(String blood_group) {
	this.blood_group = blood_group;
}
public String getCheckup() {
	return checkup;
}
public void setCheckup(String checkup) {
	this.checkup = checkup;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
public String getTests() {
	return tests;
}
public void setTests(String tests) {
	this.tests = tests;
}

}
