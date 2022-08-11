package com.netease.pojo;

import javax.persistence.*;
import java.util.Date;

public class Users {
    /**
     * 用户ID
     */
    @Id
    private String uid;

    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}