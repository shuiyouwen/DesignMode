package com.bestpayplugin.chinatelecom.command;

import com.bestpayplugin.chinatelecom.command.tetrisMachine.Buttons;
import com.bestpayplugin.chinatelecom.command.tetrisMachine.FastToBottomCommand;
import com.bestpayplugin.chinatelecom.command.tetrisMachine.LeftCommand;
import com.bestpayplugin.chinatelecom.command.tetrisMachine.RightCommand;
import com.bestpayplugin.chinatelecom.command.tetrisMachine.TetrisMachine;
import com.bestpayplugin.chinatelecom.command.tetrisMachine.TransformCommand;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/2/14.
 */
public class Test extends TestCase {
    public void test() {
        TetrisMachine tetrisMachine = new TetrisMachine();

        LeftCommand leftCommand = new LeftCommand(tetrisMachine);
        RightCommand rightCommand = new RightCommand(tetrisMachine);
        FastToBottomCommand fastToBottomCommand = new FastToBottomCommand(tetrisMachine);
        TransformCommand transformCommand = new TransformCommand(tetrisMachine);

        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFastToBottomCommand(fastToBottomCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toRight();
        buttons.toRight();
        buttons.toLeft();
        buttons.fastToBottom();
        buttons.transForm();
        buttons.toRight();
        buttons.fastToBottom();
    }
}
