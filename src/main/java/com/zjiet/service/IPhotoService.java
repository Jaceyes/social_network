package com.zjiet.service;

import com.zjiet.entity.Photo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-30
 */
public interface IPhotoService extends IService<Photo> {
    public int insertPhoto(Photo photo);
    public List<Photo> findAllPhoto();
    public List<Photo> findByUsername(String username);
}
