package com.example.demo.dao.jpa;

import com.example.demo.model.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author jcb
 * @version : JpaUserDao, v 0.1 2019/5/30 17:49 jcb Exp$
 * @Description: jpa 操作数据库
 */
@Repository
public interface JpaUserDao extends JpaRepository<JpaUser,Long> {

}
