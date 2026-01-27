package com.annotationsreflection.annotations.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	// Annotation should be available at runtime
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	
	public @interface TaskInfo{
		int priority();
		String assignTo();
	}