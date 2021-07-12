package com.zjiet.service.impl;

import com.zjiet.entity.Photo;
import com.zjiet.mapper.PhotoMapper;
import com.zjiet.service.IPhotoService;
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
 * @since 2021-06-30
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo> implements IPhotoService {
    @Autowired
    private IPhotoService iPhotoService;
    @Override
    public int insertPhoto(Photo photo) {
        return iPhotoService.insertPhoto(photo);
    }

    @Override
    public List<Photo> findAllPhoto() {
        return iPhotoService.findAllPhoto();
    }

    @Override
    public List<Photo> findByUsername(String username) {
        return iPhotoService.findByUsername(username);
    }
}
