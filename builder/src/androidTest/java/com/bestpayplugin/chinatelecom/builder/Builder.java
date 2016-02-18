package com.bestpayplugin.chinatelecom.builder;

/**
 * Created by Administrator on 2016/2/6.
 */
public abstract class Builder {
    public abstract void builderBoard(String board);

    public abstract void builderDisplay(String display);

    public abstract void builderOS();

    public abstract Computer create();
}
