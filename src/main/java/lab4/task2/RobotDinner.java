package lab4.task2;

public class RobotDinner implements Dineable {


    @Override
    public void serveDinner(int cardId) {
        System.out.println("Serving dinner to robots in Car #" + cardId);
        dinnerServed++;
    }

    private int dinnerServed = 0;
    public int getDinnerServed() {
        return dinnerServed;
    }

}
