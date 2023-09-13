
package pequeñasapps;


public class GeneratePass {
    public static void main(String[] majus) {
        System.out.println(generate());
    }
    
    
    
    static String generate() {
        char[] majus = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};        
        char[] minus = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        
        StringBuilder characters = new StringBuilder();
        characters.append(majus);
        characters.append(minus);
        characters.append(numbers);
        
        StringBuilder pass = new StringBuilder();
        
        for(int i = 0; i <= 15; i++) {
            int numCharacters = characters.length();
            int randomNumber = (int)(Math.random()*numCharacters); // genera un numero random entre la cantidad de caracteres 
           
            // convertimos a string y selecciona aleatoriamente un solo carácter de esa cadena para agregarlo a la contraseña que se está generando
            pass.append((characters.toString()).charAt(randomNumber)); 
            
        }
                
        return pass.toString();
    }
}
