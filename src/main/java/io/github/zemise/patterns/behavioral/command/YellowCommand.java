package io.github.zemise.patterns.behavioral.command;

import javax.swing.*;
import java.awt.*;

public class YellowCommand extends JButton implements Command {
    private JPanel p;

    public YellowCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // 改变面板的背景颜色
        p.setBackground(Color.yellow);
    }
}
