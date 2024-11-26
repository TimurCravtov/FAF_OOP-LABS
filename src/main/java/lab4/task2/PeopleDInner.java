package lab4.task2;

public class PeopleDInner implements Dineable {

    private int peopleDinnerServed = 0;
    @Override
    public void serveDinner(int cardId) {

        System.out.println("Serving dinner to humans with Car #" + cardId);
        peopleDinnerServed++;
    }

    public int getPeopleDinnerServed() {
        return peopleDinnerServed;
    }

}
