
package test;
import abstracts.*;

public class TestAbstract {
    public static void main(String[] args) {
        GeometricFigure figure = new Rectangle("Rectangulo 1");
        
        figure.draw();
        
        figure = new Square("Cuadrado 1");
        figure.draw();
    }
}
