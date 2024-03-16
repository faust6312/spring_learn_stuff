package com.pzhu.config;

import com.pzhu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyConfig2.class)//这个注解相当于自动装配，让A-bean能间接引用到B-bean(自我理解)
@Configuration//相当于xml配置中的beans.xml(自我理解)
public class MyConfig {
	@Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
  public User user(){
 return new User();//返回要注入到Bean的对象
  }

}
