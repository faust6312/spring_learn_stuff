package com.pzhu.config;

import com.pzhu.pojo.User;
import org.springframework.context.annotation.Bean;

public class MyConfig2 {
	@Bean() //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
	public User user2(){
		return new User();
	}
}
