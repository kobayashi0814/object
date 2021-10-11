package basic.figure1;

class Triangle {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return height * base / 2;
    }

    @Override
    public String toString() {
        return String.format("三角形 高さ:%.2f 底辺:%.2f 面積:%.2f",
                height, base, getArea());
    }
}


