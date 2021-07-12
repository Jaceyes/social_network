package com.zjiet.mapper;

import com.zjiet.entity.Postmessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-29
 */
public interface PostmessageMapper extends BaseMapper<Postmessage> {
    public List<Postmessage> findAllPostmessage();
    public int insertPostmessage(Postmessage postmessage);
    public int deletePostmessage(int postmessageid);
    public int addlikenum(int postmessageid);
    public int addsharenum(int postmessageid);
    public int findByUsername(String username);
}
