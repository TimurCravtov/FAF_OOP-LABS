package lab2.task1;

public class Display {
    private float height;
    private float width;
    private float ppi;
    private String model = "Unnamed";

    public Display(float height, float width, float ppi, String model) {
        this.height = height;
        this.width = width;
        this.ppi = ppi;
        this.model = model;
    }

    public Display() {}

    // Returns the difference in sizes between first - second screen areas
    float compareSize(Display second) {
        float intermediate = this.height * this.width - second.getHeight() * second.getWidth();
        double EPS = Math.pow(10, -6); // To avoid floating point precision issues

        if (Math.abs(intermediate) < EPS) {
            return 0;
        } else {
            return intermediate;
        }
    }

    void printComparisonSizeResult(Display second) {
        float comparisonResult = this.compareSize(second);

        if (comparisonResult == 0) {
            System.out.println("Display " + this.getModel() + " size is the same as Display " + second.getModel() + "'s.");
        } else if (comparisonResult > 0) {
            System.out.print("Display " + this.getModel() + " size is ");
            System.out.print(Colors.GREEN + "bigger" + Colors.RESET);
            System.out.println(" than Display " + second.getModel() + "'s by " + comparisonResult + " square inches.");
        } else {
            System.out.print("Display " + this.getModel() + " size is ");
            System.out.print(Colors.RED + "smaller" + Colors.RESET);   // Red for smaller
            System.out.println(" than Display " + second.getModel() + "'s by " + (-comparisonResult) + " square inches.");
        }
    }

    float comparePpi(Display second) {
        return this.ppi - second.getPpi();
    }

    void printComparisonPpiResult(Display second) {
        float comparisonResult = this.comparePpi(second);

        if (comparisonResult == 0) {
            System.out.println("Display " + this.getModel() + " has the same PPI as Display " + second.getModel() + "'s.");
        } else if (comparisonResult > 0) {
            System.out.print("Display " + this.getModel() + " has a ");
            System.out.print(Colors.GREEN + "higher" + Colors.RESET);
            System.out.println(" PPI than Display " + second.getModel() + "'s by " + comparisonResult + ".");
        } else {
            System.out.print("Display " + this.getModel() + " has a ");
            System.out.print(Colors.RED + "lower" + Colors.RESET);
            System.out.println(" PPI than Display " + second.getModel() + "'s by " + (-comparisonResult) + ".");
        }
    }

    void printComparisonFull(Display second) {
        this.printComparisonSizeResult(second);
        this.printComparisonPpiResult(second);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getPpi() {
        return ppi;
    }

    public void setPpi(float ppi) {
        this.ppi = ppi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
