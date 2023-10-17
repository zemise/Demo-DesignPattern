package io.github.zemise.patterns.behavioral.command;

import javax.swing.*;

public class ExitCommand extends JButton implements Command {

    public ExitCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        // 系统退出
        System.exit(0);
    }
}
