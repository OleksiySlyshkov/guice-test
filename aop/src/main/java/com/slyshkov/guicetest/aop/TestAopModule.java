package com.slyshkov.guicetest.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class TestAopModule extends AbstractModule {
    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(),Matchers.annotatedWith(InvokeMe.class), new TestAopInvoker());
    }
}
