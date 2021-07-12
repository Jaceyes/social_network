package com.zjiet.service;

import com.zjiet.entity.Postmessage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-29
 */
public interface IPostmessageService extends IService<Postmessage> {
    public List<Postmessage> findAllPostmessage();
    public int insertPostmessage(Postmessage postmessage);
    public int deletePostmessage(int postmessageid);
    public int addlikenum(int postmessageid);
    public int addsharenum(int postmessageid);
    public int findByUsername(String username);
}
