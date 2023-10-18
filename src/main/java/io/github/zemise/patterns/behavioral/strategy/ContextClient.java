package io.github.zemise.patterns.behavioral.strategy;

public class ContextClient {
    private DiscountStrategy ds;

    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    // 调用策略模式，计算折扣额
    public double contextCalDisc(){
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println("0折扣："+ context0.contextCalDisc());

        ContextClient contextFix = new ContextClient(new FixDiscountStrategy(46,60));
        System.out.println("固定折扣：" + contextFix.contextCalDisc());

        ContextClient contextPer = new ContextClient(new PercentageDiscountStrategy(38,40));
        System.out.println("15%的折扣：" + contextPer.contextCalDisc());
    }
}
