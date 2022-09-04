package com.java.zen_of_design_pattern_2.prototype.shallow_copy;

public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

}
