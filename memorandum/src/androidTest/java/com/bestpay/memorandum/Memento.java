package com.bestpay.memorandum;

/**
 * 记忆碎片，即存档
 * Created by Finding Way on 2016/3/2.
 */
public class Memento {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;
}
