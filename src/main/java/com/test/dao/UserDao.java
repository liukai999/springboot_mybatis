package com.test.dao;

import com.test.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {
    @Select("select name,address from user where name =#{name} and pwd = #{password}")
    User getUser(@Param("name") String name , @Param("password") String password);
}
