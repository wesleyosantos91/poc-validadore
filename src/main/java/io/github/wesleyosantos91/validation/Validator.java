package io.github.wesleyosantos91.validation;

public interface Validator <T> {

    boolean validate(T field, String operator, String expectedValue);
}
