package io.github.wesleyosantos91;

import io.github.wesleyosantos91.model.Person;
import io.github.wesleyosantos91.validation.NameRegexValidator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Wesley Oliveira Santos");

        NameRegexValidator validator = new NameRegexValidator();

        System.out.println(validator.validate(person.getName(), "REGEX", "^(?!\\s*$).+", ""));
    }
}