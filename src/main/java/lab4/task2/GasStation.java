package lab4.task2;

public class GasStation implements Refuelable {


    private int gasClientRefuelCount = 0;

    public int getGasClientRefuelCount() {
        return gasClientRefuelCount;
    }

    @Override
    public void refuel(int carId) {
        System.out.println("Refueling gas for Car #" + carId);
        gasClientRefuelCount++;

    }


}
