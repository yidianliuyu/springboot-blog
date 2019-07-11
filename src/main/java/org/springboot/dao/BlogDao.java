package org.springboot.dao;

import org.springboot.model.Blog;

import java.util.List;

/**
*@author     ：Ma Liang
*@date       ：Created in 2019/7/12 0:30
*@description：博客数据访问接口
*/

public interface BlogDao {
    
    /**
     * @author Ma Liang
     * @date 2019-07-12 00:37
     * @param null
     * @return 所有博客数据
     * @throws 
     * @since 
    */
    List<Blog> getAllBlog();
}
