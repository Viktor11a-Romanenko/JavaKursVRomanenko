package homework_28.task_01;

public class Rectangle {
    private double lenght;
    private double width;

    //task 1
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
        lenght = 1.0;
        width = 1.0;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник [" +
                "длина=" + lenght +
                ", ширина=" + width +
                ']';
    }

    // task 2


    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;

        return Double.compare(lenght, rectangle.lenght) == 0 && Double.compare(width, rectangle.width) == 0;
    }

}
