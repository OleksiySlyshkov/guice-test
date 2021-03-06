package com.slyshkov.guicetest.di.base.impl;

import com.google.inject.Inject;
import com.slyshkov.guicetest.di.base.DataProcessor;
import com.slyshkov.guicetest.di.base.SomeService;

public class TestConstructorDiServiceImpl implements SomeService {
    DataProcessor processor;

    @Inject
    public TestConstructorDiServiceImpl(DataProcessor outerProcessor) {
        this.processor = outerProcessor;
    }

        @Override
    public String processData(final String first, final String second) {

        //do something
        String result = processor.process(first, second);
        //do something
        return result;
    }
}
