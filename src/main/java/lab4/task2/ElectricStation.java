package lab4.task2;

public class ElectricStation implements Refuelable {

    private int refuelCount = 0;

    @Override
    public void refuel(int carId) {
        System.out.println("Refueling electricity for Car #" + carId);
        refuelCount++;
    }

    public int getElectricClientRefuelCount() {
        return refuelCount;
    }
}
