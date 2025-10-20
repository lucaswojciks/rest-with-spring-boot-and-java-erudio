package br.com.erudio.request.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", "."); // R$ 5,00 - USD 5.0

        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new IllegalArgumentException();
        String number = strNumber.replace(",", "."); // R$ 5,00 - USD 5.0

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
