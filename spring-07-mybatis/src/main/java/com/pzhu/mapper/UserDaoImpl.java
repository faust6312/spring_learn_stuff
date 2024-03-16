package com.pzhu.mapper;

import com.pzhu.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserMapper {
	//sqlSession不用我们自己创建了，Spring来管理
 private SqlSessionTemplate sqlSession;
 public void setSqlSession(SqlSessionTemplate sqlSession) {
  this.sqlSession = sqlSession;
 }
 public List<User> selectUser() {
 UserMapper mapper = sqlSession.getMapper(UserMapper.class);
 return mapper.selectUser();
 }

}
