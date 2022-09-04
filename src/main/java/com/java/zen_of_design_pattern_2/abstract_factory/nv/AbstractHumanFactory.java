package com.java.zen_of_design_pattern_2.abstract_factory.nv;

public abstract class AbstractHumanFactory {
	
	public abstract <T extends Human> T createHuman(Class<T> c);
	
}
