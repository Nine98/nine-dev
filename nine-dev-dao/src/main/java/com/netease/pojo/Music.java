package com.netease.pojo;

import javax.persistence.*;

public class Music {
    /**
     * 歌曲ID
     */
    @Id
    private String mid;

    /**
     * 歌曲名
     */
    private String mname;

    /**
     * 歌手名
     */
    private String sname;

    /**
     * 主图片
     */
    private String image;

    /**
     * 歌曲音频
     */
    private String audio;

    /**
     * 精彩部分起始时间
     */
    private Integer start;

    /**
     * 精彩部分截止时间
     */
    private Integer end;

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
     * 获取歌曲名
     *
     * @return mname - 歌曲名
     */
    public String getMname() {
        return mname;
    }

    /**
     * 设置歌曲名
     *
     * @param mname 歌曲名
     */
    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * 获取歌手名
     *
     * @return sname - 歌手名
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置歌手名
     *
     * @param sname 歌手名
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取主图片
     *
     * @return image - 主图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置主图片
     *
     * @param image 主图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取歌曲音频
     *
     * @return audio - 歌曲音频
     */
    public String getAudio() {
        return audio;
    }

    /**
     * 设置歌曲音频
     *
     * @param audio 歌曲音频
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * 获取精彩部分起始时间
     *
     * @return start - 精彩部分起始时间
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置精彩部分起始时间
     *
     * @param start 精彩部分起始时间
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获取精彩部分截止时间
     *
     * @return end - 精彩部分截止时间
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * 设置精彩部分截止时间
     *
     * @param end 精彩部分截止时间
     */
    public void setEnd(Integer end) {
        this.end = end;
    }
}