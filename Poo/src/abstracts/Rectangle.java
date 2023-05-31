
package abstracts;

public class Rectangle extends GeometricFigure{

    public Rectangle(String figureType) {
        super(figureType);
    }
    
    @Override
    public void draw() {
        System.out.println("Se dibuja un: "+getClass().getSimpleName());
    }
}
