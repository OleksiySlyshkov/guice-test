package com.slyshkov.guicetest.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.slyshkov.guicetest.di.base.SomeService;
import com.slyshkov.guicetest.di.base.impl.SomeServiceImpl;
import com.slyshkov.guicetest.di.base.impl.TestConstructorDiServiceImpl;
import com.slyshkov.guicetest.di.base.impl.TestCustomAnnotationServiceImpl;
import com.slyshkov.guicetest.di.base.impl.TestFieldDiServiceImpl;
import com.slyshkov.guicetest.di.base.impl.TestMethodDiServiceImpl;
import java.util.ArrayList;
import java.util.Collection;

public class DiTester {
    private static final String str1 = "first";
    private static final String str2 = "second";
    private DiTester() {
    }

    public static void main(String[] args) {
        SomeService service;

        Injector injector = Guice.createInjector(new DataModule());
        Collection<Class> services = new ArrayList<>();
        services.add(SomeServiceImpl.class);
        services.add(TestConstructorDiServiceImpl.class);
        services.add(TestMethodDiServiceImpl.class);
        services.add(TestFieldDiServiceImpl.class);
        services.add(TestCustomAnnotationServiceImpl.class);

        for (Class serviceName : services) {
            service = (SomeService) injector.getInstance(serviceName);
            System.out.println(service.getClass().getSimpleName() + " " + service.processData(str1, str2));
        }

    }
}
