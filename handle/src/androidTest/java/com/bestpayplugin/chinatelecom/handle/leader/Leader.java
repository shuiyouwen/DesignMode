package com.bestpayplugin.chinatelecom.handle.leader;

/**
 * Created by Administrator on 2016/2/13.
 */
public abstract class Leader {
    public Leader nextHandler;

    public void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            nextHandler.handleRequest(money);
        }
    }

    public abstract void handle(int money);

    public abstract int limit();
}
