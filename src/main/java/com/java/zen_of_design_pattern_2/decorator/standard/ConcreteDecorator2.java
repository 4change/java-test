package com.java.zen_of_design_pattern_2.decorator.standard;

public class ConcreteDecorator2 extends Decorator {

    // 定义被修饰者
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    // 定义自己的修饰方法
    public void method2() {
        System.err.println("method2 修饰...");
    }

    // 重写父类的operate()方法
    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
