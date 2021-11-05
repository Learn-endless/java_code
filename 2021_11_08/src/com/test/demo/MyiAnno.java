package com.test.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyiAnno {
    String[] value();
}
