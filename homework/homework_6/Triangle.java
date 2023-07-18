package homework.homework_6;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        if (a < b+c && b < a+c && c < a+b) {
        this.a = a;
        this.b = b;
        this.c = c;
    } else System.out.println("Such a triangle doesn't exist");
}

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getPerimeter(int a, int b, int c) {
        int p = a + b + c;
        return p;
    }

    public double getSquare(int a, int b, int c) {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
