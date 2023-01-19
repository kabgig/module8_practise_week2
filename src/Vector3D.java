public class Vector3D extends Vector{

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    double getLength() {
        return 0;
    }

    @Override
    String getVectorCords() {
        return null;
    }
}
