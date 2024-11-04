package lab2.task3;

import lab2.task1.Display;

public class Main {
    public static void main(String[] args) {
        Assistant assistant = new Assistant("John");

        Display d1 = new Display(20.22f, 23.99f, 110, "Samsung S34C650UA");
        Display d2 = new Display(18.93f, 28.20f, 93, "Samsung S32A600NWI");
        Display d3 = new Display(21.78f, 31.76f,109, "Philips 27M2N8500");

        assistant.assignDisplay(d1);
        assistant.assignDisplay(d2);
        assistant.assignDisplay(d3);

        assistant.assist();

        Display soldDisplay = assistant.sellDisplay(d2);
        assistant.assist();

        System.out.println("Assistant " + assistant.getAssistantName() + " sold " + soldDisplay.getModel());
    }
}
