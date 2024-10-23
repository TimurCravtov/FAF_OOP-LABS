package lab2.task3;

import lab2.task1.Display;

import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays = new ArrayList<>();


    public Assistant(String name) {
        this.assistantName = name;
    }

    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }

    public void assist() {
        System.out.println("Hi, my name is " + assistantName + ". ");
        if (assignedDisplays.isEmpty()) {
            System.out.println("I am newbie here");
        }
        else if (assignedDisplays.size() == 1) {

            System.out.printf("I can show you the only monitor I have. It is %s which has size of %f square inches and %f PPI.\n",
                    assignedDisplays.getFirst().getModel(),
                    assignedDisplays.getFirst().getHeight() * assignedDisplays.getFirst().getWidth(),
                    assignedDisplays.getFirst().getPpi());
        }
        else {
            System.out.println("You want to know the difference between these displays? I'm happy to help! \n");
            for (int i = 0; i < assignedDisplays.size() - 1; i++) {
                assignedDisplays.get(i).printComparisonFull(assignedDisplays.get(i+1));
                System.out.println("\n");
            }
        }
    }

    public Display sellDisplay(Display d) {
        assignedDisplays.remove(d);
        return d;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public List<Display> getAssignedDisplays() {
        return assignedDisplays;
    }

    public void setAssignedDisplays(List<Display> assignedDisplays) {
        this.assignedDisplays = assignedDisplays;
    }
}
