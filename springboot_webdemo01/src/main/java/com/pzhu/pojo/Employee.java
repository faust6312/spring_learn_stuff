package com.pzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data

@NoArgsConstructor
public class Employee {
private Integer id;
private String lastName;
private  String email;
private  Integer gender;//0-->woman;1-->man

private  Department department;
	private Date birth;

	public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
		//默认日期实现
		this.birth = new Date();
	}
}
