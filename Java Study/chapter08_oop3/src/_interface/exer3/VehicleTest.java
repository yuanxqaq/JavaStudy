package _interface.exer3;

/**
 * ClassName: VehicleTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/15 15:26
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","红色");
        vehicles[1] = new ElectricyVehicle("雅迪","蓝色");
        vehicles[2] = new Car("奔驰","黑色","沪Au888");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if (vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
