package com.zjiet.mapper;

import com.zjiet.entity.Photo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-30
 */
public interface PhotoMapper extends BaseMapper<Photo> {
    public int insertPhoto(Photo photo);
    public List<Photo> findAllPhoto();
    public List<Photo> findByUsername(String username);
}
