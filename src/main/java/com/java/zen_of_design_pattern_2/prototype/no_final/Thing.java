package com.java.zen_of_design_pattern_2.prototype.no_final;

import java.util.ArrayList;

public class Thing implements Cloneable{

    /**
     * 要使用clone方法，则类中的成员变量不可以使用final关键字修饰
     * 原理: clone关键字可能对类中的成员变量进行修改，final关键字禁止对变量的修改。所以,使用clone()方法时不可使用final关键字修饰成员变量。
     */
    private ArrayList<String> arrayList = new ArrayList<>();
//    private final ArrayList<String> arrayList = new ArrayList<>();

    @SuppressWarnings("unchecked")
	@Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            this.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
