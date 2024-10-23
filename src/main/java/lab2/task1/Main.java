package lab2.task1;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(20.22f, 23.99f, 110, "Samsung S34C650UA");
        Display d2 = new Display(18.93f, 28.20f, 93, "Samsung S32A600NWI");
        Display d3 = new Display(21.78f, 31.76f,109, "Philips 27M2N8500");

        d1.printComparisonFull(d2);
        d3.printComparisonSizeResult(d2);
        d3.printComparisonPpiResult(d1);
    }
}
