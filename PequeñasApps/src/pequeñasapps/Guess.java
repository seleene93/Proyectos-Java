
package pequeñasapps;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        
        OUTER:
        while(true) {
            System.out.println("JUEGO: ADIVINA EL NÚMERO \n");
            System.out.println("1 - Nivel Fácil \n"
                             + "2 - Nivel Intermedio \n"
                             + "3 - Nivel Difícil \n"
                             + "4 - SALIR");
            
            Scanner read = new Scanner(System.in);
            System.out.println("Ingresa una opción: ");
            int option = read.nextInt(); 
            
            switch(option) {
                case 1: 
                    play(10);
                    break;
                case 2: 
                    play(7);
                    break; 
                case 3: 
                    play(5);
                    break;  
                case 4: 
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER;    
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
    
    static void play(int lives) {
        int randomNumber = (int)(Math.random()*101); // entre 0 y 100
        int chosenNumber = -1;
        
        Scanner read = new Scanner(System.in);
        
        while(chosenNumber != randomNumber){
            System.out.println("Ingrese un número entre 1 y 100: ");
            chosenNumber = read.nextInt();
            
            if(randomNumber < chosenNumber) {
                System.out.println("Ingrese un número más pequeño");
                lives--;
            } else if(randomNumber > chosenNumber) {
                System.out.println("Ingrese un número más grande");
                lives--;
            }
            
            if (lives == 0){
                System.out.println("GAME OVER");
                break;
            }
            System.out.printf("Te quedan %d vidas \n", lives);
        }
        
        if (randomNumber == chosenNumber) {
            System.out.println("FELICIDADES HAS ACERTADO");
        }
    }
}
