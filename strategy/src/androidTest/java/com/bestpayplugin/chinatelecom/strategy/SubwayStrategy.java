package com.bestpayplugin.chinatelecom.strategy;

/**
 * Created by Administrator on 2016/2/9.
 */
public class SubwayStrategy implements ICaculateStrategy {

    @Override
    public int caculatePrice(int km) {
        if (km < 7) {
            return 3;
        } else if (km < 12) {
            return 4;
        } else if (km < 22) {
            return 6;
        } else {
            return 7;
        }
    }
}
