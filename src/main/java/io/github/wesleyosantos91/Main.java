package io.github.wesleyosantos91;

import io.github.wesleyosantos91.model.Person;
import io.github.wesleyosantos91.validation.NameRegexValidatorImpl;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Wesley Oliveira Santos");

        NameRegexValidatorImpl validator = new NameRegexValidatorImpl();

        System.out.println(validator.validate(person.getName(), "REGEX", "^(?!\\s*$).+"));
    }
}