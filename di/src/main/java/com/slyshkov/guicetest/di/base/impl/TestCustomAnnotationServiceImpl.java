package com.slyshkov.guicetest.di.base.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.slyshkov.guicetest.di.base.DataProcessor;
import com.slyshkov.guicetest.di.base.SomeService;
import com.slyshkov.guicetest.di.NotLeaveString;

public class TestCustomAnnotationServiceImpl implements SomeService {
    @Inject
    DataProcessor processor;

    @Inject
    String separator;

    @Inject
    String anotherSeparator;

    @Inject
    @Named("Not leave string")
    String anotherString;

    @Inject
    @NotLeaveString
    String defaultString;
    @Override
    public String processData(final String first, final String second) {

        //do something
        String result = processor.process(anotherString + separator, defaultString + anotherSeparator);
        //do something
        return result;
    }


}
