package com.pzhu.service;

import com.pzhu.dao.UserDao;
import com.pzhu.dao.UserDaoImpl;
import com.pzhu.dao.UserDaoMySqlImpl;

public class UserServiceImpl  implements UserService{
private UserDao userDao;
	// 利用set实现
 public void setUserDao(UserDao userDao) {
 this.userDao= userDao;
  }
  @Override
  public void getUser() {
    userDao.getUser();
 }


}
