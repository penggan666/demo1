package com.example.demo1.Bean;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class orign {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int num;
    private String userid;
    private Date date;
    private Time starttime;
    private int time;

    public int getLenTime() {
        return lenTime;
    }

    public void setLenTime(int lenTime) {
        this.lenTime = lenTime;
    }

    private int lenTime;
    @Column(name = "progress", columnDefinition = "TEXT")
    private String progress;
    @Column(name="url",columnDefinition = "TEXT")
    private String url;
    public void orign(){

    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStarttime() {
        return starttime;
    }

    public void setStarttime(Time starttime) {
        this.starttime = starttime;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

}
