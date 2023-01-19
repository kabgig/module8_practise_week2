public class Car extends Transport{
   protected int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        }
        else return false;
    }

    @Override
    int getFuelLevel() {
        return fuel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
    //    private String carModel;
//
//    public Car(String carModel) {
//        this.carModel = carModel;
//    }
//
//    public class Engine {
//        boolean isWorking = false;
//        int horsepower;
//
//        public Engine(int horsepower) {
//            this.horsepower = horsepower;
//        }
//        public String startStopEngine(){
//            if (isWorking){
//                isWorking = false;
//                return "engine was stopped";
//            }
//            else {
//                isWorking = true;
//                return "engine was started";
//            }
//        }
//    }
}
