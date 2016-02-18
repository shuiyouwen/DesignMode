package com.bestpayplugin.chinatelecom.command.tetrisMachine;

/**
 * Created by Administrator on 2016/2/14.
 */
public class TransformCommand implements Command {
    private TetrisMachine mTetrisMachine;

    public TransformCommand(TetrisMachine tetrisMachine) {
        mTetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        mTetrisMachine.transform();
    }
}
