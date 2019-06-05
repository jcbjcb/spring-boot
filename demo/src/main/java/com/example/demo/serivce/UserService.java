package com.example.demo.serivce;

import com.example.demo.dao.jdbc.UserDao;
import com.example.demo.dao.jpa.JpaUserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jcb
 * @version : UserService, v 0.1 2019/5/30 16:58 jcb Exp$
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public int add(User user){
      return   userDao.save(user);
    }

    public int update(User user){
        return   userDao.update(user);
    }

    public User getById(long id){
        return   userDao.getUserById(id);
    }
}
