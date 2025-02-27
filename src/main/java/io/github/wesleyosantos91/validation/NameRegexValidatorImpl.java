package io.github.wesleyosantos91.validation;

import io.github.wesleyosantos91.operator.OperatorFactory;

public class NameRegexValidatorImpl implements Validator<String> {

    @Override
    public boolean validate(String field, String operator, String expectedValue) {
        return OperatorFactory.criarValidador(operator).test(field, expectedValue);
    }
}
