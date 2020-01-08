package com.sxd.web;

import com.sxd.pojo.User;
import com.sxd.service.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user")
    public List<User> query(){
        List<User> users=userService.query();
        System.out.println(users);
        return users;
    }

}
