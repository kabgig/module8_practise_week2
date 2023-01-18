import java.util.ArrayList;
import java.util.List;

public class Vector2D extends Vector{

    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    double getLength() {
        var res = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return Math.abs(res);
    }


    @Override
    String getVectorCords() {
        return  x1 + " " +
                y1 + " " +
                x2 + " " + y2;
    }

    double getscalarProduct(Vector2D vector){

    }
}
