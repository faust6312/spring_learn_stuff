package com.pzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
@Data

public class User {
	private int id; //id
	private String username;  //姓名
	private String password; //密码

}
