public class Rhombuses extends Quadrangle implements Figure{
    private double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return Math.pow(a, 2) * Math.sin(alpha);
    }


    @Override
    public double perimeter() {
        return a*4;
    }

    @Override
    public double getLargeDiagonal() {
        return alpha * Math.sqrt(2 + 2 * Math.cos(alpha));
    }

    @Override
    public double getHeight() {
        return area() / a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
