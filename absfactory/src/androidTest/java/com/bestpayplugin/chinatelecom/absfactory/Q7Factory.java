package com.bestpayplugin.chinatelecom.absfactory;

import com.bestpayplugin.chinatelecom.absfactory.imple.ImprotEngine;
import com.bestpayplugin.chinatelecom.absfactory.imple.SUVTire;
import com.bestpayplugin.chinatelecom.absfactory.imple.SeniorBrake;

/**
 * Created by Administrator on 2016/2/7.
 */
public class Q7Factory extends CarFractory {

    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImprotEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
