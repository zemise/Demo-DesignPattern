package io.github.zemise.patterns.behavioral.observer.demo2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MySubject implements DiySubject{
    private List<Object> observers = new ArrayList<>();

    @Override
    public void addObserver(Object object) {
        observers.add(object);
    }

    @Override
    public void removeObserver(Object object) {
        observers.remove(object);
    }

    @Override
    public void notifyObservers(String message) {
        for (Object observer : observers) {
            Class<?> clazz = observer.getClass();

            for(Method method : clazz.getDeclaredMethods()){
                if(method.isAnnotationPresent(ObserverMethod.class)){
                    try{
                        method.invoke(observer, message);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void doSomething(){
        System.out.println("subject: something happen");
        // 在某些操作后通知观察者
        notifyObservers("Something happened");
    }
}
