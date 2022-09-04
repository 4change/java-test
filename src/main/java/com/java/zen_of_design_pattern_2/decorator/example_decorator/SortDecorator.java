package com.java.zen_of_design_pattern_2.decorator.example_decorator;

public class SortDecorator extends Decorator {

    // 构造函数
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // 告诉老爸学校的排名情况
    private void reportSort() {
        System.err.println("我是排名第38名...");
    }

    // 老爸看完成绩单再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

}
