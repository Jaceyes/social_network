package com.zjiet.service;

import com.zjiet.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-25
 */
@Service
public interface IUserService extends IService<User> {
    public List<User> findAllUser();
    public int insertUser(String username,String password,String email);
    public User findByUsername(String usernmae);
    public User findByUserid(int userid);
    public int updateUser(User user);
    public int deleteUser(int userid);
}
