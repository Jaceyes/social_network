package com.zjiet.controller;


import com.zjiet.entity.Photo;
import com.zjiet.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-30
 */
@RestController
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private IPhotoService dao;
    @RequestMapping("/insertPhoto")
    public int insertPhoto(@RequestBody Photo photo){
        return dao.insertPhoto(photo);
    }
    @RequestMapping("/findAllPhoto")
    public List<Photo> findAllPhoto(){
        return dao.findAllPhoto();
    }
    @RequestMapping("/findByUsername")
    public List<Photo> findByUsername(@RequestBody Photo photo){
        return dao.findByUsername(photo.getUsername());
    }

}
