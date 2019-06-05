package com.example.demo.dao.jdbc;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jcb
 * @version : UserDao, v 0.1 2019/5/30 17:03 jcb Exp$
 * @Description: jdbcTemplate 操作数据库
 */
@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public  User getUserById(long id){
        List<User> list = jdbcTemplate.query("select * from user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            User account = list.get(0);
            return account;
        }else{
            return null;
        }
    }


    public  int save(User user){
        return jdbcTemplate.update("insert  into user (id,name,age,sex) values (?,?,?,?)", user.getId(),user.getName(),user.getAge(),user.getSex());

    }

    public  int update(User user){
        return jdbcTemplate.update("update user set name = ? ,age = ? ,sex = ? where id = ?", user.getName(),user.getAge(),user.getSex(),user.getId());

    }
}
