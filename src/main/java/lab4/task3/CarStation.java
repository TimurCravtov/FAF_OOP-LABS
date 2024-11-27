package lab4.task3;

import lab4.task1.NotJavaQueue;
import lab4.task1.SaneQueue;
import lab4.task2.Dineable;
import lab4.task2.Refuelable;

public class CarStation {

    private static int carStationCount = 0;
    private final int carStationId;

    private final Dineable dineableService;
    private final Refuelable refuelableService;

    private NotJavaQueue<Car> queue;

    public CarStation(Dineable dineableService, Refuelable refuelableService) {
        this.dineableService = dineableService;
        carStationId = carStationCount++;
        this.refuelableService = refuelableService;
        queue = new SaneQueue<>();
    }

    public int getDineableServiceClientCount() {
        return dineableService.getDinnerServed();
    }

    public int getRefuelableServiceClientCount() {
        return refuelableService.getRefuelCount();
    }

    public void serveCars() {
        while (queue.peek() != null) {
            Car carToServe = queue.dequeue();
            refuelableService.refuel(carToServe.getId());
            if (carToServe.isDining()) dineableService.serveDinner(carToServe.getId());
        }
    }
    public void addCar(Car car) {
        queue.enqueue(car);
    }

    public Class<?> getDinnerServiceType() {
        return dineableService.getClass();
    }

    public Class<?> getRefuelServiceType() {
        return refuelableService.getClass();
    }

    public int getCarStationId() {
        return this.carStationId;
    }

    public boolean dineableMatches(Car car) {
        return dineableService.matches(car);
    }

    public boolean refuelableMatches(Car car) {
        return refuelableService.matches(car);
    }


    public long getQueueLength() {
        return queue.getSize();
    }
}
