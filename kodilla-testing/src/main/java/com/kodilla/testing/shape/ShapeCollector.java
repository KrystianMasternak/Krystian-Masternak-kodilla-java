package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
       shapeList.add(shape);

    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
        }
        return true;
    }
    public Shape getFigure(int n){
        if(n >= 0 && n < shapeList.size()){
            return shapeList.get(n);
        }
        return null;
    }
    public void showFigures(){
        System.out.println(shapeList.toString());
    }
    public List<Shape> getShapeList(){
        return shapeList;
    }

}
