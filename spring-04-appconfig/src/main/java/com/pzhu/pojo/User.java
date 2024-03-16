package com.pzhu.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
	public String name;

	public String getName() {
		return name;
	}
@Value("faust")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
