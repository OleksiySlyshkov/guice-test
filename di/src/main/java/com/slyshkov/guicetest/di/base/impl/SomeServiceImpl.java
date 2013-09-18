package com.slyshkov.guicetest.di.base.impl;

import com.slyshkov.guicetest.di.base.DataProcessor;
import com.slyshkov.guicetest.di.base.SomeService;

public class SomeServiceImpl implements SomeService {

    @Override
    public String processData(final String first, final String second) {
        DataProcessor processor = new StringDataConcatenation();
        //do something
        String result = processor.process(first, second);
        //do something
        return result;
    }
}
