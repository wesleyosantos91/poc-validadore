package io.github.wesleyosantos91.validation;

import io.github.wesleyosantos91.operator.OperatorFactory;

public class NameRegexValidator extends AbstractValidator<String> {

    @Override
    protected boolean process(String field, String operator, String expectedValue) {
        return OperatorFactory.criarValidador(operator).test(field, expectedValue);
    }
}
