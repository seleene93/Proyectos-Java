package pequeñasapps;


import java.util.Scanner;


public class IsPrime {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int number = read.nextInt();
        
        if(isPrime(number)) {
            System.out.println("======================");
            System.out.println("Es un número primo");
            System.out.println("======================");
        } else {
            System.out.println("======================");
            System.out.println("No es un número primo");
            System.out.println("======================");
        }
    }
    
     /**
      * <h2>Función isPrime</h2>
      * 
     * @param num Recibe un número
     * @return Retorna un valor booleano indicando si el número recibido es primo o no
     */
    
    static boolean isPrime(int num) {
        int counter = 0;
        int[] numbers = new int[num];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        
        for (int i : numbers) {
            if (i == 1 || i == num){
                continue;
            }
            
            if (num % i == 0) {
                counter++;
            }
        }
        return counter == 0;
    }
    
}
