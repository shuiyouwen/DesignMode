package com.bestpay.memorandum;

/**
 * 发起人
 * Created by Finding Way on 2016/3/2.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void restoreMemoto(Memento memento) {
        this.setState(memento.getState());
    }
}
