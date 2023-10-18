package io.github.zemise.reflect.classloader.demo2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurableStrategyDemo {
    public static IService createService() {
        try {
            Properties prop = new Properties();
            // error
            // String fileName = "io/github/zemise/refelect/classloader/demo2/config.properties";

            // 可行
            // String fileName = "target/classes/io/github/zemise/reflect/classloader/demo2/config.properties";
            // prop.load(new FileInputStream(fileName));

            // 使用类加载器来加载资源文件， 也可行
            InputStream inputStream = ConfigurableStrategyDemo.class.getResourceAsStream("/io/github/zemise/reflect/classloader/demo2/config.properties");
            prop.load(inputStream);


            String className = prop.getProperty("service");

            Class<?> cls = Class.forName(className);
            return (IService) cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        IService service = createService();
        service.action();
    }
}