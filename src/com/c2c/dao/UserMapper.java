package com.c2c.dao;

import com.c2c.pojo.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User getUserByPhone(String phone);// 通过手机号查询用户

	int updateGoodsNum(@Param("id") Integer id, @Param("goodsNum") Integer goodsNum);// 更改用户的商品数量

	public List<User> getUserList();

	String getUserNameById(Integer id);

	public List<User> getUserLists(String keyword, int currentPage, int pageSize);
	
	int getKeywordCount(String keyword);

}