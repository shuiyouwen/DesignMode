package com.bestpayplugin.chinatelecom.handle;

import com.bestpayplugin.chinatelecom.handle.leader.Boss;
import com.bestpayplugin.chinatelecom.handle.leader.Director;
import com.bestpayplugin.chinatelecom.handle.leader.GroupLeader;
import com.bestpayplugin.chinatelecom.handle.leader.Manager;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/2/13.
 */
public class Test extends TestCase {
    public void test() {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        groupLeader.handleRequest(11000);
    }
}
