
package test;
import enumeration.*;

public class TestEnumeration {
    public static void main(String[] args) {
        System.out.println(Days.FRIDAY);
        
        System.out.println(Continents.AMERICA.getCountries());
        
        Continents continent = Continents.AMERICA;
        System.out.println(continent.getCountries());
       
    }
}
