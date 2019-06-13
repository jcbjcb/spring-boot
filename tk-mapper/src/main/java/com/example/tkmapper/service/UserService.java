package com.example.tkmapper.service;

import com.example.tkmapper.entity.User;
import com.example.tkmapper.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author jcb
 * @version : UserService, v 0.1 2019/6/11 14:50 jcb Exp$
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     *
     * @param id
     * @return
     */
    public User getUser(Long id){
      return   userMapper.selectByPrimaryKey(id);
    }


    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<User> getUserList(int pageNum,int pageSize){

        //设置分页器
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.selectAll();
        PageInfo<User> page = new PageInfo<>(list);

        return page;
    }

    /**
     * 通过属性值查询列表
     * @param name
     * @return
     */
    public List<User> getByEntity(String name){
        //属性直接等于的可以这样写查询 也可以用 example
        User user = new User();
        user.setName(name);
        return userMapper.select(user);

    }

    /**
     * example 用法
     * @param name
     * @param lessAge
     * @return
     */
    public List<User> getByExample(String name,int lessAge){

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name",name); //参数为 属性名+值
//        criteria.andLike("name","%"+name+"%");//like
        criteria.andLessThanOrEqualTo("age",lessAge);//小于或等于

        example.orderBy("age").desc();//排序

        return userMapper.selectByExample(example);

    }


}
