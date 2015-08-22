package com.example.euler_kalvinhe.myadapter.bean;

/**
 * Created by Euler-KalvinHe on 2015/8/20.
 */
public class Bean {
    private String title;
    private String desc;
    private String phone;
    private String time;
    private boolean isChecked;

    public Bean(String title, String desc, String time, String phone) {
        this.desc = desc;
        this.phone = phone;
        this.time = time;
        this.title = title;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
