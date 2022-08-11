package com.netease.pojo;

import javax.persistence.*;

public class Mlist {
    /**
     * 歌单
     */
    @Id
    private String lid;

    /**
     * 歌单名
     */
    private String name;

    /**
     * 歌单介绍
     */
    private String info;

    /**
     * 歌单图片
     */
    private String image;

    /**
     * 场景
     */
    private String scene;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 获取歌单
     *
     * @return lid - 歌单
     */
    public String getLid() {
        return lid;
    }

    /**
     * 设置歌单
     *
     * @param lid 歌单
     */
    public void setLid(String lid) {
        this.lid = lid;
    }

    /**
     * 获取歌单名
     *
     * @return name - 歌单名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置歌单名
     *
     * @param name 歌单名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取歌单介绍
     *
     * @return info - 歌单介绍
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置歌单介绍
     *
     * @param info 歌单介绍
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取歌单图片
     *
     * @return image - 歌单图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置歌单图片
     *
     * @param image 歌单图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取场景
     *
     * @return scene - 场景
     */
    public String getScene() {
        return scene;
    }

    /**
     * 设置场景
     *
     * @param scene 场景
     */
    public void setScene(String scene) {
        this.scene = scene;
    }

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
}