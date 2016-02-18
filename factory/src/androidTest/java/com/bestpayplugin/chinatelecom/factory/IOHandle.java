package com.bestpayplugin.chinatelecom.factory;

/**
 * Created by Administrator on 2016/2/7.
 */
public abstract class IOHandle {
    public abstract void add(String id, String name);

    public abstract void remove(String id);

    public abstract void update(String id, String name);

    public abstract void query(String id);
}
