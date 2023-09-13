
package pequeñasapps;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String chain = read.nextLine();
        
        if (isPalindrome(chain)) {
            System.out.println("===========================");
            System.out.println("Es una palabra palíndroma");
            System.out.println("===========================");
        } else {
            System.out.println("===========================");
            System.out.println("No es una palabra palíndroma");
            System.out.println("===========================");
        }
        
    }
    
    static boolean isPalindrome(String chain) {
    chain = chain.replace(" ", "");
    chain = chain.toLowerCase();
    
    StringBuilder invertedChain = new StringBuilder();
    
    // se crea la cadena invertida introduciendola en el string vacio 
    for(int i = chain.length()-1; i >= 0; i--) {
        invertedChain.append(chain.charAt(i));
    }
    
    return chain.equals(invertedChain.toString());
          
}
}
