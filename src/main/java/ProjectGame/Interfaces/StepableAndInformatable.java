package ProjectGame.Interfaces;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public interface StepableAndInformatable {
    void step(ArrayList<Unit> units1, ArrayList<Unit> units2);
    String getInfo();
}
