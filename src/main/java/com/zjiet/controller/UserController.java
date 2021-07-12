package com.zjiet.controller;


import com.zjiet.entity.User;
import com.zjiet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-25
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/findByUsername")
    public User findByUsername(@Validated @RequestBody User user){
        return userService.findByUsername(user.getUsername());
    }
    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
    @RequestMapping(value = "/insertUser")
    public int insertUser(@Validated @RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return userService.insertUser(user.getUsername(),user.getPassword(), user.getEmail());
    }
    @RequestMapping("/findByUserid")
    public User findByUserid(@RequestBody User user){
        return userService.findByUserid(user.getUserid());
    }
    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @RequestMapping("/deleteUser")
    public int deleteUser(@RequestBody User user){
        return userService.deleteUser(user.getUserid());
    }
}
