package com.bestpayplugin.chinatelecom.builder;

/**
 * Created by Administrator on 2016/2/6.
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {
    }

    /**
     * 设置cpu
     * @param board
     */
    public void setBoard(String board) {
        mBoard = board;
    }

    /**
     * 设置显示内存
     * @param display
     */
    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "board" + mBoard + ";display" + mDisplay + ";os" + mOS;
    }
}
