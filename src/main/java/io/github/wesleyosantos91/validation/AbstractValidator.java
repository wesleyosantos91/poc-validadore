package io.github.wesleyosantos91.validation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractValidator<T> implements Validator<T> {

    protected boolean shouldSkipValidation(T field, String conditions) {
        Set<String> conjuntoValores = new HashSet<>(Arrays.asList(conditions.split(",")));
        return !conjuntoValores.contains(field);
    }

    @Override
    public boolean validate(T field, String operator, String expectedValue, String conditions) {
        if (shouldSkipValidation(field, conditions)) {
            return true;
        }
        return process(field, operator, expectedValue);
    }

    protected abstract boolean process(T field, String operator, String expectedValue);
}