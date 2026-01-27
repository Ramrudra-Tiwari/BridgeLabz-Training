package com.annotationsreflection.annotations.cacheresult;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}