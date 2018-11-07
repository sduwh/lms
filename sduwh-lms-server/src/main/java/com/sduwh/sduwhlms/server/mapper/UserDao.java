package com.sduwh.sduwhlms.server.mapper;

import com.sduwh.sduwhlms.server.domain.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
  @Select("select * from users where id = #{id}")
  @Results({
    @Result(
        column = "gender",
        property = "gender",
        typeHandler = org.apache.ibatis.type.EnumOrdinalTypeHandler.class)
  })
  User findUserById(Long id);

  @Select("select * from users where name = #{username}")
  @Results({
    @Result(
        column = "gender",
        property = "gender",
        typeHandler = org.apache.ibatis.type.EnumOrdinalTypeHandler.class)
  })
  User findUserByUsername(@Param("username") String username);
}
