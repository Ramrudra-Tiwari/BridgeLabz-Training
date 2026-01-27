package com.annotationsreflection.reflection.retrieveannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)             
@interface Author {
    String name();
}