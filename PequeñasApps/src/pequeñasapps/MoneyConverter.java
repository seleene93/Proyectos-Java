
package pequeñasapps;

import java.util.Scanner;


public class MoneyConverter {
    public static void main(String[] args) {
        EXTERNA: // cierra el programa
        while(true) {
            System.out.println("Conversor de monedas");
            System.out.println("1 - Soles Peruanos a dólares\n"
                             + "2 - Pesos Méxicanos a dólares\n"
                             + "3 - Pesos Colombianos a dólares\n"
                             + "4 - SALIR");
            System.out.println("Elige una opción: ");
            Scanner read = new Scanner(System.in);
            char option = read.next().charAt(0);
            
            switch(option) {
                case '1':
                    converter(3.58, "Soles Peruanos");
                    break;
                case '2':
                    converter(22.15, "Pesos Méxicanos"); 
                    break;
                case '3':
                    converter(3851.90, "Pesos Colombianos"); 
                    break;
                case '4':
                    System.out.println("Cerrando programa");
                    break EXTERNA;
                default:
                    System.out.println("Opción incorrecta");
                    break EXTERNA;
            }
            
            
        }
    }
    
    static void converter(double dollarValue, String country) {
        Scanner read = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad %s :", country);
        double moneyQuantity = read.nextDouble();
        
        double dollars = moneyQuantity / dollarValue;
        
        dollars = (double) Math.round(dollars * 100d) / 100; // redondea una cantidad a dos decimales
        
        System.out.println("-------------------------------");
        System.out.println("Tienes $" + dollars + " Dólares");
        System.out.println("-------------------------------");
        
        
    }
}
