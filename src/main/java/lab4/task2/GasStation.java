package lab4.task2;

public class GasStation implements Refuelable {


    private int refuelCount = 0;

    public int getRefuelCount() {
        return refuelCount;
    }

    @Override
    public void refuel(int carId) {
        System.out.println("Refueling gas for Car #" + carId);
        refuelCount++;

    }


}
