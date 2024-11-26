package lab4.task2;

public class RobotDinner implements Dineable {

    private int robotDinnerServed = 0;

    @Override
    public void serveDinner(int cardId) {
        System.out.println("Serving dinner to robots in Car #" + cardId);
        robotDinnerServed++;
    }

    public int getRobotDinnerServed() {
        return robotDinnerServed;
    }
}
