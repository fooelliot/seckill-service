package com.andy.seckill.access;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p>
 *
 * @author Leone
 * @since 2018-10-26
 **/
@Retention(RUNTIME)
@Target(METHOD)
public @interface AccessLimit {

	int seconds();

	int maxCount();

	boolean needLogin() default true;
}
