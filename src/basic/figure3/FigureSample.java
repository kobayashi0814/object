package basic.figure3;

class FigureSample {
    public static void main(String[] args) {
        IfGetArea[] figures = {
                new Rectangle(10, 20),
                new Triangle(50, 100),
                new Circle(20),
        };

        for (IfGetArea figure:figures) {
            System.out.println(figure);
        }
    }
}
