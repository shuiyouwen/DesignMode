package com.bestpayplugin.chinatelecom.absfactory;

/**
 * 抽象工厂
 * Created by Administrator on 2016/2/7.
 */
public abstract class CarFractory {
    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();
}
