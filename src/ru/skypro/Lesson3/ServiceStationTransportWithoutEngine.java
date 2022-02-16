package ru.skypro.Lesson3;

public class ServiceStationTransportWithoutEngine implements ServiceStation {

    @Override
    public void check(Car car) {
        System.out.println("Не обслуживается");
    }

    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Не обслуживается");
    }
}

