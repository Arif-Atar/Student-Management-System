package com.example.Project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Student {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int PRN_No;
	private int Roll_No;
	private String Name;
	private String Standard;
	
	public int getPRN_No() {
		return PRN_No;
	}
	public void setPRN_No(int pRN_No) {
		PRN_No = pRN_No;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
	}
	@Override
	public String toString() {
		return "Student [PRN_No=" + PRN_No + ", Roll_No=" + Roll_No + ", Name=" + Name + ", Standard=" + Standard + "]";
	}
	

}
