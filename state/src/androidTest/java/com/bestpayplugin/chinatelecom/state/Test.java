package com.bestpayplugin.chinatelecom.state;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/2/10.
 */
public class Test extends TestCase {
    public void test() {
        PowerControllerImp powerController = new PowerControllerImp();
        powerController.powerOn();
        powerController.nextChannel();
        powerController.powerOff();
        powerController.prevChannel();
        powerController.powerOff();
        powerController.powerOn();
        powerController.turnUp();
        powerController.powerOff();
    }

}
