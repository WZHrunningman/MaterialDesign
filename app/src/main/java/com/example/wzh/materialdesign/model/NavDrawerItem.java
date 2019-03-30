package com.example.wzh.materialdesign.model;

/**
 * Author by wzh, Email xx@xx.com, Date on 2019/02/12.
 * PS: Not easy to write code, please indicate.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;


    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title) {
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}