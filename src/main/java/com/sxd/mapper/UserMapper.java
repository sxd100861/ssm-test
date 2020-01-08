package com.sxd.mapper;

import com.sxd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {
    @Select("select * from tb_user")
    List<User> selectAll();
}
