package com.java.zen_of_design_pattern_2.decorator.example_2;

public class Father {

    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 然后老爸一看，很开心，就签名了
        sr.sign("老三");
    }

}
