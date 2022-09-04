package com.java.zen_of_design_pattern_2.singleton.double_check;

public class Singleton {

    /**
     * 双重检锁单例: 双重检空, 并使用synchronized保证同步
     *      另外, singleton对象设置为static(类共享, 一个类中仅包含一个该对象)和volatile(禁止指令重排优化, 保证对象初始化的顺序性)
     */
    private static volatile Singleton singleton = null;

    /**
     * 构造器设为私有, 禁止在类外创建对象;
     *      另外, 因为是单例模式, 所以构造器只会被调用一次
     */
    private Singleton(){
        System.out.println("调用单例模式构造器...");
    }

    /**
     * DCL(Double Check Lock 双端检锁机制)
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        // 由于指令重排的原因, 这里的对象指针可能不为空, 但对象指针指向的值为空, 因此可能为导致返回的instance为null
        return singleton;
    }

}
