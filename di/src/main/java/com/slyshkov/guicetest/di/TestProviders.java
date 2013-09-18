package com.slyshkov.guicetest.di;

import com.google.inject.Provider;
import com.slyshkov.guicetest.di.base.DataProcessor;
import com.slyshkov.guicetest.di.base.impl.StringDataConcatenation;

public class TestProviders implements Provider<DataProcessor> {
    @Override
    public DataProcessor get() {
        StringDataConcatenation processor = new StringDataConcatenation();
        processor.setTemplate("\n\t\tstr1 = %s\n\t\tstr2 = %s");
        return processor;
    }
}
