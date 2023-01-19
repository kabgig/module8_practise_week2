public class Parallelogram extends Quadrangle implements Figure {
    private double alpha, beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a * b * Math.sin(alpha);
    }

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(beta));
    }

    @Override
    public double getHeight() {
        return alpha * Math.sin(alpha);
    }

    @Override
    public String getColor() {
        return color;
    }
}
