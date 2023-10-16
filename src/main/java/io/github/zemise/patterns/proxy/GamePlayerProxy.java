package io.github.zemise.patterns.proxy;

import java.util.Date;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    private void log(){
        System.out.println("打怪时间" + new Date());
    }

    private void count(){
        System.out.println("升1级耗费50小时");
    }

    @Override
    public void killBoss() {
        log();
        player.killBoss();
    }

    @Override
    public void upGrade() {;
        player.upGrade();
        count();
    }
}
