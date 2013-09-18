package com.slyshkov.guicetest.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestAopInvoker implements MethodInterceptor {

    @Override
    public Object invoke(final MethodInvocation invocation) throws Throwable {
        Object [] arguments = invocation.getArguments();
        if (((int) arguments[1]) == 0) {
            System.out.println("What are you doing now?!!");
            throw new IllegalArgumentException("Never divide by zero");
        }
        return invocation.proceed();
    }
}
