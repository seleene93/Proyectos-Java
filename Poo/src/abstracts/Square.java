
package abstracts;

public class Square extends GeometricFigure {

    public Square(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("Se dibuja un: "+this.getClass().getSimpleName());
    }
    
    
    
}
