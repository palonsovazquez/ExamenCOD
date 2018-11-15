package examencod;

public class Factorial {

    public static void main(String[] args) {

        int intNumero; // numero entero a factorizar
        int intFactorial; // factorial del numero

        intNumero = 8;

        int i;
        if (intNumero == 0) {
            intFactorial = 1;
        } else {
            intFactorial = 1;
            for (i = intNumero; i >= 1; i--) {
                intFactorial = intFactorial * i;
            }
        }

        System.out.println(intFactorial);

    }

}
