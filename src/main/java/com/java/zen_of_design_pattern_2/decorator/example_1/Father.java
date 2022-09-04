package com.java.zen_of_design_pattern_2.decorator.example_1;

public class Father {

    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 签名？休想！
    }

}
