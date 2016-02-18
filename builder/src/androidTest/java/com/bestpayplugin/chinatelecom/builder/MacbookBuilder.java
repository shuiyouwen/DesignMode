package com.bestpayplugin.chinatelecom.builder;

/**
 * Created by Administrator on 2016/2/6.
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public void builderBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void builderDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void builderOS() {
        mComputer.setOs();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
