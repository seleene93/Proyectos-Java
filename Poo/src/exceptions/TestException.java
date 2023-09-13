package exceptions;

import java.util.*;
import java.util.*;

public class TestException {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean continueExecution = true;

        do {
            try {

                System.out.println("Ingrese N1: ");
                int n1 = read.nextInt();
                System.out.println("Ingrese N2: ");
                int n2 = read.nextInt();

                int result = split(n1, n2);

                System.out.println(result);

                // Capturar errores y imprimir una excepción
            } catch (InputMismatchException e) {
                // Mandar un mensaje del error
                System.err.println("Ocurrió un error, ingrese solo números enteros");
                //  e.printStackTrace(System.out);
            } catch (OperatorException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se revisó la división");
            }
        } while (continueExecution);

    }

    static int split(int n, int d){
        if (d == 0) {
            throw new OperatorException("Dividir entre cero");
        }
        return n / d;
    }
}
