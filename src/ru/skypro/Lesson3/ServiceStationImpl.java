package ru.skypro.Lesson3;

public class ServiceStationImpl implements ServiceStation {
    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
            if (transport instanceof Car) {
                transport.checkEngine();
            }
            if (transport instanceof Truck) {
                transport.checkEngine();
                transport.checkTrailer();
            }

        }
    }
}

