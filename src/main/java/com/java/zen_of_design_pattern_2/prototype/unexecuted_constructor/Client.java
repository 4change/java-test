package com.java.zen_of_design_pattern_2.prototype.unexecuted_constructor;

public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        @SuppressWarnings("unused")
		Thing cloneThing = thing.clone();
    }

}
