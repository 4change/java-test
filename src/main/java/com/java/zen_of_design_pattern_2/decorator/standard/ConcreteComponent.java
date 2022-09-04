package com.java.zen_of_design_pattern_2.decorator.standard;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.err.println("do Something...");
    }

}
