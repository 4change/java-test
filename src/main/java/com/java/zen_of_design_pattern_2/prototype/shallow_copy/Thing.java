package com.java.zen_of_design_pattern_2.prototype.shallow_copy;

import java.util.ArrayList;

public class Thing implements Cloneable{

    /**
     * 浅拷贝: 只拷贝基本数据类型及不可变对象，不拷贝数组及可变数据类型
     */
    private ArrayList<String> arrayList = new ArrayList<>();

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

    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}