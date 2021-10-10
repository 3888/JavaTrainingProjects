package Desing_Patterns.structual.Bridge;

public abstract class Shape {
    //    protected DrawAPI drawAPI;
    DrawAPI drawAPI;

    //    protected Shape(DrawAPI drawAPI){
    Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}