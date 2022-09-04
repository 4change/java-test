package com.java.zen_of_design_pattern_2.singleton.example_emperor;

public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("我就是皇帝某某某....");
    }
}
