package com.slyshkov.guicetest.di.base.impl;

import com.google.inject.Inject;
import com.slyshkov.guicetest.di.base.DataProcessor;
import com.slyshkov.guicetest.di.base.SomeService;

public class TestFieldDiServiceImpl implements SomeService {
    @Inject
    DataProcessor processor;
    @Inject
    String unknownString;
    @Inject
    String defaultString = " default ";
    @Inject
    int anInt;
    @Inject
    Object unknownObject;
    @Override
    public String processData(final String first, final String second) {

        //do something
        String result = processor.process(anInt + unknownString, defaultString + unknownObject.toString());
        //do something
        return result;
    }


}
