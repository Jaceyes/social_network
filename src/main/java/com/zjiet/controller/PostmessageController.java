package com.zjiet.controller;


import com.zjiet.entity.Postmessage;
import com.zjiet.service.IPostmessageService;
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
 * @since 2021-06-29
 */
@RestController
@RequestMapping("/postmessage")
public class PostmessageController {
    @Autowired
    private IPostmessageService dao;
    @RequestMapping("/findAllPostmessage")
    public List<Postmessage> findAllPostmessage(){
        return dao.findAllPostmessage();
    }
    @RequestMapping("/insertPostmessage")
    public int insertPostmessage(@RequestBody Postmessage postmessage){
        return dao.insertPostmessage(postmessage);
    }
    @RequestMapping("/deletePostmessage")
    public int deletePostmessage(@RequestBody Postmessage postmessage){
        return dao.deletePostmessage(postmessage.getPostmessageid());
    }
    @RequestMapping("/addlikenum")
    public int addlikenum(@RequestBody Postmessage postmessage){
        int id=dao.findByUsername(postmessage.getUsername());
        return dao.addlikenum(id);
    }
    @RequestMapping("/addsharenum")
    public int addsharenum(@RequestBody Postmessage postmessage){
        int id=dao.findByUsername(postmessage.getUsername());
        return dao.addsharenum(id);
    }
}
