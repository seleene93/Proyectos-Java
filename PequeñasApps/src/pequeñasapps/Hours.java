package pequeñasapps;


import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int horasTotales = 0;
        int minutosTotales = 0;
        
        boolean seguirAgregandoHoras = true;
        while (seguirAgregandoHoras) {
            System.out.print("Ingrese las horas (o -1 para salir): ");
            int horas = scanner.nextInt();
            
            if (horas == -1) {
                seguirAgregandoHoras = false;
                continue;
            }
            
            System.out.print("Ingrese los minutos: ");
            int minutos = scanner.nextInt();
            
            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Horas o minutos inválidos");
                continue;
            }
            
            horasTotales += horas;
            minutosTotales += minutos;
            
            if (minutosTotales >= 60) {
                horasTotales += minutosTotales / 60;
                minutosTotales = minutosTotales % 60;
            }
        }
        
        System.out.println("Total de horas: " + horasTotales);
        System.out.println("Total de minutos: " + minutosTotales);
        
        scanner.close();
    }
}
