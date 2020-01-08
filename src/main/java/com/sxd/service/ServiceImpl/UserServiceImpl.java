package com.sxd.service.ServiceImpl;

import com.sxd.mapper.UserMapper;
import com.sxd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public List<User> query() {
        return userMapper.selectAll();
    }
}
