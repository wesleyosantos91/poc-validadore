package io.github.wesleyosantos91.operator;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.regex.Pattern;

public class OperatorFactory {

    public static BiPredicate<Object, Object> criarValidador(String operador) {
        return switch (operador) {
            case "=" -> (valor, valorEsperado) -> valor.equals(valorEsperado);

            case ">" -> (valor, valorEsperado) -> valor instanceof Number && valorEsperado instanceof Number
                    && ((Number) valor).doubleValue() > ((Number) valorEsperado).doubleValue();

            case ">=" -> (valor, valorEsperado) -> valor instanceof Number && valorEsperado instanceof Number
                    && ((Number) valor).doubleValue() >= ((Number) valorEsperado).doubleValue();

            case "<" -> (valor, valorEsperado) -> valor instanceof Number && valorEsperado instanceof Number
                    && ((Number) valor).doubleValue() < ((Number) valorEsperado).doubleValue();

            case "<=" -> (valor, valorEsperado) -> valor instanceof Number && valorEsperado instanceof Number
                    && ((Number) valor).doubleValue() <= ((Number) valorEsperado).doubleValue();

            case "REGEX" -> (valor, regex) -> valor instanceof String && regex instanceof String
                    && Pattern.compile((String) regex).matcher((String) valor).matches();

            case "IN" -> (valor, listaEsperada) -> listaEsperada instanceof List<?> list && list.contains(valor);

            case "NOT IN" -> (valor, listaEsperada) -> listaEsperada instanceof List<?> list && !list.contains(valor);

            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}