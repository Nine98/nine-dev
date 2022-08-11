package com.netease.pojo;

import javax.persistence.*;

@Table(name = "music_to_list")
public class MusicToList {
    /**
     * 歌单ID
     */
    @Id
    private String lid;

    /**
     * 歌曲ID
     */
    @Id
    private String mid;

    /**
     * 优先级
     */
    private Integer priority;

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
     * 获取优先级
     *
     * @return priority - 优先级
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}