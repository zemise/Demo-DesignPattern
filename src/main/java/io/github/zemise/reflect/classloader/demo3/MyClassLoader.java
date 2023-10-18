package io.github.zemise.reflect.classloader.demo3;

import java.io.*;

public class MyClassLoader extends ClassLoader {
//    private static final String BASE_DIR = "io/github/zemise/reflect/classloader/demo3";
    private static final String BASE_DIR = "io/github/zemise/reflect/classloader/demo4";

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName = name.replace("\\.", "/");
        fileName = BASE_DIR + fileName + ".class";

        try {
            byte[] bytes = readFileToByteArray(fileName);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException ex) {
            throw new ClassNotFoundException("failed to load class" + name, ex);
        }
    }

    public static byte[] readFileToByteArray(String fileName) throws IOException {
        InputStream input = new FileInputStream(fileName);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            copy(input, output);
            return output.toByteArray();
        } finally {
            input.close();
        }
    }

    public static void copy(InputStream input,
                            OutputStream output) throws IOException {
        byte[] buf = new byte[4096];
        int bytesRead = 0;
        while ((bytesRead = input.read(buf)) != -1) {
            output.write(buf, 0, bytesRead);
        }
    }
}
