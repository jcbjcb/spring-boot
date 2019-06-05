package com.example.demo.dao.mybatis;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jcb
 * @version : UserMapper, v 0.1 2019/5/31 16:03 jcb Exp$
 * @Description:
 */
@Mapper
public interface UserMapper  {

    User findUserById(Long id);

    int add(User user);

    int update(User user);
}
