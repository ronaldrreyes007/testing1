package Retos;

public class prueba {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String romanNumeral = convertToRoman(i);
            System.out.println(i + " en números romanos es: " + romanNumeral);
        }
    }

    public static String convertToRoman(int number) {
        if (number < 1 || number > 4000) {
            throw new IllegalArgumentException("El número está fuera del rango válido (1-4000).");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder romanNumeral = new StringBuilder();
        romanNumeral.append(thousands[number / 1000]);
        romanNumeral.append(hundreds[(number % 1000) / 100]);
        romanNumeral.append(tens[(number % 100) / 10]);
        romanNumeral.append(units[number % 10]);

        return romanNumeral.toString();
    }
/*
    StringBuilder romanNumeral = new StringBuilder(); crea un nuevo objeto StringBuilder vacío llamado romanNumeral. Este objeto se utilizará para construir la representación en números romanos del número dado.

            romanNumeral.append(thousands[number / 1000]); agrega al StringBuilder romanNumeral el símbolo romano correspondiente a los miles del número dado. El cálculo number / 1000 obtiene la parte entera de la división entre number y 1000, que corresponde al dígito de los miles. Luego, se utiliza este resultado como índice en el array thousands para obtener el símbolo romano correspondiente a los miles.

            romanNumeral.append(hundreds[(number % 1000) / 100]); agrega al StringBuilder romanNumeral el símbolo romano correspondiente a los cientos del número dado. El cálculo (number % 1000) / 100 obtiene el residuo de la división entre number y 1000, que corresponde a los tres dígitos más a la derecha, y luego se divide por 100 para obtener el dígito de los cientos. Utiliza este resultado como índice en el array hundreds para obtener el símbolo romano correspondiente a los cientos.

            romanNumeral.append(tens[(number % 100) / 10]); agrega al StringBuilder romanNumeral el símbolo romano correspondiente a las decenas del número dado. El cálculo (number % 100) / 10 obtiene el residuo de la división entre number y 100, que corresponde a los dos dígitos más a la derecha, y luego se divide por 10 para obtener el dígito de las decenas. Utiliza este resultado como índice en el array tens para obtener el símbolo romano correspondiente a las decenas.

            romanNumeral.append(units[number % 10]); agrega al StringBuilder romanNumeral el símbolo romano correspondiente a las unidades del número dado. El cálculo number % 10 obtiene el residuo de la división entre number y 10, que corresponde al dígito de las unidades. Utiliza este resultado como índice en el array units para obtener el símbolo romano correspondiente a las unidades.

    Al finalizar estas operaciones, el StringBuilder romanNumeral contendrá la representación en números romanos del número dado.
*/
}

