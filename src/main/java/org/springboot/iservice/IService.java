package org.springboot.iservice;

import org.springboot.model.Blog;

import java.util.List;

/**
 * @author ：Ma Liang
 * @date ：Created in 2019/7/12 0:33
 * @description：service接口
 */

public interface IService {
    
    /**
     * @author Ma Liang
     * @date 2019-07-12 00:39
     * @param null
     * @return 
     * @throws 
     * @since 
    */
    List<Blog> getAlBlog();
}
