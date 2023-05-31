
package abstracts;

public abstract class GeometricFigure {
    protected String figureType;
    
    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }
    
    public abstract void draw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeometricFigure{");
        sb.append("figureType=").append(figureType);
        sb.append('}');
        return sb.toString();
    }
    
    
}
