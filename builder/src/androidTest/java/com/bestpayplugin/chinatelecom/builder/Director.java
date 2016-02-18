package com.bestpayplugin.chinatelecom.builder;

/**
 * Created by Administrator on 2016/2/6.
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.builderBoard(board);
        mBuilder.builderDisplay(display);
        mBuilder.builderOS();
    }
}
