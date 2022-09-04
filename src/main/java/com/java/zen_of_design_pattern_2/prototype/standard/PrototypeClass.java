package com.java.zen_of_design_pattern_2.prototype.standard;

public class PrototypeClass implements Cloneable{

    /** 覆写父类Object clone()方法 */
    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;

        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            // 异常处理
        }

        return prototypeClass;
    }

}
