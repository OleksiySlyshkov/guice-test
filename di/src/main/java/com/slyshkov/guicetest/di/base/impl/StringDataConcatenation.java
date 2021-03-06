package com.slyshkov.guicetest.di.base.impl;

import com.slyshkov.guicetest.di.base.DataProcessor;

public class StringDataConcatenation implements DataProcessor {

    private String template = "%s%s";

    @Override
    public String process(final String first, final String second) {
        return  String.format(template, first, second);
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(final String template) {
        this.template = template;
    }
}
