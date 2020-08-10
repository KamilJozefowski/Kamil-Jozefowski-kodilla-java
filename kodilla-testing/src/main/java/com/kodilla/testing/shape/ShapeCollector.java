package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapesCollector = new ArrayList<>();

    public void ShapeCollector(){
    }

    public void addFigure(Shape shape){
        shapesCollector.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesCollector.contains(shape)){
            shapesCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber){
        Shape theShape = null;
        if ((figureNumber) >= 0 && (figureNumber) < shapesCollector.size()){
            theShape = shapesCollector.get(figureNumber);
        }
        return theShape;
    }

    public boolean showFigures(){
        boolean result = false;
        for (Shape theShape: shapesCollector) {
            System.out.println(theShape.getShapeName());
            result = true;
        }
        return result;
    }

    public  int getShapeQuantity(){
        return shapesCollector.size();
    }

}