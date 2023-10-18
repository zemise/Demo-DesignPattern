package io.github.zemise.reflect.proxy.staticproxy;

public class TraceProxy implements IService{
    private final IService realService;

    public TraceProxy(IService realService) {
        this.realService = realService;
    }

    @Override
    public void sayHello() {
        System.out.println("entering sayHello");
        realService.sayHello();
        System.out.println("leaving sayHello");
    }
}
