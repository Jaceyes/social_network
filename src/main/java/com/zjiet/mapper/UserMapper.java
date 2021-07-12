package com.zjiet.mapper;

import com.zjiet.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-25
 */
public interface UserMapper extends BaseMapper<User> {
    public List<User> findAllUser();
    public int insertUser(User user);
    public User findByUsername(String usernmae);
    public int deleteUser(int userid);
    public int updateUser(User user);
    public User findByUserid(int userid);
}
