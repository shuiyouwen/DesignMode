package com.bestpay.memorandum;

/**
 * 代理着
 * Created by Finding Way on 2016/3/2.
 */
public class Caretaker {
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    private Memento memento;
}
