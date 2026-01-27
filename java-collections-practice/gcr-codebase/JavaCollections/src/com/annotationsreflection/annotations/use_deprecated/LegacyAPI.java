package com.annotationsreflection.annotations.use_deprecated;

public class LegacyAPI {
	@Deprecated
	public void oldFeature() {
		System.out.println("Old Feature.");
	}
	
	public void newFeature() {
		System.out.println("New Feature.");
	}
}