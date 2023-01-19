public abstract class Transport{

    protected  int fuel, speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }

    abstract boolean canMove(int n);
    abstract int getFuelLevel();
}
