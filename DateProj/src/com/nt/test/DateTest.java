package com.nt.test;

import java.util.Date;

import com.nt.domain.Employee;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("sathya");
		e.setSalary(100000);
     System.out.println("my GITHUB project created on:  "+new Date());
     System.out.println(e.getEid());
     System.out.println(e.getEname());
     System.out.println(e.getSalary());
	}

}
