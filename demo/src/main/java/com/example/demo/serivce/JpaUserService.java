package com.example.demo.serivce;

import com.example.demo.dao.jdbc.UserDao;
import com.example.demo.dao.jpa.JpaUserDao;
import com.example.demo.model.JpaUser;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jcb
 * @version : UserService, v 0.1 2019/5/30 16:58 jcb Exp$
 * @Description:
 */
@Service
public class JpaUserService {


    @Autowired
    JpaUserDao userDao;

    public JpaUser add(JpaUser user){
      return   userDao.save(user);
    }

    public JpaUser update(JpaUser user){
        return   userDao.save(user);
    }

    public JpaUser getById(long id){
        return   userDao.findById(id).get();
    }
}
