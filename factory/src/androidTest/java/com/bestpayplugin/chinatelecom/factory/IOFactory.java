package com.bestpayplugin.chinatelecom.factory;

/**
 * 带泛型的工厂
 * Created by Administrator on 2016/2/7.
 */
public class IOFactory {
    public static <T extends IOHandle> T getIOHandle(Class<T> clazz) {
        IOHandle ioHandle = null;
        try {
            ioHandle = (IOHandle) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) ioHandle;
    }
}
