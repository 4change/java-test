package com.java.zen_of_design_pattern_2.prototype.unexecuted_constructor;

public class Thing implements Cloneable{

    public Thing(){
        System.out.println("构造函数被执行了...");
    }

    /**
     * 在Java中，使用clone()方法进行对象的拷贝时，被拷贝对象的构造函数将不会执行；
     * 原理: Object类的clone()方法是从内存中以二进制流的方式进行拷贝，分配新的内存，不需要构造函数执行来产生对象
     *
     * @return
     */
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }

}
