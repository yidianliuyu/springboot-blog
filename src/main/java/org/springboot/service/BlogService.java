package org.springboot.service;

import org.springboot.dao.BlogDao;
import org.springboot.iservice.IService;
import org.springboot.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Ma Liang
 * @date ：Created in 2019/7/12 0:34
 * @description：博客服务类
 * @modified By：
 * @version: v1.0$
 */
@Service
public class BlogService implements IService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> getAlBlog() {
        return blogDao.getAllBlog();
    }
}
