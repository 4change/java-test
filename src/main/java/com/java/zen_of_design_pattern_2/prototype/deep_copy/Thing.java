package com.java.zen_of_design_pattern_2.prototype.deep_copy;

import java.util.ArrayList;

public class Thing implements Cloneable{

    /**
     * 深拷贝: 不仅拷贝基本数据类型及可变数据类型，同时拷贝数组及引用变量以及其他可变数据类型
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    @SuppressWarnings("unchecked")
	@Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            // 深拷贝: 需对数组及引用变量进行单独的拷贝
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
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
