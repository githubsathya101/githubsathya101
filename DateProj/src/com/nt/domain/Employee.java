package com.nt.domain;

public class Employee {
      private int eid;
      private String ename;
      private int salary;
      public Employee(){
    	  System.out.println("0-param");
      }
      public Employee(int eid,String ename,int salary){
    	  System.out.println("3-param");
    	  this.eid=eid;
    	  this.ename=ename;
    	  this.salary=salary;
      }
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
