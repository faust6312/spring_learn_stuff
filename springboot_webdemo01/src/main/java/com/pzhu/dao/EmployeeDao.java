package com.pzhu.dao;

import com.pzhu.pojo.Department;
import com.pzhu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
	private static Map<Integer, Employee> employees = null;
@Autowired
	private  DepartmentDao departmentDao;
	static {

		employees = new HashMap<Integer, Employee>();
		employees.put(1001,new Employee(1001,"AA","A3429418868@qq.com",0,new Department(101,"教学部")));
		employees.put(1002,new Employee(1002,"BB","B3429418868@qq.com",1,new Department(102,"市场部")));
		employees.put(1003,new Employee(1003,"CC","C3429418868@qq.com",0,new Department(103,"教研部")));
		employees.put(1004,new Employee(1004,"DD","D3429418868@qq.com",1,new Department(104,"运营部")));
		employees.put(1005,new Employee(1005,"EE","E3429418868@qq.com",0,new Department(105,"后勤部")));

	}
	//增加一个员工
	private static  Integer initId = 1006;
public void save(Employee employee){
		if(employee.getId()==null){
			employee.setId(initId++);
		}
employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
		employees.put(employee.getId(),employee);

}

//查询全部员工信息
	public Collection<Employee> getAll(){
	return employees.values();
	}
	//查询ById
	public Employee getEmployeeById(Integer id){
	return employees.get(id);
	}
	//删除员工ById
	public void delete(Integer id){
	employees.remove(id);

	}

}
