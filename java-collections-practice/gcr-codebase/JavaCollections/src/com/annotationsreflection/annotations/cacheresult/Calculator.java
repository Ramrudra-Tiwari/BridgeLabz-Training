package com.annotationsreflection.annotations.cacheresult;
public class Calculator {

    @CacheResult
    public int square(int x) {
        System.out.println("Computing square...");
        return x * x;
    }
}