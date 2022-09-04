package com.java.zen_of_design_pattern_2.decorator.example_1;

public class FouthGradeSchoolReport extends SchoolReport {

    // 我的成绩单
    @Override
    public void report() {
        // 成绩单的格式是这个样子的
        System.err.println("尊敬的xxx家长： ");
        System.err.println("    ......");
        System.err.println("语文: 62   数学: 65   体育: 98   自然: 63");
        System.err.println("    ......");
        System.err.println("            家长签字:       ");
    }

    // 家长签字
    @Override
    public void sign(String name) {
        System.err.println("家长签字为: " + name);
    }

}
