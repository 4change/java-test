package com.java.zen_of_design_pattern_2.singleton.lazy;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                // 因为是单例模式, 所以多次调用Singleton.getSingleton()方法获得的都是同一个对象, 输出结果必然为true
                System.out.println("线程 " + Thread.currentThread().getName() + " 输出--------------------------------"
                        + (Singleton.getSingleton() == Singleton.getSingleton()));
            }, String.valueOf(i)).start();
        }

    }

}
