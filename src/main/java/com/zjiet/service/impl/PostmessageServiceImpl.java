package com.zjiet.service.impl;

import com.zjiet.entity.Postmessage;
import com.zjiet.mapper.PostmessageMapper;
import com.zjiet.service.IPostmessageService;
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
 * @since 2021-06-29
 */
@Service
public class PostmessageServiceImpl extends ServiceImpl<PostmessageMapper, Postmessage> implements IPostmessageService {
    @Autowired
    private PostmessageMapper postmessageMapper;
    @Override
    public List<Postmessage> findAllPostmessage(){
        return postmessageMapper.findAllPostmessage();
    }

    @Override
    public int insertPostmessage(Postmessage postmessage) {
        return postmessageMapper.insertPostmessage(postmessage);
    }

    @Override
    public int deletePostmessage(int postmessageid) {
        return postmessageMapper.deletePostmessage(postmessageid);
    }

    @Override
    public int addlikenum(int postmessageid) {
        return postmessageMapper.addlikenum(postmessageid);
    }

    @Override
    public int addsharenum(int postmessageid) {
        return postmessageMapper.addsharenum(postmessageid);
    }

    @Override
    public int findByUsername(String username) {
        return postmessageMapper.findByUsername(username);
    }
}
