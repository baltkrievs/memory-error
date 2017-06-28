package by.darashchonak.mentoring.metaspace;

import javassist.CannotCompileException;

/**
 * Created by misha on 6/28/17.
 */
public class Main {

    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public static void main(String[] args) throws CannotCompileException, InterruptedException {

        Thread.sleep(30000);

        for (int i = 0; ; i++) {
            Class c = cp.makeClass("metaspace" + i).toClass();
        }

    }
}
