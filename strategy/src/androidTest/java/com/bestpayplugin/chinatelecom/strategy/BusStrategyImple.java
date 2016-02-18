package com.bestpayplugin.chinatelecom.strategy;

/**
 * Created by Administrator on 2016/2/9.
 */
public class BusStrategyImple implements ICaculateStrategy {

    @Override
    public int caculatePrice(int km) {
        if (km <= 10) {
            return 1;
        } else {
            int extraKm = km - 10;
            int extraPrice = extraKm / 5 + 1;
            return 1 + extraPrice;
        }
    }
}
