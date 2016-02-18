package com.bestpayplugin.chinatelecom.strategy;

import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/2/8.
 */
public class Test extends TestCase {
    public void test() {
        Test test = new Test();
        test.setStrategy(new TaxiStrategyImple());
        int price = test.caculatePrice(5);
        Log.i("TAG", "价格是：" + price);

    }

    private ICaculateStrategy mStrategy;

    public void setStrategy(ICaculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int caculatePrice(int km) {
        return mStrategy.caculatePrice(km);
    }
}
