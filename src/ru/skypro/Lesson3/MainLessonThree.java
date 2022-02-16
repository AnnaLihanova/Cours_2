package ru.skypro.Lesson3;

public class MainLessonThree {
    public static void main(String[] args) {

        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStationForTransportWithEngine();
        ServiceStation station1 = new ServiceStationTransportWithoutEngine();
        station.check(car);
        station.check(car2);
        station1.check(bicycle);
        station1.check(bicycle2);
        station.check(truck);
        station.check(truck2);
        station1.check(car);
    }
}