import Strategies.NormalVehicleDriveStrategy;
import Strategies.SuperVehicleDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle normalCar = new NormalCar(new NormalVehicleDriveStrategy());
        Vehicle normalBike = new NormalCar(new NormalVehicleDriveStrategy());
        Vehicle superCar =  new SuperCar(new SuperVehicleDriveStrategy());

        normalCar.drive();
        normalBike.drive();
        superCar.drive();
    }
}