package com.zjiet.service.impl;

import com.zjiet.entity.User;
import com.zjiet.mapper.UserMapper;
import com.zjiet.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int insertUser(String username,String password,String email) {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        return userMapper.insertUser(user);
    }

    @Override
    public User findByUsername(String usernmae){
        return userMapper.findByUsername(usernmae);
    }

    @Override
    public User findByUserid(int userid) {
        return userMapper.findByUserid(userid);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int userid) {
        return userMapper.deleteUser(userid);
    }
}
