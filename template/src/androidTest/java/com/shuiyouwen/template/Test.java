package com.shuiyouwen.template;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/3/2.
 */
public class Test extends TestCase {
    public void test() {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
