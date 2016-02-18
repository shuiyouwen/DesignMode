package com.bestpayplugin.chinatelecom.command.tetrisMachine;

/**
 * Created by Administrator on 2016/2/14.
 */
public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FastToBottomCommand fastToBottomCommand;
    private TransformCommand transformCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFastToBottomCommand(FastToBottomCommand fastToBottomCommand) {
        this.fastToBottomCommand = fastToBottomCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fastToBottom() {
        fastToBottomCommand.execute();
    }

    public void transForm() {
        transformCommand.execute();
    }
}
