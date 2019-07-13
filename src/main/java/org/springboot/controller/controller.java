package org.springboot.controller;

import org.springboot.iservice.IService;
import org.springboot.model.Blog;
import org.springboot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myblog/v1")
public class controller {

    @Autowired
    private IService service;

    @RequestMapping("/hello")
    @ResponseBody
    public String syaHello()
    {
        return "Hello, welcome to my blog!";
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Blog> getAllBlog()
    {
        return service.getAlBlog();
    }
}
