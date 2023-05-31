
package clases;

public class Rectangle {
    public int base;
    public int height;
    
    public Rectangle() {
        System.out.println(base);
        System.out.println(height);
    }
    
    public int area(int b, int h) {
        base = b;
        height = h;
        return b * h;
    }
    
    // THIS en Java para indicar que trabajamos con las variables de la clase Rectangle. Es lo mismo que el método de arriba
    /* public int area(int base, int height) {
        this.base = base; 
        this.height = height;
        return b * h;
    } */
    
    public int perimeter(int b, int h) {
        base = b;
        height = h;
        return 2 * (b + h);
    }
}
