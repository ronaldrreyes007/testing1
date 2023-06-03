package Retos;

public class Reto3 {

    public static String arabicToRoman(int n) {
        String romanNumeral="";
        for (int i = 1; i <= n; i++) {
            romanNumeral = convertToRoman(i);
        }
        return  romanNumeral;
    }
    public static String convertToRoman(int number) {
        if (number < 1 || number > 4000) {
            throw new IllegalArgumentException("El número está fuera del rango válido (1-4000).");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder romanNumeralString = new StringBuilder();
        romanNumeralString.append(thousands[number / 1000]);
        romanNumeralString.append(hundreds[(number % 1000) / 100]);
        romanNumeralString.append(tens[(number % 100) / 10]);
        romanNumeralString.append(units[number % 10]);

        return romanNumeralString.toString();
    }
}
