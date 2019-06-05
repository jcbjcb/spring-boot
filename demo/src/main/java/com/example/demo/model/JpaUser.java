package com.example.demo.model;

import javax.persistence.*;

/**
 * @author jcb
 * @version : User, v 0.1 2019/5/30 16:57 jcb Exp$
 * @Description:
 */
@Entity
@Table(name = "user")
public class JpaUser {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
