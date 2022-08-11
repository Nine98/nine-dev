package com.netease.pojo;

import javax.persistence.*;

@Table(name = "music_status")
public class MusicStatus {
    /**
     * 用户ID
     */
    @Id
    private String uid;

    /**
     * 歌曲ID
     */
    @Id
    private String mid;

    /**
     * 歌单ID
     */
    @Id
    private String lid;

    /**
     * 反馈状态
     */
    private Integer status;

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
     * 获取歌曲ID
     *
     * @return mid - 歌曲ID
     */
    public String getMid() {
        return mid;
    }

    /**
     * 设置歌曲ID
     *
     * @param mid 歌曲ID
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 获取歌单ID
     *
     * @return lid - 歌单ID
     */
    public String getLid() {
        return lid;
    }

    /**
     * 设置歌单ID
     *
     * @param lid 歌单ID
     */
    public void setLid(String lid) {
        this.lid = lid;
    }

    /**
     * 获取反馈状态
     *
     * @return status - 反馈状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置反馈状态
     *
     * @param status 反馈状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}