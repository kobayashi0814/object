package basic.figure2;

public class FigureSample {
    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(10, 20),
                new Triangle(50, 100),
                new Circle(20),
         };

        for (Figure figure:figures) {
            System.out.println(figure);
        }
    }
}
