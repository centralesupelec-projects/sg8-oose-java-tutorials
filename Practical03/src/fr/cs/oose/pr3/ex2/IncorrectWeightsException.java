package fr.cs.oose.pr3.ex2;

public class IncorrectWeightsException extends Exception {
    private float weightSum;

    public IncorrectWeightsException(float weightSum) {
        this.weightSum = weightSum;
    }

    public float getWeightSum() {
        return weightSum;
    }
}
