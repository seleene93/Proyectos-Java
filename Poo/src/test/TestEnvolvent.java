
package test;

public class TestEnvolvent {
    public static void main(String[] args) {
        
        Integer n = 10;
        System.out.println("Entero -> " + n  + " -> " + (n + n));
        
        String ns = n.toString();
        System.out.println("Entero a String -> " +ns+ "-> " + (ns + ns));
        
        System.out.println("Entero a Double -> " + n.doubleValue());
        
        int n2 = n;
        
        n2 = Integer.parseInt(ns);
        System.out.println(n2 + n2);
        
        double nd = Double.parseDouble(ns);
        System.out.println(nd);
    }
}