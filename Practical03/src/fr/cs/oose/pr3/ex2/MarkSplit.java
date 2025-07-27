package fr.cs.oose.pr3.ex2;

public class MarkSplit {
    private float FE_mark;
    private float ME_mark;
    private float PW_mark;

    public MarkSplit(float FE_mark, float ME_mark, float PW_mark) {
        this.FE_mark = FE_mark;
        this.ME_mark = ME_mark;
        this.PW_mark = PW_mark;
    }

    public float getFE_mark() {
        return FE_mark;
    }

    public float getME_mark() {
        return ME_mark;
    }

    public float getPW_mark() {
        return PW_mark;
    }

    public void setFE_mark(int FE_mark) {
        this.FE_mark = FE_mark;
    }

    public void setME_mark(int ME_mark) {
        this.ME_mark = ME_mark;
    }

    public void setPW_mark(int PW_mark) {
        this.PW_mark = PW_mark;
    }

    public float CheckWeightSum() throws IncorrectWeightsException {
        float sum = FE_mark + ME_mark + PW_mark;
        if (sum == 1) {
            return sum;
        } else {
            throw new IncorrectWeightsException(sum);
        }
    }

    public String toString() {
        return "Marks: [FE:" + FE_mark + "|ME:" + ME_mark + "|PW:" + PW_mark;
    }
}
