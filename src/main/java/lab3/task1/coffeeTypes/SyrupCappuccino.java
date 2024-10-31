package lab3.task1.coffeeTypes;

import lab3.task1.enums.Intensity;
import lab3.task1.enums.SyrupType;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrupType;

    public SyrupCappuccino(Intensity intensity, int waterVolume, SyrupType syrupType) {
        super(intensity, waterVolume);
        this.syrupType = syrupType;
    }

    public SyrupType getSyrupType() {
        return syrupType;
    }

    public void setSyrupType(SyrupType syrupType) {
        this.syrupType = syrupType;
    }
}
