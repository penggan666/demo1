package com.example.demo1.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orign {

    @Id
    private int num;
    private String txtname;
    @Column(name = "time", columnDefinition = "TEXT")
    private String time;
    @Column(name = "progress", columnDefinition = "TEXT")
    private String progress;
    @Column(name="url",columnDefinition = "TEXT")
    private String url;
    public void orign(){

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
    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

}
