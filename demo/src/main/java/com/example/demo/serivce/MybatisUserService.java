package com.example.demo.serivce;

import com.example.demo.dao.jdbc.UserDao;
import com.example.demo.dao.mybatis.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author jcb
 * @version : UserService, v 0.1 2019/5/30 16:58 jcb Exp$
 * @Description:
 */
@Service
public class MybatisUserService {

    @Autowired
    UserMapper userDao;


    public int add(User user){
      return   userDao.add(user);
    }

    public int update(User user){
        return   userDao.update(user);
    }

    @Cacheable(value = "user-key")
    public User getById(long id){
        System.out.println("从数据库获取数据");
        return   userDao.findUserById(id);
    }
}
