package ProjectGame.Interfaces;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public interface StepableAndInformatable {
    void step(ArrayList<Unit> units);
    String getInfo();
}
