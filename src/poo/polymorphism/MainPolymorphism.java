package poo.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        FigureGeometrique figureGeometrique = new FigureGeometrique();
        FigureGeometrique figure1 = new Carre();
        FigureGeometrique figure2 = new Triangle();
    }
}
