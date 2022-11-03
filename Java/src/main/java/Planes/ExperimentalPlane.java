package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private final ExperimentalTypes experimentalTypes;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String planeModel, int maxSpeed, int maxFlightDistance,
                             int maxLoadCapacity, ExperimentalTypes experimentalTypes,
                             ClassificationLevel classificationLevel) {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                ", experimentalType='" + experimentalTypes + '\'' +
                '}';
    }
}
