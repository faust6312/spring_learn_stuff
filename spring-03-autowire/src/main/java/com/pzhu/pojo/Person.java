package com.pzhu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
//@Autowired
//	public  Dog dog;
//@Autowired
//	public Cat cat;

	public String name;

//	public Dog getDog() {
//		return dog;
//	}
//
//	public void setDog(Dog dog) {
//		this.dog = dog;
//	}
//
//	public Cat getCat() {
//		return cat;
//	}
//
//	public void setCat(Cat cat) {
//		this.cat = cat;
//	}
//
//	public String getName() {
//		return name;
//	}
@Value("FAUST")
	public void setName(String name) {
		this.name = name;
	}
//
//	@Override
//	public String toString() {
//		return "Person{" +
//				"dog=" + dog +
//				", cat=" + cat +
//				", name='" + name + '\'' +
//				'}';
//	}
}
