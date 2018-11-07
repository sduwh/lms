package com.sduwh.sduwhlms.server.mapper;

import com.sduwh.sduwhlms.server.domain.Pseudonym;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface PseudonymsDao {
  @Select("select * from pseudonyms where user_name = #{username}")
  @Results({
    @Result(
        column = "user_id",
        property = "user",
        one = @One(select = "com.sduwh.sduwhlms.server.mapper.UserDao.findUserById"))
  })
  Pseudonym findUserByName(@Param("username") String username);
}
