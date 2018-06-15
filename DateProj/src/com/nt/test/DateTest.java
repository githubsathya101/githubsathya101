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
     System.out.println("1st object");
     System.out.println(e.getEid());
     System.out.println(e.getEname());
     System.out.println(e.getSalary());
     System.out.println();
     System.out.println("2nd Object");
     Employee e1=new Employee(102,"sathyadev2",100000);
     //2nd object
     System.out.println(e1.getEid());
     System.out.println(e1.getEname());
     System.out.println(e1.getSalary());
	}

}
